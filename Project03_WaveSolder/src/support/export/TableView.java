
package support.export;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import javax.swing.JOptionPane;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import support.DB;

public class TableView {
    
    public String timeperiod;
    public String mode;
    public final JTable table;

    public DefaultTableModel model;
    public DefaultTableModel model1;
    public DB db;
    
    public String period;
    
    public TableView(String mode,String timeperiod,JTable table){
        this.mode = mode;
        this.timeperiod = timeperiod;
        this.table = table;
    }
    
    public String timePeriod(String mode){
        if("Today".equals(timeperiod)){
            period = "DATE("+mode + ") >= DATE('now')";
        }
        else if("This Week".equals(timeperiod)){
            period = "DATE("+mode + ") >= DATE('now', 'weekday 0', '-7 days')";
        }
        else if("Last Week".equals(timeperiod)){
            period = "DATE("+mode + ") >= DATE('now', 'weekday 0', '-14 days')";
        }
        else if("Last 2 Week".equals(timeperiod)){
            period = "DATE("+mode + ") >= DATE('now', 'weekday 0', '-21 days')";
        }
        else if("Last Month".equals(timeperiod)){
            period = "DATE("+mode + ") >= DATE('now', 'start of month','+0 month','-1 day')";
        }
        else if("Last 2 Month".equals(timeperiod)){
            period = "DATE("+mode + ") >= DATE('now', 'start of month','-1 month','-1 day')";
        }
        else if("Last 3 Month".equals(timeperiod)){
            period = "DATE("+mode + ") >= DATE('now', 'start of month','-2 month','-1 day')";
        }
        else if("Last 4 Month".equals(timeperiod)){
            period = "DATE("+mode + ") >= DATE('now', 'start of month','-3 month','-1 day')";
        }
        else if("Last 6 Month".equals(timeperiod)){
            period = "DATE("+mode + ") >= DATE('now', 'start of month','-5 month','-1 day')";
        }
        else if("This Year".equals(timeperiod)){
            period = "DATE(v_date) >= DATE('now', 'start of year','+0 years','-1 day')";
        }
            
            
        return period;
    }

    public ArrayList<Object_verification> vrList(){
        ArrayList<Object_verification> usersList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM VERIFICATION WHERE "+ timePeriod("v_date");
            db = DB.getInstant();
            ResultSet rs = db.getStatement().executeQuery(sql);            
            Object_verification user;
            while(rs.next()){
                user = new Object_verification(rs.getInt("v_id"),rs.getString("v_date"),rs.getString("v_vtime"),rs.getString("v_log_id"));
                usersList.add(user);                
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }        
        return usersList;        
    }

    public void show_vr(){        
        ArrayList<Object_verification> list = vrList();
        this.model = (DefaultTableModel)table.getModel();        
        model.addColumn("ID");
        model.addColumn("Date");
        model.addColumn("Total");
        model.addColumn("User");
        Object[]row = new Object[4];
        for(int i = 0; i < list.size();i++){
            row[0]=list.get(i).getid();
            row[1]=list.get(i).getdate();
            row[2]=list.get(i).gettotaltime();
            row[3]=list.get(i).getuser();
            model.addRow(row);
        }        
 
    }
    
    public ArrayList<Object_Ideal> idList(){
        ArrayList<Object_Ideal> idealList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Ideal WHERE "+ timePeriod("i_date");
            db = DB.getInstant();
            ResultSet rs = db.getStatement().executeQuery(sql);            
            Object_Ideal id;
            while(rs.next()){
                id = new Object_Ideal(rs.getInt("i_id"),rs.getString("i_date"),rs.getString("i_itime"),rs.getString("i_commet"),rs.getString("i_log_id"));
                idealList.add(id);                
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }        
        return idealList;   
    }

    public void show_id(){        
        ArrayList<Object_Ideal> list = idList();
        model = (DefaultTableModel)table.getModel(); 
        
        model.addColumn("ID");
        model.addColumn("Date");
        model.addColumn("Ideal Total");
        model.addColumn("Comment");
        model.addColumn("User");
        
        Object[]row = new Object[5];
        for(int i = 0; i < list.size();i++){
            row[0]=list.get(i).getid();
            row[1]=list.get(i).getdate();
            row[2]=list.get(i).getidealtime();
            row[3]=list.get(i).getcomment();
            row[4]=list.get(i).getuser();
            model.addRow(row);
        }        
 
    }
    
    public ArrayList<Object_Clean> clList(){
        ArrayList<Object_Clean> cleanList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM CLEAN WHERE "+ timePeriod("c_date");
            db = DB.getInstant();
            ResultSet rs = db.getStatement().executeQuery(sql);            
            Object_Clean cl;
            while(rs.next()){
                cl = new Object_Clean(rs.getInt("c_id"),rs.getString("c_date"),rs.getString("c_atime"),rs.getString("c_dtime"),rs.getString("c_log_id"));
                cleanList.add(cl);                
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }        
        return cleanList;   
    }

    public void show_cl(){        
        ArrayList<Object_Clean> list = clList();
        model = (DefaultTableModel)table.getModel(); 
        
        model.addColumn("ID");
        model.addColumn("Date");
        model.addColumn("Time");
        model.addColumn("Get Time");
        model.addColumn("User");
        
        Object[]row = new Object[5];
        for(int i = 0; i < list.size();i++){
            row[0]=list.get(i).getid();
            row[1]=list.get(i).getdate();
            row[2]=list.get(i).gettime();
            row[3]=list.get(i).getgettime();
            row[4]=list.get(i).getuser();
            model.addRow(row);
        }        
 
    }

    public ArrayList<Object_Breakdown> bkList(){
        ArrayList<Object_Breakdown> breakdownList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM BREAKDOWN WHERE "+ timePeriod("b_date");
            db = DB.getInstant();
            ResultSet rs = db.getStatement().executeQuery(sql);            
            Object_Breakdown bk;
            while(rs.next()){
                bk = new Object_Breakdown(rs.getInt("b_id"),rs.getString("b_date"),rs.getString("b_wtime"),rs.getString("b_rtime"),rs.getString("b_log_id"));
                breakdownList.add(bk);                
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }        
        return breakdownList;   
    }

    public void show_bk(){        
        ArrayList<Object_Breakdown> list = bkList();
        model = (DefaultTableModel)table.getModel(); 
        
        model.addColumn("ID");
        model.addColumn("Date");
        model.addColumn("Wait Time");
        model.addColumn("Repar Time");
        model.addColumn("User");
        
        Object[]row = new Object[5];
        for(int i = 0; i < list.size();i++){
            row[0]=list.get(i).getid();
            row[1]=list.get(i).getdate();
            row[2]=list.get(i).getwaitingtime();
            row[3]=list.get(i).getreparingtime();
            row[4]=list.get(i).getuser();
            model.addRow(row);
        }        
 
    }    

    public ArrayList<Object_Profile> prList(){
        ArrayList<Object_Profile> profileList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM PROFILE WHERE "+ timePeriod("p_date");
            db = DB.getInstant();
            ResultSet rs = db.getStatement().executeQuery(sql);            
            Object_Profile pr;
            while(rs.next()){
                pr = new Object_Profile(rs.getInt("p_id"),rs.getString("p_date"),rs.getString("p_job"),rs.getString("p_item"),rs.getString("p_atime"),rs.getString("p_prtime"),rs.getString("p_log_id"));
                profileList.add(pr);                
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }        
        return profileList;   
    }

    public void show_pr(){        
        ArrayList<Object_Profile> list = prList();
        model = (DefaultTableModel)table.getModel(); 
        
        model.addColumn("ID");
        model.addColumn("Date");
        model.addColumn("Job No");
        model.addColumn("Item No");
        model.addColumn("Time");
        model.addColumn("Profile Time");
        model.addColumn("User");
        
        Object[]row = new Object[7];
        for(int i = 0; i < list.size();i++){
            row[0]=list.get(i).getid();
            row[1]=list.get(i).getdate();
            row[2]=list.get(i).getjobno();
            row[3]=list.get(i).getitemno();
            row[4]=list.get(i).gettime();
            row[5]=list.get(i).getprofiltime();   
            row[6]=list.get(i).getuser();
            model.addRow(row);
        }        
 
    }  

    public ArrayList<Object_Run> rnList(){
        ArrayList<Object_Run> runList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM RUN WHERE "+ timePeriod("r_date");
            db = DB.getInstant();
            ResultSet rs = db.getStatement().executeQuery(sql);            
            Object_Run rn;
            while(rs.next()){
                rn = new Object_Run(rs.getInt("r_id"),rs.getString("r_date"),rs.getString("r_jobno"),rs.getString("r_itemno"),rs.getString("r_proqty"),rs.getString("r_wrong"),rs.getString("r_rtime"),rs.getString("r_log_id"));
                runList.add(rn);                
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }        
        return runList;   
    }

    public void show_rn(){        
        ArrayList<Object_Run> list = rnList();
        model = (DefaultTableModel)table.getModel(); 
        
        model.addColumn("ID");
        model.addColumn("Date");
        model.addColumn("Job No");
        model.addColumn("Item No");
        model.addColumn("Time");
        model.addColumn("QTY");
        model.addColumn("Wrong");
        model.addColumn("User");
        
        Object[]row = new Object[8];
        for(int i = 0; i < list.size();i++){
            row[0]=list.get(i).getid();
            row[1]=list.get(i).getdate();
            row[2]=list.get(i).getjobno();
            row[3]=list.get(i).getitemno();
            row[4]=list.get(i).gettime();
            row[5]=list.get(i).getqty();  
            row[6]=list.get(i).getwrongqty();
            row[7]=list.get(i).getuser();
            model.addRow(row);
        }        
 
    }  
    
    public void Start(){
        
        if("Verification".equals(mode)){
            show_vr();
        }else if("Cleaning".equals(mode)){
            show_cl();   
        }else if("Profile".equals(mode)){
            show_pr();   
        }else if("Ideal".equals(mode)){
            show_id();   
        }else if("Breakdown".equals(mode)){
            show_bk();   
        }else if("Run".equals(mode)){
            show_rn();   
        }else if("On Hold".equals(mode)){
            show_cl();   
        }
        
    }
    
    public void Reset(){
        table.setModel(new DefaultTableModel());
    }

    public void setExport() throws Exception{
        
        char c = File.separatorChar;
        String FILE_NAME = "src/../data/WSPM Export.xlsx";
        FILE_NAME = FILE_NAME.replace("/", "" + c);
        FILE_NAME = FILE_NAME.replace("\\", "" + c);

        Workbook wb = new HSSFWorkbook();
        
        CreationHelper createhelper = wb.getCreationHelper();
        Sheet sheet = wb.createSheet("new sheet");
        
        Row row = null;
        Cell cell = null;
        
            for (int i=0; i < table.getModel().getRowCount(); i++) {
                row = sheet.createRow(i);

                for (int j=0; j < table.getModel().getColumnCount(); j++) {

                    cell = row.createCell(j);
                    cell.setCellValue((String) table.getValueAt(i, j));
                }
            }


            try (FileOutputStream out = new FileOutputStream(new File(FILE_NAME))) {
                wb.write(out);
                wb.close();
            }
    }
    
    
    public void exort() throws Exception{
        
        char c = File.separatorChar;
        String FILE_NAME = "src/../data/WSPM Export.xlsx";
        FILE_NAME = FILE_NAME.replace("/", "" + c);
        FILE_NAME = FILE_NAME.replace("\\", "" + c);
        
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet spreadsheet = workbook.createSheet("Sheet Name");
        
        
        XSSFRow row;
        
        
        

        try (FileOutputStream out = new FileOutputStream(new File(FILE_NAME))) {
            
            workbook.write(out);
            workbook.close();
            
        }
    }
}
