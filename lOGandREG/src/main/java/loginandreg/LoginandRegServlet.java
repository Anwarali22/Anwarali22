package loginandreg;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import loginandreg.loginbean;
import loginandreg.LoginandregDao;

/**
 * Servlet implementation class LoginandRegServlet
 */
public class LoginandRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginandRegServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		//String uname = request.getParameter("username");
		// String password = request.getParameter("password");

		LoginandregDao loginDao = new LoginandregDao();

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		loginbean loginbean = new loginbean(username, password, email, phone);
		loginbean.setUsername(username);
		loginbean.setPassword(password);

		String result = loginDao.insert(loginbean);
		response.getWriter().print(result);
		// if (LoginandregDao.validate(loginbean))

		if (loginDao.validate(loginbean)) {
			response.sendRedirect("loginSuccess.jsp");

		} else {
			// HttpSession session = request.getSession();
			response.sendRedirect("login.jsp");

		}

	}

}
