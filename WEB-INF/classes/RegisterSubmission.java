

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;



public class RegisterSubmission extends HttpServlet {   
    MySqlCon mySqlCon;

    public RegisterSubmission(){
        this.mySqlCon = new MySqlCon();
    }

   
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName, lastName, email, alternateEmail, phone, dob, age, gender, address, profile, sslc, hsc, qualification, specification, cgpa, resume;
        firstName = request.getParameter("firstName");
        lastName = request.getParameter("lastName");
        email = request.getParameter("email");
        alternateEmail = request.getParameter("alternateEmail");
        phone = request.getParameter("phone");
        dob = request.getParameter("dob");
        age = request.getParameter("age");
        gender = request.getParameter("gender");
        address = request.getParameter("address");
        profile = request.getParameter("profile");
        sslc = request.getParameter("sslc");
        hsc = request.getParameter("hsc");
        qualification = request.getParameter("qualification");
        specification = request.getParameter("specification");
        cgpa = request.getParameter("cgpa");
        resume = request.getParameter("resume");
        Boolean result = mySqlCon.postApplication(new Application(firstName, lastName, email, alternateEmail, phone, dob, age, gender, address, profile, sslc, hsc, qualification, specification, cgpa, resume));
        if(result){
            RequestDispatcher view = request.getRequestDispatcher("/HTML/success.html");
		    view.forward(request, response);    
        }else{
            RequestDispatcher view = request.getRequestDispatcher("/HTML/error.html");
		    view.forward(request, response);    
        }
		// PrintWriter pw = response.getWriter();
        // pw.print("Hello"+ firstName +lastName + email + alternateEmail + phone + dob + age + gender + address + sslc + hsc + qualification + specification + cgpa + resume + profile);
	}
}
