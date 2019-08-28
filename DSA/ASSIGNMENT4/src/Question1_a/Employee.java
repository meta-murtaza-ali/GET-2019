package Question1_a;

import java.util.Comparator;

/**
 * class define the employee id ,adress and name
 * 
 * @author Murtaza Ali Employye
 * 
 */
public class Employee implements Comparable<Employee> {
	public static int empId;

	String empName;
	String empAddress;

	public Employee(int empId, String empName, String empAddress) {
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
	}

	/**
	 * Return the Employee Id
	 * 
	 * @return Employee ID
	 */
	public int getEmpId() {
		return empId;
	}

	/**
	 * Set Employee Id
	 * 
	 * @param empId
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	/**
	 * Return Employee Name
	 * 
	 * @return Employee name
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * Set employee name
	 * 
	 * @param empName
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * Return Employee Address
	 * 
	 * @return
	 */
	public String getempAddress() {
		return empAddress;
	}

	/**
	 * Set employee address
	 * 
	 * @param empAddress
	 */
	public void setEmpAdresses(String empAddress) {
		this.empAddress = empAddress;
	}

	/**
	 * sorting of employee on the basis of the Id using the comparable
	 */
	@Override
	public int compareTo(Employee emp) {
		int empId = ((Employee) emp).getEmpId();
		/* For Ascending order */
		return this.empId - empId;

	}

	/**
	 * @return Employee Detail
	 */
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empAddress=" + empAddress + "]";
	}

}
