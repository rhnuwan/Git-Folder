package contorl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import support.DB;

/**
 *
 * @author Harsha
 */
public class clean {

    
    public void dataInsert(String date, String stime, int dtime, int atime) throws Exception{
        
        String sql = "INSERT INTO CLEAN (c_date, c_stime, c_dtime,c_atime) VALUES (?,?,?,?)";
        try{
            
            PreparedStatement pstmt = DB.getInstant().getConnection().prepareStatement(sql);  
            pstmt.setString(1, date);  
            pstmt.setString(2, stime);
            pstmt.setInt(3, dtime);
            pstmt.setInt(4, atime);
            pstmt.executeUpdate();  
            
        }catch(SQLException e){
            System.out.println(e.getMessage());  
        }
        System.out.println("Database Update...");
    }

}
