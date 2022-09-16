package com;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class WelcomeAction  extends Action {
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		return "shopping.start";
	} 
}
