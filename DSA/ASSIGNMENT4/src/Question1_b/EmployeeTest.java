package Question1_b;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {
	/**
	 * add the employee and sorted the list on the basis of the name
	 */
	EmployeeOperations1 employee = new EmployeeOperations1();

	@Test
	public void test() {
		employee.addEmployee(new Employee(1, "Kalpesh", "Udaipur"));
		employee.addEmployee(new Employee(5, "Malay", "Udaipur"));
		employee.addEmployee(new Employee(3, "Vinod", "Udaipur"));
		employee.addEmployee(new Employee(4, "Kirti", "Jodhpur"));
		employee.addEmployee(new Employee(2, "Abhishek", "Jaipur"));
		employee.sortEmployeeByName();
		employee.printList();
	}

	@Test
	public void test1() {
		employee.addEmployee(new Employee(1, "Murtaza", "Aklera"));
		employee.addEmployee(new Employee(5, "Shobhit", "Kota"));
		employee.addEmployee(new Employee(3, "Raghu", "jhalawar"));
		employee.printList();
	}
}