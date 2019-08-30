package server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Update Student Details.
 * 
 * @author Murtaza Ali.
 *
 */
public class UpdateStudentDetail extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws IOException {
		int Student_id = Integer.parseInt(req.getParameter("id"));
		String first_name = req.getParameter("firstName");
		String last_name = req.getParameter("lastName");
		String father_name = req.getParameter("fatherName");
		String email = req.getParameter("emailId");
		String class_name = req.getParameter("class");
		int age = Integer.parseInt(req.getParameter("age"));
		PrintWriter out = res.getWriter();
		StudentData addData = new StudentData(first_name, last_name,
				father_name, email, class_name, age);
		addData.setStudentId(Student_id);
		ProcessStudent student = new ProcessStudent();
		int updated_row = student.updateData(addData);
		out.print("<body style = 'background-color:#ADD8E6'>");
		out.print("<nav>");
		out.print("<a href = 'index.html'>GoToHome</a>");
		out.print("</nav>");
		out.println("<center><h2>Update Succesfully.</h2></center>");
		out.print("</body>");

	}

}
