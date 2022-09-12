package User.java;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Connection;

import com.mysql.cj.conf.ConnectionPropertiesTransform;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	

		 String name= request.getParameter("name");
		 String email= request.getParameter("email");
		 String password= request.getParameter("password");
		 
		 User userModel= new User(name,email,password);
		 
		 UserDatabase regUser=new UserDatabase(Dbconnetion.getConnection());
		 if(  regUser .saveUser(userModel)) {
			 
			 response.sendRedirect("Login.jsp");
		 }else {
			 String errorMessage= "User Available";
			 HttpSession regsession= request.getSession();
			 regsession.setAttribute("RegError", errorMessage);
			 response.sendRedirect("register.jsp");
		 }
		System. out.println("</body>");
		System.out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		
		 
		 
		 }
		 
	}


