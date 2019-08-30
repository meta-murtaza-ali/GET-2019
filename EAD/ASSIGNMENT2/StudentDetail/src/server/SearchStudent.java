package server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchStudent extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * This doPost method of HttpServlet. 
	 */
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws IOException {
		PrintWriter out = res.getWriter();
		ShowSearchStudents ShowSearchStudents = new ShowSearchStudents();
		ProcessStudent student = new ProcessStudent();
		String id = req.getParameter("id");
		if ("firstName".equals(id)) {
			String firstName = req.getParameter("firstName");
			java.util.List<StudentData> data = student
					.searchByFirstName(firstName);
			ShowSearchStudents.showStudent(data, res);
		} else if ("lastName".equals(id)) {
			String lastName = req.getParameter("lastName");
			java.util.List<StudentData> data = student
					.searchByLastName(lastName);
			ShowSearchStudents.showStudent(data, res);
		}

	}

}
