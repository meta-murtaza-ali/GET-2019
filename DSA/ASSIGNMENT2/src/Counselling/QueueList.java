package Counselling;

public class QueueList implements Queue{
	int front = -1;
	int rear = -1;
	int maxSize=100;
	Student queue[] = new Student[1000];

	/**
	 * parameterized constructor
	 * 
	 * @param size is size of queue
	 */
	public QueueList() {
		
	}

	/**
	 * add student object in the queue
	 * @return true or false
	 */
	public boolean enQueue(Student item) {
		
		if (isFull() == true)
		{
			return false;
		}
		
		else {
			
			if (rear == front && front == -1) {
				front += 1;
			}
			rear = (rear + 1) % maxSize;
			queue[rear] = item;
			return true;
		}
	}


	/**
	 * delete student object from the queue
	 * @return object of the student
	 */
	public Student deQueue() {
		
		if (isEmpty() == true)
		{
			
			return null;
		}
		else {
			Student item = queue[front];
			if (rear == front) {
				rear = -1;
				front = -1;
			}
			else
	        {
	            front = (front + 1) % maxSize;
	        }
			System.out.println(item.getName() + "is dequeued");
			return item;
		}
	}


	/**
	 * check queue is full or not
	 * @return true or false
	 */
	public boolean isFull() {
		
		if ((rear + 1) % maxSize == front) {
			System.out.println("queue is full");
			return true;
		}
		
		return false;
	}


	/**
	 * check queue is empty or not
	 * @return true or false
	 */
	public boolean isEmpty() {
		
		if (front == rear && rear == -1 && front==-1) {
			System.out.println("queue is empty");
			return true;
		}
		return false;
	}

	
	
	
}
