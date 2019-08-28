package Question1_b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class Perform Operation on Employee
 * 
 * @author Murtaza Ali
 * 
 */
public class EmployeeOperations1 {
	List<Employee> listOfEmployee = new ArrayList<Employee>();

	/**
	 * add the employee in the list
	 * 
	 * @param emp
	 */
	public void addEmployee(Employee emp) {
		listOfEmployee.add(emp);
	}

	/**
	 * sorting of the employee on the basis of empName
	 */
	public void sortEmployeeByName() {
		Collections.sort(listOfEmployee, Employee.empid);
	}

	/**
	 * print the list of Employee
	 */
	public void printList() {
		for (int i = 0; i < listOfEmployee.size(); i++) {
			System.out.println(listOfEmployee.get(i).toString());
		}
	}

	public static void main(String args[]) {
		EmployeeOperations1 employee = new EmployeeOperations1();
		employee.addEmployee(new Employee(1, "Kalpesh", "Udaipur"));
		employee.addEmployee(new Employee(5, "Malay", "Udaipur"));
		employee.addEmployee(new Employee(3, "Vinod", "Udaipur"));
		employee.addEmployee(new Employee(4, "Kirti", "Jodhpur"));
		employee.addEmployee(new Employee(2, "Abhishek", "Jaipur"));
		employee.sortEmployeeByName();
		employee.printList();
	}

}
