package contorl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import support.DB;

/**
 *
 * @author clktrro01
 */
public class ideal {

    public DB db;
    
    public void dataInsert(String date, String stime, int itime, String commet,String type) throws Exception{
        db = DB.getInstant();
       
        String sql = "INSERT INTO IDEAL (i_date, i_stime, i_itime,i_commet,i_log_id) VALUES (?,?,?,?,?)";
        try{  
           
            PreparedStatement pstmt = db.getConnection().prepareStatement(sql);
              
            pstmt.setString(1, date);  
            pstmt.setString(2, stime);
            pstmt.setInt(3, itime);
            pstmt.setString(4, commet);
            pstmt.setString(5, type);
            pstmt.executeUpdate();  
            
        }catch(SQLException e){
            System.out.println(e.getMessage());  
        }
        System.out.println("Database Update Sucessfull.");
    }
    
    public int sum_of_Ideal() throws Exception{
        
        String sql = "SELECT SUM(i_itime) AS \"T_TOTAL\" FROM lastdate";
        int total = 0;
        try{
            db = DB.getInstant();
            
            Statement stmt = db.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(sql);  
            
            total = rs.getInt("T_TOTAL");
           
        }catch(SQLException e){
            System.out.println(e.getMessage());  
        }
        System.out.println("Complted");
        
        return total;
    }
    
    

    
    
    
    
}
