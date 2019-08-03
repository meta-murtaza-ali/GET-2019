package Question2;
/**
 * queue is an interface implemented using an array
 * 
 * @author Murtaza Ali
 *
 */
public interface QueueInterface {

	/**
	 * enQueue is function which is used to insert element in queue
	 * 
	 * @param element
	 *            to be inserted in queue
	 * @return returns true if inserted successfully
	 */
	boolean enQueue(int element);

	/**
	 * deQueue function is used to delete an element from queue
	 * 
	 * @return true if deleted successfully else false
	 */
	boolean deQueue();

	/**
	 * @return true if queue is full else false
	 */
	boolean isFull();

	/**
	 * @return true if queue is empty else false
	 */
	boolean isEmpty();

}
