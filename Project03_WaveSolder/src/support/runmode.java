
package support;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class runmode {
    public void dataInsert(String date, String job, String item, int proqty, int wrong, int rtime) throws Exception{
        
        String sql = "INSERT INTO RUN (r_date, r_jobno, r_itemno, r_proqty, r_wrong, r_rtime) VALUES (?,?,?,?,?,?)";
        try{

            PreparedStatement pstmt = DB.getInstant().getConnection().prepareStatement(sql);  
            pstmt.setString(1, date);  
            pstmt.setString(2, job);
            pstmt.setString(3, item);
            pstmt.setInt(4, proqty);
            pstmt.setInt(5, wrong);
            pstmt.setInt(6, rtime);
            pstmt.executeUpdate();  
            
        }catch(SQLException e){
            System.out.println(e.getMessage());  
        }
        System.out.println("Update database....");
    }

    
    
    
    
    
}
