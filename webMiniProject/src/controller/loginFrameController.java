package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import db.employeeJDBC;
import model.employee;

/**
 * Servlet implementation class loginFrameController
 */
public class loginFrameController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String username =request.getParameter("username"); 
		 String password = request.getParameter("password");
		 
		employee e1 = new employee();
		e1.setUsername(username);
		e1.setPassword(password);
		
		employeeJDBC ed = new employeeJDBC();
		
		//e1= ed.validate(e1);
		//if(e1!=null)
		if(e1.getUsername().equals("yogesh")&& e1.getPassword().equals("12345"))
		{
			//HttpSession h1 = request.getSession();
			//h1.setAttribute("key", e1);
			
			response.sendRedirect("userHomePage.jsp");
		}
		else
		{
			response.sendRedirect("login.jsp");
			response.sendRedirect("login.jsp?errmsg='Invalid User'");
		}
		 
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
