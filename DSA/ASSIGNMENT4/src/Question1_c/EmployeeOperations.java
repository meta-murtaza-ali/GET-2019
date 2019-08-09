package Question1_c;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import Question1_b.Employee;

/**
 * This class Perform Operation on Employee
 * 
 * @author Murtaza Ali
 * 
 */
public class EmployeeOperations {
	Map<Integer, Employee> listOfEmployee = new HashMap<Integer, Employee>();

	/**
	 * add employee without duplicate id the duplicate Id is Encountered it is
	 * avoided
	 * 
	 * @param emp
	 */
	public void addEmployee(Employee emp) {
		if (listOfEmployee.get(emp.getEmpId()) == null)
			listOfEmployee.put(emp.getEmpId(), emp);
	}

	/**
	 * print the list of the employee
	 */
	public void printList() {
		for (Employee emp : listOfEmployee.values())
			System.out.println(emp.toString());
	}

	public static void main(String args[]) {
		EmployeeOperations employee = new EmployeeOperations();
		employee.addEmployee(new Employee(1, "Kalpesh", "Udaipur"));
		employee.addEmployee(new Employee(5, "Malay", "Udaipur"));
		employee.addEmployee(new Employee(3, "Vinod", "Udaipur"));
		employee.addEmployee(new Employee(4, "Kirti", "Jodhpur"));
		employee.addEmployee(new Employee(2, "Abhishek", "Jaipur"));
		employee.printList();
	}
}
