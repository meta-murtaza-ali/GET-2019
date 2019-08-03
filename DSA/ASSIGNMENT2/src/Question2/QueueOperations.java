package Question2;

/**
 * QueueOperations is class that implements queue operation like enqueue,dequeue
 * 
 * @author Murtaza Ali
 *
 */
public class QueueOperations implements QueueInterface {
	int front = -1;
	int rear = -1;
	int maxSize;
	int queue[];

	/**
	 * parameterized constructor
	 * 
	 * @param size
	 *            is size of queue
	 */
	public QueueOperations(int size) {
		this.maxSize = size;
		this.queue = new int[maxSize];
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see QueueInterface#enQueue(int)
	 */
	public boolean enQueue(int item) {
		if (isFull() == true)
			return false;
		else {
			if (rear == front && front == -1) {
				front += 1;
			}
			rear = (rear + 1) % maxSize;
			queue[rear] = item;
			return true;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see QueueInterface#deQueue()
	 */
	public boolean deQueue() {
		if (isEmpty() == true)
			return false;
		else {
			int item = queue[front];
			if (rear == front) {
				rear = -1;
				front = -1;
			}
			else
	        {
	            front = (front + 1) % maxSize;
	        }
			System.out.println(item + "is dequeued");
			return true;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see QueueInterface#isFull()
	 */
	public boolean isFull() {
		if ((rear + 1) % maxSize == front) {
			System.out.println("queue is full");
			return true;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see QueueInterface#isEmpty()
	 */
	public boolean isEmpty() {
		if (front == rear && rear == -1) {
			System.out.println("queue is empty");
			return true;
		}
		return false;
	}

	/**
	 * display method display the queue
	 */
	void display() {
		int tmpfront = front;
		if (rear == front && rear == -1) {
			System.out.println("Queue is Empty.");
		} else {
			System.out.println("The element"
					+ /* elementOrElements() */"on the Queue are:- ");
			for (int i = 0; i < maxSize; i++) {
				if (tmpfront != rear) {
					System.out.println(queue[tmpfront]);
					tmpfront = (tmpfront + 1) % maxSize;
				} else {
					System.out.println(queue[rear]);
					break;
				}
			}
		}
	}

}
