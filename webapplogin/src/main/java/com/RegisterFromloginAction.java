package com;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterFromloginAction extends Action {
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		return "login.register";
	}

}
