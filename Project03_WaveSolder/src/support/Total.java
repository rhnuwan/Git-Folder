
package support;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

public class Total implements Runnable {

    private final JTextField ideal;
    private final JTextField reparing;
    public int reparingtime = 0;
    public int idealtime = 0;
    
    public Total(JTextField jideal, JTextField jreparing) {
      this.ideal = jideal;
      this.reparing = jreparing;
        new Thread(this).start();
    }
    
    public String getTimeFormat(int x) {
        int h = x / (60 * 60);
        int m = (x % (60 * 60)) / 60;
        int s = (x % (60 * 60)) % 60;
        return String.format("%02d:%02d:%02d", h, m, s);

    }
    
    @Override
    public void run() {

        while (true) {
            ideal.setText(getTimeFormat(idealtime));
            reparing.setText(getTimeFormat(reparingtime));
            
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Timer.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                idealtime = sum_of_Ideal();
                reparingtime = sum_of_ReparingTime();
            } catch (Exception ex) {
                Logger.getLogger(Total.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public int sum_of_Ideal() throws Exception{
        
        String sql = "SELECT SUM(i_itime) AS \"T_TOTAL\" FROM LASTDAY_OF_IDEAL";
        int total = 0;
        try{
            DB db = DB.getInstant();
            
            Statement stmt = db.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(sql);  
            
            total = rs.getInt("T_TOTAL");
           
        }catch(SQLException e){
            System.out.println(e.getMessage());  
        }

        
        return total;
    }
    
    public int sum_of_ReparingTime() throws Exception{
    
        String sql = "SELECT SUM(b_rtime) AS \"T_TOTAL\" FROM LASTDAY_OF_REPARING";
        int total = 0;
        try{
            DB db = DB.getInstant();
            
            Statement stmt = db.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(sql);  
            
            total = rs.getInt("T_TOTAL");
           
        }catch(SQLException e){
            System.out.println(e.getMessage());  
        }

        
        return total;
        
    }
    
    

}
