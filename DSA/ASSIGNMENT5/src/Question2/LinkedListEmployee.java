package Question2;


public class LinkedListEmployee {

	public Node head;
	Node sorted;
	int data;
	Employee e;

	public LinkedListEmployee() {
		head = null;
		
		
	}

	public LinkedListEmployee insert(LinkedListEmployee list, Employee e) {
		Node newNode = new Node(e);
		if (list.head == null) {
			list.head = newNode;
		} else {
			Node curr = list.head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = newNode;
		}
		return list;
	}

	public LinkedListEmployee insertionSort(LinkedListEmployee list) {
		// Initialize sorted linked list
		sorted = null;
		Node current = list.head;
		// Traverse the given linked list and insert every
		// node to sorted
		while (current != null) {
			// Store next for next iteration
			Node next = current.next;
			// insert current in sorted linked list
			sortedInsert(current);
			// Update current
			current = next;
		}
		// Update head_ref to point to sorted linked list
		head = sorted;
		return list;
	}

	/*
	 * function to insert a new_node in a list. Note that this function expects
	 * a pointer to head_ref as this can modify the head of the input linked
	 * list (similar to push())
	 */
	void sortedInsert(Node newnode) {
		/* Special case for the head end */
		Node current = sorted;
		if (sorted == null
				|| sorted.getData().getSalary() < newnode.getData()
						.getSalary()) {
			newnode.next = sorted;
			sorted = newnode;
		}else if (current.getData().getSalary() == newnode.getData()
				.getSalary()) {
			if(current.getData().getAge() < newnode.getData().getAge()) {

				newnode.next = current.next;
				current.next = newnode;
			}
			else {
				newnode.next = sorted;
				sorted = newnode;
			}
			
		}else {
			//Node current = sorted;
			/* Locate the node before the point of insertion */
			
			while (current.next != null
					&& current.getData().getSalary() > newnode.getData()
							.getSalary()) {
				
				current = current.next;
			}
			
			newnode.next = current.next;
			current.next = newnode;
		}
	}
	
	public void display(LinkedListEmployee list) {
		// Node current will point to head
		Node current = list.head;

		if (list.head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of singly linked list: ");
		while (current.next != null) {
			// Prints each node by incrementing pointer
			current.getData().displayEmployeeInfo();
			current = current.next;
		}
		current.getData().displayEmployeeInfo();
		System.out.println();
	}
	

	public static void main(String[] args) {
		// Scanner input=new Scanner(System.in);
		LinkedListEmployee list = new LinkedListEmployee();
		// System.out.println("Enter Id,Name,salary and Age ofEmployee ");
		// Employee e=new
		// Employee(input.nextInt(),input.next(),input.nextInt(),input.nextInt());
		Employee e = new Employee(1, "ram", 500, 19);
		list = list.insert(list, e);
		// e.displayEmployeeInfo();
		Employee e1 = new Employee(2, "Shyam", 600, 18);
		list = list.insert(list, e1);
		Employee e2 = new Employee(3, "jyoti", 800, 17);
		list = list.insert(list, e2);
		list.display(list);
		list.insertionSort(list);
		list.display(list);
	}
}
