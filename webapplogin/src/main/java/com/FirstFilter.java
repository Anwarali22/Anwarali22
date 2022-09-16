package com;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet Filter implementation class FirstFilter
 */

@WebFilter("*.do")
public class FirstFilter extends HttpFilter implements Filter {
       
	public void destroy() {
		System.out.println("filter destroy called");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("do Filter called");
		HttpServletRequest hrequest=(HttpServletRequest)request;
		HttpServletResponse hresponse=(HttpServletResponse)response;
		HttpSession session=hrequest.getSession();
		if(session.isNew()) {
			String formid=hrequest.getParameter("formid");
			if(formid.equals("login")) {
			chain.doFilter(request, response);
		}else {
			RequestDispatcher rd=request.getRequestDispatcher("timeOut.jsp");
			rd.forward(hrequest, hresponse);
		}
		}else {		
	chain.doFilter(request, response);
	}
	}
	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
