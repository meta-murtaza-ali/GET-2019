package Counselling;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

/**
 * This test class test methods of AddmissionManagement Class
 * 
 * @author Murtaza Ali
 *
 */
public class AddmissionManagementTest {
	/**
	 * This test method test allocateCourses method of AddmissionManagement
	 * Class
	 * @throws IOException 
	 */
	@Test
	public void allocateCoursesPositiveCasesTest() throws IOException {

//		String availableCoursesExcelFile = "College_Courses.xls";
//		String studentDetailsExcelFile = "Student_Details.xls";
//		String allocatedCoursesExcelFile = "Course_Allocation.xls";

		Counselling addmissionManagement = new Counselling();
		addmissionManagement.addProgram();
		addmissionManagement.addStudent();
		boolean allocate = addmissionManagement.allocate();
		addmissionManagement.writeBook();
		assertTrue(allocate);				
	}
}
