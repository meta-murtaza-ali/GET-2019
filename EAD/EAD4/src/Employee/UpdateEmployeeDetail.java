package Employee;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Murtaza Ali Update Employee Detail
 */
@WebServlet("/updateEmployeeDetail")
public class UpdateEmployeeDetail extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		HttpSession session = request.getSession();
		if (session.getAttribute("employee_id") == null) {
			response.sendRedirect("index.html");
		} else {
			ProcessEmployee employee = new ProcessEmployee();
			EmployeeData data = new EmployeeData();
			data.setEmployee_id(Integer.parseInt(request
					.getParameter("Employee_id")));
			data.setFirstName(request.getParameter("FirstName"));
			data.setLastName(request.getParameter("LastName"));
			data.setGender(request.getParameter("gender"));
			data.setEmail(request.getParameter("emailId").toLowerCase());
			data.setPassword(request.getParameter("password"));
			data.setOrganization(request.getParameter("organization_type"));
			data.setContactNumber(request.getParameter("contactNumber"));
			int update_rows = employee.updateData(data);
			// if(update_rows>0) {
			// response.getWriter().print("update");
			// }
			request.setAttribute("data", data);
			RequestDispatcher rd = request
					.getRequestDispatcher("EmployeeDetail.jsp");

			rd.forward(request, response);
		}
	}
}
