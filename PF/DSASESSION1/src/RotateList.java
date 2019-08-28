/**
 * RotateList is a class which rotates a sub list within a given window of
 * positions named L and R, where L is the left position in list and R is the
 * right position
 * 
 * @author Murtaza Ali
 *
 */
public class RotateList {
	/**
	 * @param list is list of integers
	 * @param left is position from left side of list
	 * @param right is position from right side of list
	 * @param numberOfRotation
	 * @return returns list with rotation
	 */
	public static LinkedList RotateLinkedList(LinkedList list, int left,
			int right, int numberOfRotation) {
		Node currentNode = new Node();
		currentNode = list.head;
		int count = 1, variable;
		Node Left = null;
		Node Right = null;
		Node temp = null;
		Node store = null;
		while (count != right) {
			if (count == left) {
				store = currentNode;
			}
			currentNode = currentNode.next;
			count++;
		}
		Right = currentNode;
		while (numberOfRotation != 0) {
			Left = store;
			variable = (int) store.data;
			while (Left != Right) {
				temp = Left;
				Left = Left.next;
				temp.data = Left.data;
			}
			Left.data = variable;
			numberOfRotation--;
		}
		return list;
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list = LinkedList.insert(list, 2);
		list = LinkedList.insert(list, 3);
		list = LinkedList.insert(list, 4);
		list = LinkedList.insert(list, 5);
		list = LinkedList.insert(list, 6);
		list = LinkedList.insert(list, 7);

		Node currNode = list.head;
		System.out.print("LinkedList: ");
		while (currNode != null) {
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}
		list = RotateLinkedList(list, 2, 5, 2);
		currNode = list.head;
		System.out.print("LinkedList: ");
		while (currNode != null) {
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}
	}

}
