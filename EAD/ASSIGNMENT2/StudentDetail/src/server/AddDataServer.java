package server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * This class add student data on the server
 * 
 * @author Murtaza Ali
 *
 */
public class AddDataServer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * This a doPost method of HttpSevlet Interface.
	 */
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException {

		String first_name = req.getParameter("firstName");
		String last_name = req.getParameter("lastName");
		String father_name = req.getParameter("fatherName");
		String email = req.getParameter("emailId");
		String class_name = req.getParameter("class");
		int age = Integer.parseInt(req.getParameter("age"));
		PrintWriter out = res.getWriter();
		StudentData addData = new StudentData(first_name, last_name,
				father_name, email, class_name, age);
		ProcessStudent student = new ProcessStudent();
		int student_id;
		out.print("<style>");
		out.print("a:link, a:visited { "
				+ "background-color: #bd99f2; color: white; padding: 20px 25px; text-align: center;  text-decoration: none; display: inline-block; }"
				+ " a:hover, a:active { background-color:#a56ef5;} ");
		out.print("</style>");
		out.print("<body style='background-color:#ADD8E6'>");
		out.print("<nav>");
		out.print("<a href = 'index.html'>Go To Home</a>");
		out.print("</nav>");
		try {
			student_id = student.create(addData);
			if (student_id == 0) {
				out.print("<center><h2>This Email is already registered!.</h2></center>");
			} else {
				out.print("<center><h2>Your registration Id is" + student_id
						+ ".</h2></center>");

			}
		} catch (Exception e) {
			out.print("<h1><center>Some error occured!! Please try after sometime.</center></h2>");
		}
		out.print("</body>");

	}

}
