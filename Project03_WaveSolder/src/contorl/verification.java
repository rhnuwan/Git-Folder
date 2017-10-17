package contorl;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import support.DB;
/**
 *
 * @author Harsha
 */
public class verification {

    public DB db;
    
    public void dataInsert(String date, String stime, int vtime, String log_id) throws Exception{
        
        String sql = "INSERT INTO VERIFICATION (v_date, v_stime, v_vtime,v_log_id) VALUES (?,?,?,?)";
        try{
            db = DB.getInstant();
          
            PreparedStatement pstmt = db.getConnection().prepareStatement(sql);  
            pstmt.setString(1, date);  
            pstmt.setString(2, stime);
            pstmt.setInt(3, vtime);
            pstmt.setString(4, log_id);
            pstmt.executeUpdate();  
            
        }catch(SQLException e){
            System.out.println(e.getMessage());  
        }
        System.out.println("Update verification database....");
    }   

}