package Dbcon;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class connection
 */

	public class connection {
			
				try {
						Class.forName("com.mysql.cj.jdbc.Driver");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			public boolean checkUser(String uname,String upass) {
				
				try {
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","passmysql");
					PreparedStatement ps=con.prepareStatement("select flag from webUsers where uname=? and upass=?");
					ps.setString(1, uname);
					ps.setString(2, upass);
					ResultSet rs=ps.executeQuery();
					if (rs.next()) {
							return true;
				
					}else {
						return false;
					}
				} catch (Exception e) {
					e.printStackTrace();
					return false;
				}
				
			}
			public boolean checkFlag(String uname,String upass) {
				
				try {
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","passmysql");
					PreparedStatement ps=con.prepareStatement("select flag from webUsers where uname=? and upass=?");
					ps.setString(1, uname);
					ps.setString(2, upass);
					ResultSet rs=ps.executeQuery();
					int f=0;
					if(rs.next()) {
						 f=rs.getInt(1);
					}
					if (f==0) {
					 con= DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","passmysql");
						PreparedStatement psu=con.prepareStatement("update webUsers set flag=1 where uname=? and upass=?");
						psu.setString(1, uname);
						psu.setString(2, upass);
						psu.executeUpdate();
						return true;
					}else {
						return false;
					}
				} catch (Exception e) {
					e.printStackTrace();
					return false;
				}
			}
			public boolean reSetFlag(String uname,String upass) {
				try {
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","passmysql");
					PreparedStatement psr=con.prepareStatement("update webUsers set flag=0 where uname=? and upass=?");
					psr.setString(1, uname);
					psr.setString(2, upass);
					psr.executeUpdate();
					return true;
				} catch (Exception e) {
					e.printStackTrace();
					return false;
				}
			}
			public int register(String fullName,String uname,String upass,String city,long mobileNum) {
				try {
					Connection con=	DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","passmysql");
					PreparedStatement psc1=con.prepareStatement("select uname from webUsers where uname=?");
					psc1.setString(1, uname);
					ResultSet res1=psc1.executeQuery();
					if (!res1.next()) {
						con=	DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","passmysql");
						PreparedStatement psc2=con.prepareStatement("select mobileNum from webUsers where mobileNum=?");
						psc2.setLong(1, mobileNum);
						ResultSet res2=psc2.executeQuery();
						if (!res2.next()) {
							con=	DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","passmysql");
							PreparedStatement psre=con.prepareStatement("insert into webUsers values (?,?,?,?,?,?)");
							psre.setString(1, fullName);
							psre.setString(2, uname);
							psre.setString(3, upass);
							psre.setString(4, city);
							psre.setLong(5, mobileNum);
							psre.setInt(6, 0);
							int i=psre.executeUpdate();
							return i;
						}else {
							return 3;
						}
						
					}else {
						return 2;
					}
				
				} catch (Exception e) {
					e.printStackTrace();
					return 0;
				}
			}
			
	}
	}
