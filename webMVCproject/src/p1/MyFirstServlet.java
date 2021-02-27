package p1;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyFirstServlet extends HttpServlet {
	//declare karke rakh rahe hai throw
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head>"
				+"<title>"
				+"first page"
				+"</title></head>");
		out.print("hello in body of page <br>second line</br>");
		out.print("</html>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
