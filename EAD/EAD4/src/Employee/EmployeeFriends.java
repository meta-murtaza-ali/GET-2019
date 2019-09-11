package Employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Murtaza Ali 
 * This Class Define Employee Friends List.
 */
@WebServlet("/friends")
public class EmployeeFriends extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("employee_id") == null) {
			response.sendRedirect("index.html");
		} else {
			ProcessEmployee employee = new ProcessEmployee();
			PrintWriter out = response.getWriter();
			try {
				ArrayList<FriendsDetail> data = (ArrayList<FriendsDetail>) (employee
						.frendsList((int) session.getAttribute("employee_id")));
				if (data == null) {
					out.print("fgshd");
				} else {
					System.out.print("alert("
							+ (int) session.getAttribute("employee_id")
							+ ")</script>");
					session.setAttribute("friendData", data);
					RequestDispatcher rd = request
							.getRequestDispatcher("EmployeeFriends.jsp");
					rd.forward(request, response);

				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
