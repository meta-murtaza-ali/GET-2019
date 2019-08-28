package Question1_a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class Perform Operation on Employee
 * 
 * @author Murtaza Ali
 * 
 */
public class EmployeeOperations {
	List<Employee> listOfEmployee = new ArrayList<Employee>();

	/**
	 * add employee object to list using the collection
	 * 
	 * @param emp
	 */
	public void addEmployee(Employee emp) {
		listOfEmployee.add(emp);
	}

	/**
	 * sort the employee object using the comparable by EmpId
	 */
	public void sortedList() {
		Collections.sort(listOfEmployee);
	}

	/**
	 * print the list of employee object
	 */
	public void printList() {
		for (int i = 0; i < listOfEmployee.size(); i++) {
			System.out.println(listOfEmployee.get(i).toString());
		}
	}

	public static void main(String args[]) {
		EmployeeOperations employee = new EmployeeOperations();
		employee.addEmployee(new Employee(1, "Kalpesh", "Udaipur"));
		employee.addEmployee(new Employee(5, "Malay", "Udaipur"));
		employee.addEmployee(new Employee(3, "Vinod", "Udaipur"));
		employee.addEmployee(new Employee(4, "Kirti", "Jodhpur"));
		employee.addEmployee(new Employee(2, "Abhishek", "Jaipur"));
		employee.sortedList();
		employee.printList();
	}
}
