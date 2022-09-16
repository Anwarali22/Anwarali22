package com;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterAction extends Action {
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String fullname=request.getParameter("fullname");
		String uname=request.getParameter("uname");
		String upass=request.getParameter("upass");
		String city=request.getParameter("city");
		long mobileNum=Long.parseLong(request.getParameter("mobileNum"));
		int status=DbCon.getInstance().register(fullname, uname, upass, city, mobileNum); 
			if(1==status) {
				return "register.success";
			}
		
		return "login.register";
	}

}
