

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.*;



public class Recents extends HttpServlet {
	MySqlCon mySqlCon;

	public Recents(){
		this.mySqlCon = new MySqlCon();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Application> applications;
		try {
			applications = mySqlCon.getApplications();
			request.setAttribute("applications", applications);
			for(Application a: applications){
				System.out.println(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher view = request.getRequestDispatcher("/HTML/recents.jsp");
		view.forward(request, response);
		response.getWriter().println("Hello");
	}
}
