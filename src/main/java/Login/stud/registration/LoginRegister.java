package Login.stud.registration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class LoginRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginRegister() {
       
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	CustomerDAO cd= new CustomerDAOImpl();
		String userName=request.getParameter("username");
		String password= request.getParameter("password");
		String submitType=request.getParameter("submit");
		
		Customer c=cd.getCustomer(userName, password);
		//System.out.println(c.getName()+c.getPassword()+c.getUsername());
		if(submitType.equals("login")&& c!=null  && c.getName()!=null) {
			
			request.setAttribute("message", c.getName());
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
			
		}else if(submitType.equals("register")) {
			c.setName(request.getParameter("name"));
			c.setPassword(password);
			c.setUsername(userName);
			cd.insertCustomer(c);
			request.setAttribute("SuccessMessage","Registration done,please login to continue!!!");
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}else {
			request.setAttribute("message","Data Not Found,you can't register!!");
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
