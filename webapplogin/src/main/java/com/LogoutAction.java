package com;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LogoutAction extends Action {
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session=request.getSession();
		String uname=(String)session.getAttribute("uname");
		String upass=(String)session.getAttribute("upass");
		if(DbCon.getInstance().reSetFlag(uname, upass)) {
			return "logout.success";
		}else {
		return "error.somethingWrong";
		}
}
}