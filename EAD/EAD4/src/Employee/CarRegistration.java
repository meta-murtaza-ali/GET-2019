package Employee;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Murtaza ALi
 * This Class Define Registration of Car.
 */
@WebServlet("/carRegistration")
public class CarRegistration extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
		ProcessEmployee employee = new ProcessEmployee();		
		EmployeeCarDetail data = new EmployeeCarDetail();
		data.setEmployeeId(Integer.parseInt(request.getParameter("Employee_id")));
		data.setCarName(request.getParameter("CarName"));
		data.setVehicleType(request.getParameter("vehicle_type"));
		data.setVehicleNumber(request.getParameter("vehicleNumber"));
		data.setPassType(request.getParameter("typeofpass"));
		data.setPassPrice(request.getParameter("pass_price"));
		employee.insertCarDetail(data);
		response.sendRedirect("index.html");
	}
	
}
