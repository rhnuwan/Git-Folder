package contorl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author Harsha
 */
public class login {
    private Connection connect(){
        Connection conn = null;
        try{
            String url = "jdbc:sqlite:D:/Harsha/Test/Project02/data/db.db";
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
    }
//    public void selectAll(){
//        String sql = "SELECT name, password FROM Login";
//        try(Connection conn = this.connect();
//            Statement stmt  = conn.createStatement();
//            ResultSet rs    = stmt.executeQuery(sql)){
//            while (rs.next()) {
//                System.out.println(rs.getString("name") + "\t" + rs.getString("password") + "\t");
//            }
//        }catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//        
//    }
    public void selectlog(JTextField tname,JTextField tpassword){
        String sql = "SELECT name, password FROM Login";
        try(Connection conn = this.connect();
            Statement stmt  = conn.createStatement();
            ResultSet rs    = stmt.executeQuery(sql)){
            if(tname.getText().equals(rs.getString("name")) && tpassword.getText().equals(rs.getString("password"))){
                JOptionPane.showMessageDialog(null,"LOGIN SUCESS.","Login",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Error. Please try again.","Login",JOptionPane.WARNING_MESSAGE);
            }
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
