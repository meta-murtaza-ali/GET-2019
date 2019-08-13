package Question3;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Murtaza Ali
 *
 */
public class TestEmployee {

	@Test
	public void test() {
		int[] expected = new int[] { 800, 600, 500 };
		int[] result = new int[3];

		LinkedListEmployee list = new LinkedListEmployee();
		try {
			Employee employee = new Employee(1, "ram", 500, 19);
			list = list.insert(list, employee);
			Employee employee1 = new Employee(2, "Shyam", 600, 18);
			list = list.insert(list, employee1);
			Employee employee2 = new Employee(3, "jay", 800, 17);
			list = list.insert(list, employee2);
			EmployeeNode newNode = list.quickSort(list);
			EmployeeNode n = new EmployeeNode();
			LinkedListEmployee expectedresult = new LinkedListEmployee();
			n = newNode;
			int i = 0;
			while (n.next != null) {
				result[i] = n.getData().getSalary();
				i++;
				n = n.next;

			}
			result[i] = n.getData().getSalary();
			assertArrayEquals(expected, result);
		} catch (Exception e) {

		}

	}

	@Test
	public void test1() {
		int[] expected = new int[] { 800, 500, 500 };
		int[] result = new int[3];

		LinkedListEmployee list = new LinkedListEmployee();
		try {
			Employee employee = new Employee(1, "ram", 500, 19);
			list = list.insert(list, employee);
			Employee employee1 = new Employee(2, "Shyam", 500, 18);
			list = list.insert(list, employee1);
			Employee employee2 = new Employee(3, "jay", 800, 17);
			list = list.insert(list, employee2);
			EmployeeNode newNode = list.quickSort(list);
			EmployeeNode n = new EmployeeNode(employee);
			LinkedListEmployee expectedresult = new LinkedListEmployee();
			n = newNode;
			int i = 0;
			while (n.next != null) {
				result[i] = n.getData().getSalary();
				i++;
				n = n.next;
			}
			result[i] = n.getData().getSalary();

		} catch (Exception e) {
			assertArrayEquals(expected, result);
		}
	}

	@Test
	public void NullTest() {
		LinkedListEmployee list = new LinkedListEmployee();
		try {
			Employee employee = null;
			list = list.insert(list, employee);

		} catch (Exception e) {
			assertEquals("Object is Empty", e.getMessage());
		}
	}

}
