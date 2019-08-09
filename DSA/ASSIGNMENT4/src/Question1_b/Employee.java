package Question1_b;

import java.util.Comparator;

/**
 * Employye class define the employee id ,adress and name
 * 
 * @author Murtaza Ali
 */
public class Employee {
	public int empId;
	String empName;
	String empAddress;

	public Employee(int empId, String empName, String empAddress) {
		super();
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
	 * sort the Emp list using the comparator by name
	 */
	public static Comparator<Employee> empid = new Comparator<Employee>() {

		public int compare(Employee s1, Employee s2) {

			String empName1 = s1.getEmpName();
			String empName2 = s2.getEmpName();

			/* For ascending order */
			return empName1.compareTo(empName2);

			/* For descending order */
			// rollno2-rollno1;
		}
	};

	/**
	 * @return Employee Detail
	 */
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empAddress=" + empAddress + "]";
	}

}
