package server;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * This show students detail.
 * @author Murtaza Ali
 *
 */
public class ShowStudents extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException {

		PrintWriter out = res.getWriter();
		ProcessStudent student = new ProcessStudent();
		List<StudentData> data = student.showData();
		out.print("<style>");
		out.print("table th { background-color: #D3D3D3; text-align: center;  border-spacing: 10px; border-collapse: collapse; padding: 15px; }"
				+ "table td { background-color: rgb(226, 202, 202);text-align: center;border-spacing: 10px;}"
				+ " input[type=submit] {background-color: #008CBA; border: none;color: white;padding: 15px 32px;text-align: center; "
				+ "text-decoration: none;display: inline-block; ");
		out.print("</style>");
		out.print("<body style='background-color:fffdd0'>");
		out.print("<table align = center cellspacing = 10px cellpadiing = 10px >");
		out.print("<tr>");
		out.print("<th>Student_Id</th>");
		out.print("<th>First_Name</th>");
		out.print("<th>Last_Name</th>");
		out.print("<th>Father_Name</th>");
		out.print("<th>Email</th>");
		out.print("<th>Class_Name</th>");
		out.print("<th>Age</th>");
		out.print("</tr>");

		for (StudentData student_data : data) {
			out.print("<tr>");
			out.print("<form action='updateStudent' method = 'Get'>");
			out.print("<td >" + "<input type = 'hidden' name = 'id' value="
					+ student_data.getStudentId() + ">"
					+ student_data.getStudentId() + "</td>");
			out.print("<td>" + "<input type = 'hidden' name ='firstname' value="
					+ student_data.getFirstName() + ">"
					+ student_data.getFirstName() + "</td>");
			out.print("<td><input type = 'hidden' name = 'lastname' value = "
					+ student_data.getLastName() + ">"
					+ student_data.getLastName() + "</td>");
			out.print("<td><input type = 'hidden' name = 'fathername' value = "
					+ student_data.getFatherName() + ">"
					+ student_data.getFatherName() + "</td>");
			out.print("<td><input type = 'hidden' name = 'email' value = "
					+ student_data.getEmail() + ">" + student_data.getEmail()
					+ "</td>");
			out.print("<td><input type = 'hidden' name = 'classname' value = "
					+ student_data.getClassName() + ">"
					+ student_data.getClassName() + "</td>");
			out.print("<td><input type = 'hidden' name = 'age' value = "
					+ student_data.getAge() + ">" + student_data.getAge()
					+ "</td>");
			out.print("<td><input type = 'submit' value = 'edit'></td>");
			out.print("</form>");
			out.print("</tr>");

		}
		out.print("</table>");
		out.print("</body><br></br>");

	}

}
