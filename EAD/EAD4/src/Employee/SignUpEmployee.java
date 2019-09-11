package Employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Murtaza Ali 
 * Sign Up of Employee.
 */
@WebServlet("/signup")
public class SignUpEmployee extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		ProcessEmployee employee = new ProcessEmployee();
		PrintWriter out = response.getWriter();
		EmployeeData data = new EmployeeData();
		data.setFirstName(request.getParameter("FirstName"));
		data.setLastName(request.getParameter("LastName"));
		data.setGender(request.getParameter("gender"));
		data.setEmail(request.getParameter("emailId").toLowerCase());
		data.setPassword(request.getParameter("password"));
		data.setOrganization(request.getParameter("organization_type"));
		data.setContactNumber(request.getParameter("contactNumber"));
		int employee_id = employee.create(data);
		request.setAttribute("employee_id", employee_id);
		if (employee_id == -2) {
			out.print("<script>alert('This email is already registered!')</script>");
			out.print("<script>window.location='Register.jsp'</script>");
			// RequestDispatcher rd =
			// request.getRequestDispatcher("Register.jsp");
			// rd.forward(request, response);
		} else {
			RequestDispatcher rd = request
					.getRequestDispatcher("CarRegistor.jsp");
			rd.forward(request, response);
		}

	}
}
