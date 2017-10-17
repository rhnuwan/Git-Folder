package contorl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import support.DB;
/**
 *
 * @author clktrro01
 */
public class dlogin {
 

    public void selectlog(JTextField tname,JTextField tpassword) throws Exception{
        
        String sql = "SELECT * FROM LOGIN";

        try(
            Statement stmt  = DB.getInstant().getConnection().createStatement();        
            ResultSet rs    = stmt.executeQuery(sql)){
            
            if(tname.getText().equals(rs.getString("log_user")) && tpassword.getText().equals(rs.getString("log_password"))){
                
                JOptionPane.showMessageDialog(null,"LOGIN SUCESS.","Login",JOptionPane.INFORMATION_MESSAGE);
                
            }else{
                JOptionPane.showMessageDialog(null,"Error. Please try again.","Login",JOptionPane.WARNING_MESSAGE);
            }
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public boolean selectlog2(JTextField tname,JTextField tpassword) throws Exception{
        
        String sql = "SELECT * FROM LOGIN";
        boolean pass = false;

        try(
            Statement stmt  = DB.getInstant().getConnection().createStatement();        
            ResultSet rs    = stmt.executeQuery(sql)){
            
            if(tname.getText().equals(rs.getString("log_user")) && tpassword.getText().equals(rs.getString("log_password"))){
                
                pass = true;
                JOptionPane.showMessageDialog(null,"LOGIN SUCESS.","Login",JOptionPane.INFORMATION_MESSAGE);
                
            }else{
                pass = false;
                JOptionPane.showMessageDialog(null,"Error. Please try again.","Login",JOptionPane.WARNING_MESSAGE);
            }
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return pass;
    }
  
}
