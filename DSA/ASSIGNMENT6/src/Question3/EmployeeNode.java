package Question3;

/**
 * define a class EmployeeNode which contains employee information as a linked
 * list node
 * 
 * @author Murtaza Ali
 *
 */
public class EmployeeNode {
	public Employee data;
	public EmployeeNode next;

	/**
	 * @param data
	 *            constructor
	 */
	public EmployeeNode(Employee data) {
		this.data = data;
		this.next = null;
	}

	/**
	 * default constructor
	 */
	public EmployeeNode() {
	}

	/**
	 * @return data of employee
	 */
	public Employee getData() {
		return data;
	}

	/**
	 * @param data
	 *            set employee data
	 */
	public void setData(Employee data) {
		this.data = data;
	}

}
