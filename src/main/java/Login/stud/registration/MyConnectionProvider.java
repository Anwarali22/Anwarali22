package Login.stud.registration;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnectionProvider implements MyProvider {

	
	
	
	static Connection con=null;
	public static Connection getcon() {
		
		try {
			Class .forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(connurl,username,pwd); 
			//con=DriverManager.getConnection("jdbc:mysql://localhost:3306/loginDB","root","123456");
		
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return con;
		
		
		
		
		 
	}
}
