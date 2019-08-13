package Question3;

import java.util.Scanner;

/**
 * class LinkedListEmployee gives names of employee in sorted manner according
 * to their salary
 * 
 * @author Murtaza Ali
 *
 */
public class LinkedListEmployee {

	public EmployeeNode head;
	int data;
	Employee employeeObject;

	/**
	 * default constructor
	 */
	public LinkedListEmployee() {
		head = null;

	}

	/**
	 * @param list
	 *            is Link List of employee
	 * @param employeeObject
	 *            of employee node class
	 * @return list of employee after insertion
	 * @throws Exception
	 */
	public LinkedListEmployee insert(LinkedListEmployee list,
			Employee employeeObject) throws Exception {
		if (employeeObject == null) {
			throw (new Exception("Object is Empty"));
		}
		EmployeeNode newNode = new EmployeeNode(employeeObject);
		if (list.head == null) {
			list.head = newNode;
		} else {
			EmployeeNode curr = list.head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = newNode;
		}
		return list;
	}

	/**
	 * @param list
	 * @return node of sorted list of employee
	 */
	public EmployeeNode quickSort(LinkedListEmployee list) {
		if (list.head == null || list.head.next == null) {
			return list.head;
		}
		return quick(list.head, null);
	}

	/**
	 * @param start
	 *            node is pointer to the first node of list
	 * @param end
	 *            node is pointer to the last node of list
	 * @return leftmost node of the list
	 */
	private EmployeeNode quick(EmployeeNode start, EmployeeNode end) {
		if (start == null || start == end || start.next == end) {
			return start;
		}

		EmployeeNode[] result = partition(start, end);
		EmployeeNode resultLeft = quick(result[0], result[1]);
		EmployeeNode resultRight = quick(result[1].next, end);
		return resultLeft;
	}

	/**
	 * @param start
	 *            node is pointer to the first node of list
	 * @param end
	 *            end node is pointer to the last node of list
	 * @return node after partition
	 */
	private EmployeeNode[] partition(EmployeeNode start, EmployeeNode end) {
		// start inclusive
		// end exclusive
		// return the new start node and the pivot node

		if (start == null || start == end || start.next == end) {
			return new EmployeeNode[] { start, start };
		}
		EmployeeNode dummyNode = new EmployeeNode();
		dummyNode.next = start;

		for (EmployeeNode j = start; j != null && j.next != null
				&& j.next != end; j = j.next) {
			while (j.next != null
					&& j.next.getData().getSalary() >= start.getData()
							.getSalary()) {
				EmployeeNode tmp = j.next;
				j.next = j.next.next;
				tmp.next = dummyNode.next;
				dummyNode.next = tmp;
			}
		}

		return new EmployeeNode[] { dummyNode.next, start };
	}

	/**
	 * @param list
	 *            is Link List of employee
	 * @throws Exception
	 */
	public void display(EmployeeNode list) throws Exception {
		// Node current will point to head
		EmployeeNode current = list;
		try {
			if (list == null) {
				throw (new Exception("list is empty"));
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		while (current.next != null) {
			// Prints each node by incrementing pointer
			current.getData().displayEmployeeInfo();
			current = current.next;
		}
		current.getData().displayEmployeeInfo();
		System.out.println();
	}

	/**
	 * This is a main method to run and check the code
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LinkedListEmployee list = new LinkedListEmployee();
		int t = 0;
		while (t == 0) {
			System.out
					.println("1.Insert Employee Detail \n 2.Display \n 3.Exit");
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Id,Name,salary and Age ofEmployee ");
				Employee e = new Employee(input.nextInt(), input.next(),
						input.nextInt(), input.nextInt());
				try {
					list = list.insert(list, e);
				} catch (Exception e3) {
					// TODO Auto-generated catch block
					e3.printStackTrace();
				}
				break;
			case 2:
				EmployeeNode newNode = list.quickSort(list);
				try {
					list.display(newNode);
					list.head = newNode;
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				break;
			case 3:
				t = 1;
				break;
			}

		}
	}

}
