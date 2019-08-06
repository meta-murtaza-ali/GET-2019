package Question2;


/**
 * @author Murtaza Ali
 *
 */
public class PriorityQueue implements Queue {
	public Element[] queue;
	private int noOfElements = 0;
	private  int Size;

	/**
	 * @param size add the queue size 
	 */
	public PriorityQueue(int size) {
		this.Size = size+1;
		this.queue = new Element[Size];
	}
	
	/**
	 * @return true when element is add in the queue
	 */
	public boolean enQueue(Object element, int priority) 
	{
		if (!isFull())
		{
			Element object = new Element(element, priority);
			queue[++noOfElements] = object;
			int position = noOfElements;
			while((position != 1) && object.priority > queue[position/2].priority) {
				queue[position] = queue[position/2];
				position = position/2;
			}
			queue[position] = object;
		} else {
			throw new IndexOutOfBoundsException("Queue Array is full");
		}
		return true;
	}

	/**
	 * @return object of the delete element
	 */
	public Object deQueue() throws Exception {
		if(isEmpty()){
			throw(new Exception("queue is empty"));
		}
		Element store = queue[1];
		queue[1] = queue[noOfElements];
		int count = noOfElements-1;
		
		while(count != 0){
			int pos = count;
			while((pos != 1) && queue[pos].priority > queue[pos/2].priority){
				Element temp = queue[pos];
				queue[pos] = queue[pos/2];
				queue[pos/2] = temp;
				pos = pos/2;
				
			}
			
			count--;
		}
		noOfElements--;
		return store.getElement();
	}

	/**
	 * @return true when it is empty
	 */
	
	public boolean isEmpty() {
		if(noOfElements==0)
			return true;
		return false;
	}

	
	/**
	 * @return true when it is full
	 */
	public boolean isFull() {
		if(noOfElements == Size)
			return true;
		return false;
	}

	
	/**
	 * @return the size of the queue
	 */
	public int getSize() {
		return noOfElements;
	}

	
	/**
	 * display the queue element
	 */
	public void display() {
		for(int i=1;i<=noOfElements;i++){
			System.out.println("Element is :" + queue[i].getElement());
			
		}
		
	}


}
