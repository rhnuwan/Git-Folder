package support;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DB {
       
    private static DB instant = null;
    private Connection conn;
    private Statement statement;
    
    public DB() throws Exception {
        Class.forName("org.sqlite.JDBC");
        char c = File.separatorChar;
        String file = "src/../data/db01.db";
        file = file.replace("/", "" + c);
        file = file.replace("\\", "" + c);
        if (new File(file).exists()) {
            String url = "jdbc:sqlite:" + file;
            this.conn = DriverManager.getConnection(url);
            this.statement = conn.createStatement();
            System.out.println("Connection to SQLite has been established.");
        } else {
            throw new Exception("Database File not found");
        }
    }
    
    public Statement getStatement(){
        return this.statement;
    }
    public Connection getConnection(){
        return this.conn;
    }
    
    public static DB getInstant() throws Exception {
        if (DB.instant == null) {
            DB.instant = new DB();
            return DB.instant;
        }
        return DB.instant;
    }
    
    
    
}
