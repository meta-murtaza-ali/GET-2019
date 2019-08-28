package Counselling;

/**
 * @author Murtaza Ali
 *
 */
public interface Queue {
	
    /**
     * @param data
     * @return add student in the queue
     */
	
    boolean enQueue(Student data);
    /**
     * delete student object from the queue
     * @return object of the student
     */
    Object deQueue();
    
    /**
     * check queue empty or not
     * @return true or false
     */
    boolean isEmpty();
    
    /**
     * check queue is full or not
     * @return true or false
     */
    boolean isFull();

}
