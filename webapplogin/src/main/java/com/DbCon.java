package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DbCon {
	private static DbCon instance;
	public DbCon() {
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static synchronized DbCon getInstance(){
        if (null!=instance){
            return instance;
        }else {
            instance=new DbCon();
            return instance;
        }
    }
	
	public boolean checkUser(String uname,String upass) {
		
		try {
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","passmysql");
			PreparedStatement ps=con.prepareStatement("select flag from eshopusers where uname=? and upass=?");
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
			PreparedStatement ps=con.prepareStatement("select flag from eshopusers where uname=? and upass=?");
			ps.setString(1, uname);
			ps.setString(2, upass);
			ResultSet rs=ps.executeQuery();
			int f=0;
			if(rs.next()) {
				 f=rs.getInt(1);
			}
			if (f==0) {
			 con= DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","passmysql");
				PreparedStatement psu=con.prepareStatement("update eshopusers set flag=1 where uname=? and upass=?");
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
			PreparedStatement psr=con.prepareStatement("update eshopusers set flag=0 where uname=? and upass=?");
			psr.setString(1, uname);
			psr.setString(2, upass);
			psr.executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public int register(String fullname,String uname,String upass,String city,long mobileNum) {
		try {
			Connection con=	DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","passmysql");
			PreparedStatement psc1=con.prepareStatement("select uname from eshopusers where uname=?");
			psc1.setString(1, uname);
			ResultSet res1=psc1.executeQuery();
			if (!res1.next()) {
				con=	DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","passmysql");
				PreparedStatement psc2=con.prepareStatement("select mobileNum from eshopusers where mobileNum=?");
				psc2.setLong(1, mobileNum);
				ResultSet res2=psc2.executeQuery();
				if (!res2.next()) {
					con=	DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","passmysql");
					PreparedStatement psre=con.prepareStatement("insert into eshopusers values (?,?,?,?,?,?)");
					psre.setString(1, fullname);
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
