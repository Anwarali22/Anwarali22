package com;

import java.util.Locale;
import java.util.ResourceBundle;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public  class IndexAction  extends Action{
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String lang=request.getParameter("lang");
		HttpSession session=request.getSession();
		//session.setAttribute("lang", lang);
		ResourceBundle rb=ResourceBundle.getBundle("dictionary", new Locale(lang));
		session.setAttribute("rb",rb);
		return "index.EnterShop";
}
}