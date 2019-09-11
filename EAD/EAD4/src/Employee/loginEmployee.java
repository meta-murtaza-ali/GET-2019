package Employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Murtaza Ali 
 * Define Employee Login.
 */
@WebServlet("/login")
public class loginEmployee extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String email = request.getParameter("email_Id");
		String password = request.getParameter("password");
		ProcessEmployee employee = new ProcessEmployee();
		List data = employee.showData(email, password);
		PrintWriter out = response.getWriter();

		if (data == null) {
			out.print("<script> alert('This Email Id or Password is not Correct!') </script>");
			out.print("<script>window.location='index.html';</script>");
		} else {
			HttpSession session = request.getSession();
			session.setAttribute("data", data.get(0));
			session.setAttribute("carDetail", data.get(1));
			session.setAttribute("employee_id",
					((EmployeeData) data.get(0)).getEmployee_id());
			RequestDispatcher rd = request
					.getRequestDispatcher("EmployeeDetail.jsp");
			rd.forward(request, response);
		}
	}
}
