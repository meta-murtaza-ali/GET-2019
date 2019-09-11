package Employee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Murtaza Ali 
 * Update Car Detail of Employee.
 */
@WebServlet("/carUpdateData")
public class UpdateCarDetails extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		HttpSession session = request.getSession();
		if (session.getAttribute("employee_id") == null) {
			response.sendRedirect("index.html");
		} else {
			ProcessEmployee employee = new ProcessEmployee();
			PrintWriter out = response.getWriter();
			EmployeeCarDetail data = new EmployeeCarDetail();
			data.setEmployeeId(Integer.parseInt(request
					.getParameter("Employee_id")));
			data.setCarName(request.getParameter("CarName"));
			data.setVehicleType(request.getParameter("vehicle_type"));
			data.setVehicleNumber(request.getParameter("vehicleNumber"));
			data.setPassType(request.getParameter("typeofpass"));
			data.setPassPrice(request.getParameter("pass_price"));
			out.print("<script> alert(" + request.getParameter("pass_price")
					+ ") </script>");
			int update_rows = employee.updateCarData(data);
			if (update_rows > 0) {
				response.getWriter().print("update");
				session.setAttribute("carDetail", data);
				RequestDispatcher rd = request
						.getRequestDispatcher("EmployeeDetail.jsp");
				rd.include(request, response);
				rd.forward(request, response);
			}
		}
	}

}
