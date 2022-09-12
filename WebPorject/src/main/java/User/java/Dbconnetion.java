package User.java;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnetion {
private static Connection con;
    
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/loginonline","root","123456");
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
