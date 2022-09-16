package com;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class MyCustomTag  extends TagSupport{
	private String status;

	public String getStatus() {
		return status;
	}




	public void setStatus(String status) {
		this.status = status;
	}




	@Override
	public int doEndTag() throws JspException {
		JspWriter out=pageContext.getOut();
		if(getStatus().equals("fail")) {
			try {
				out.println("Username or Password Wrong");
				}catch(Exception e) {e.printStackTrace();}
		}
		
		return super.doEndTag();
	}

}
