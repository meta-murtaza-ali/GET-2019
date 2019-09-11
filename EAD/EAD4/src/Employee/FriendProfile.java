package Employee;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Murtaza Ali 
 * This Class Define Employee Friend Profile.
 */
@WebServlet("/friendprofile")
public class FriendProfile extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("employee_id") == null) {
			response.sendRedirect("index.html");
		} else {
			ProcessEmployee employee = new ProcessEmployee();
			PrintWriter out = response.getWriter();
			int id = Integer.parseInt(request.getParameter("emp_id"));
			try {

				FriendsDetail data = employee.FriendProfile(id);
				if (data == null) {

				} else {
					session.setAttribute("frienddetails", data);
					RequestDispatcher rd = request
							.getRequestDispatcher("FriendProfile.jsp");
					rd.forward(request, response);

				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
