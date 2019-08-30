package server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * This is Show Student Detail of Student.
 * 
 * @author Murtaza Ali
 *
 */
public class ShowStudentDetails extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws IOException {
		PrintWriter out = res.getWriter();
		out.print("<body style='background-color:#D3D3D3'>");
		out.print("<table align = 'center' cellspacing = " + "5px"
				+ " cellpadding = '10px'>");
		out.print("<form action = 'final_update' method = 'post'>");
		out.print("<tr>");
		out.print("<td><input type = 'hidden' name = 'id' value = "
				+ req.getParameter("id") + "></td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td><label>First Name</label></td>");
		out.print("<td><input type ='text' name = 'firstName' value = "
				+ req.getParameter("firstname") + "></td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td><label>Last Name</label></td>"); 
		out.print("<td><input type = 'text' name = 'lastName' value = "
				+ req.getParameter("lastname") + "></td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td><label>Father Name</label></td>");
		out.print("<td><input type = 'text' name = 'fatherName' value = "
				+ req.getParameter("fathername") + "></td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td><label>Email</label></td>");
		out.print("<td><input type = 'text' name = 'emailId' value = "
				+ req.getParameter("email") + "></td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td><label>Class Name</label></td>");
		out.print("<td><input type = 'text' name = 'class' value = "
				+ req.getParameter("classname") + "></td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td><label>Age</label></td>");
		out.print("<td><input type = 'number' name = 'age' value = "
				+ req.getParameter("age") + "></td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td><input type = 'submit' value = 'update' ></td>");
		out.print("</tr>");
		out.print("</form>");
		out.print("</table>");
		out.print("</body>");
	}
}
