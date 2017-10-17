package contorl;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import support.DB;
/**
 *
 * @author Harsha
 */
public class profile {
    
    public void dataInsert(String date, String job, String item, int pcb, String stime, int prtime, int atime, int log_id) throws Exception{
        
        String sql = "INSERT INTO PROFILE (p_date, p_job, p_item, p_pcb, p_stime, p_prtime, p_atime, p_log_id) VALUES (?,?,?,?,?,?,?,?)";
        try{
            
            PreparedStatement pstmt = DB.getInstant().getConnection().prepareStatement(sql);  
            pstmt.setString(1, date);  
            pstmt.setString(2, job);
            pstmt.setString(3, item);
            pstmt.setInt(4, pcb);
            pstmt.setString(5, stime);
            pstmt.setInt(6, prtime);
            pstmt.setInt(7, atime);
            pstmt.setInt(8, log_id);
            pstmt.executeUpdate();  
            
        }catch(SQLException e){
            System.out.println(e.getMessage());  
        }
        System.out.println("Complted");
    }
    
    public void export() throws Exception{
    
    char c = File.separatorChar;
    String FILE_NAME = "src/../data/Data_Collection.xlsx";
    FILE_NAME = FILE_NAME.replace("/", "" + c);
    FILE_NAME = FILE_NAME.replace("\\", "" + c);

    XSSFWorkbook workbook = new XSSFWorkbook();    

    XSSFSheet spreadsheet = workbook.createSheet("Profile");
    XSSFRow row=spreadsheet.createRow(0);
      XSSFCell cell;
      cell=row.createCell(0);
      cell.setCellValue("ID");
      cell=row.createCell(1);
      cell.setCellValue("DATE");
      cell=row.createCell(2);
      cell.setCellValue("JOB ID");
      cell=row.createCell(3);
      cell.setCellValue("ITEM NO");
      cell=row.createCell(4);
      cell.setCellValue("START TIME");
      cell=row.createCell(5);
      cell.setCellValue("PRO. TIME");
      cell=row.createCell(6);
      cell.setCellValue("ACT. TIME");
      cell=row.createCell(7);
      cell.setCellValue("USER LOG");
      
      
      
      String sql = "SELECT * FROM PROFILE";
      try(
            Statement stmt  = DB.getInstant().getConnection().createStatement();        
            ResultSet rs    = stmt.executeQuery(sql)){
          
            int i=1;
            while(rs.next())
            {
                row=spreadsheet.createRow(i);
                cell=row.createCell(0);
                cell.setCellValue(rs.getInt("p_id"));
                cell=row.createCell(1);
                cell.setCellValue(rs.getString("p_date"));
                cell=row.createCell(2);
                cell.setCellValue(rs.getString("p_job"));
                cell=row.createCell(3);
                cell.setCellValue(rs.getString("p_item"));
                cell=row.createCell(4);
                cell.setCellValue(rs.getString("p_stime"));
                cell=row.createCell(5);
                cell.setCellValue(rs.getString("p_prtime"));
                cell=row.createCell(6);
                cell.setCellValue(rs.getString("p_atime"));
                cell=row.createCell(7);
                cell.setCellValue(rs.getString("p_log_id"));
                i++;
           }

        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        try (FileOutputStream out = new FileOutputStream(
                new File(FILE_NAME))) {
            workbook.write(out);
            workbook.close();
        }
        System.out.println("exceldatabase.xlsx written successfully");
        JOptionPane.showConfirmDialog(null,"Completed","Create Sheet",JOptionPane.DEFAULT_OPTION);
    
    }

}
