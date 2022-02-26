

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.*;



public class Jobs extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		RequestDispatcher view = request.getRequestDispatcher("/HTML/jobs.html");
		view.forward(request, response);
		pw.println("hello"); 
	}
}
