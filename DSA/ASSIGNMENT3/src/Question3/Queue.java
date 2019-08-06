package Question3;

/**
 * @author Murtaza Ali
 * Make Queue interface
 */
public interface Queue {
	
	/**
	 * @param bowlername
	 * @param bowlerballs
	 * @return true when enqueue is done
	 */
	boolean enQueue(Object bowlername,int bowlerballs);
	/**
	 * @throws Exception
	 * dequeue the bowler from the queue
	 */
	void deQueue() throws Exception;
	/**
	 * @return true if empty
	 */
	boolean isEmpty();
	/**
	 * @return true if full
	 */
	boolean isFull();
	/**
	 * @return size of the queue 
	 */
	int getSize();
	/**
	 * display the queue element
	 */
	void display();

}
