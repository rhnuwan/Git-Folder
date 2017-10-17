package contorl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import support.DB;
/**
 *
 * @author Harsha
 */
public class breakdown {
  
    public void dataInsert(String date, String stime, int wtime, int rtime, int log_id) throws Exception{
        
        String sql = "INSERT INTO BREAKDOWN (b_date, b_stime, b_wtime, b_rtime, b_log_id) VALUES (?,?,?,?,?)";
        try{

            PreparedStatement pstmt = DB.getInstant().getConnection().prepareStatement(sql);  
            pstmt.setString(1, date);  
            pstmt.setString(2, stime);
            pstmt.setInt(3, wtime);
            pstmt.setInt(4, rtime);
            pstmt.setInt(5, log_id);
            pstmt.executeUpdate();  
            
        }catch(SQLException e){
            System.out.println(e.getMessage());  
        }
        System.out.println("Update database....");
    }
    
    
    
}
