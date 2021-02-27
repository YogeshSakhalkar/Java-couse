package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;

/**
 * Servlet implementation class LoginFrameController
 */
public class LoginFrameController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username =request.getParameter("myid");
		String password = request.getParameter("pass");
		
		PrintWriter out = response.getWriter();
		out.print("Welcome "+username+"your password is"+password);
		
		User u1 = new User();
		u1.setUsername(username);
		u1.setPassword(password);
		db.DAO d1 = new db.DAO();
		u1 = d1.validate(u1);
		if(u1!=null) {
			//out.print("<h1>welcome on second page"+username);
			//out.print("<br><br>");
			//adding session because data is not passing at Thirdpage
			HttpSession s1= request.getSession();
			s1.setAttribute("key", u1);
			
			
			//out.print("<a href='thirdPage'>third page click here</a>");
			
			//directly redirect to the the thirdpage
			//response.sendRedirect("thirdPage");
			response.sendRedirect("Thirdpage.jsp");
		}
		else {
			//out.print("<h1>invalid user");
			response.sendRedirect("login.jsp");
			response.sendRedirect("Login.jsp?errmsg='Invalid USer'");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
