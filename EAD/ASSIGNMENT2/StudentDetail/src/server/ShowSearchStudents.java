package server;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

/**
 * This is Show Search Students.
 * 
 * @author Murtaza Ali
 *
 */
public class ShowSearchStudents {
	public void showStudent(List<StudentData> data, HttpServletResponse res)
			throws IOException {
		PrintWriter out = res.getWriter();
		out.print("<title>Student Details</title>");
		out.print("<style>body {background-color: #e4d7f7;}table th {background-color: #d3bcf5; text-align: center; border-spacing: 10px;border-collapse: collapse;padding: 15px;}"
				+ "table td {background-color: rgb(226, 202, 202);text-align: center; border-spacing: 10px; }"
				+ "table tr.even {background-color: #fde9d9;}</style>");
		out.print("<body>");
		out.print("<nav>");
		out.print("<a href='index.html'>Go To Home</a>");
		out.print("</nav>");
		if (data == null) {
			out.print("<center><h1>Data is not Found!</h1></center>");

		} else {
			out.print("<table  align=center  cellspacing =10px cellpadiing = 10px >");
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
				out.print("<td >" + "<input type='hidden' name='id' value="
						+ student_data.getStudentId() + ">"
						+ student_data.getStudentId() + "</td>");
				out.print("<td>"
						+ "<input type='hidden' name='firstname' value="
						+ student_data.getFirstName() + ">"
						+ student_data.getFirstName() + "</td>");
				out.print("<td><input type ='hidden' name='lastname' value="
						+ student_data.getLastName() + ">"
						+ student_data.getLastName() + "</td>");
				out.print("<td><input type ='hidden' name='fathername' value="
						+ student_data.getFatherName() + ">"
						+ student_data.getFatherName() + "</td>");
				out.print("<td><input type ='hidden' name='email' value="
						+ student_data.getEmail() + ">"
						+ student_data.getEmail() + "</td>");
				out.print("<td><input type ='hidden' name='classname' value="
						+ student_data.getClassName() + ">"
						+ student_data.getClassName() + "</td>");
				out.print("<td><input type ='hidden' name='age' value="
						+ student_data.getAge() + ">" + student_data.getAge()
						+ "</td>");
				out.print("</form>");
				out.print("</tr>");
			}
			out.print("</table>");
		}
		out.print("</body><br></br>");

	}

}
