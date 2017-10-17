
package contorl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import support.DB;

public class m_verification {
    
    public boolean x = false;
    
    public boolean selectlog(JTextField tname,JTextField tpassword) throws Exception{
        
        String sql = "SELECT * FROM LOGIN";

        try(
            Statement stmt  = DB.getInstant().getConnection().createStatement();        
            ResultSet rs    = stmt.executeQuery(sql)){
            
            if(tname.getText().equals(rs.getString("log_user")) && tpassword.getText().equals(rs.getString("log_password"))){
                x = true;
                JOptionPane.showMessageDialog(null,"LOGIN SUCESS.","Login",JOptionPane.INFORMATION_MESSAGE);
                
            }else{
                JOptionPane.showMessageDialog(null,"Error. Please try again.","Login",JOptionPane.WARNING_MESSAGE);
                
            }
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return x;
    }
  
}
