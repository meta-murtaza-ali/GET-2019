package Question2;


/**
 * @author Murtaza Ali
 *
 */
public interface Queue {
	/**
	 * @param element
	 * @param priority
	 * @return true when it element is added
	 */
	boolean enQueue(Object element,int priority);
	/**
	 * @return object of the deleted element
	 * @throws Exception
	 */
	Object deQueue() throws Exception;
	/**
	 * @return true when queue is empty
	 */
	boolean isEmpty();
	/**
	 * @return true when queue is full
	 */
	boolean isFull();
	/**
	 * @return size of the queue
	 */
	int getSize();
	/**
	 * display queue element
	 */
	void display();

}
