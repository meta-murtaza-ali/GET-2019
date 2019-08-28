package Question3;



/**
 * @author Murtaza Ali
 * define the Priority bowler
 *
 */
public class PriorityBowler implements Queue{
	public BowlersDetails[] queue;
	private int noOfBowlers = 0;
	private  int Size;
	private int noOfViratBalls;

	public PriorityBowler(int noOfbowler,int ViratBalls) {
		this.Size = noOfbowler+1;
		this.queue = new BowlersDetails[Size];
		this.noOfViratBalls = ViratBalls;
	}
	
	/**
	 * @return true when bowler object is add in queue 
	 */
	public boolean enQueue(Object element, int Balls) 
	{
		if (!isFull())
		{
			BowlersDetails object = new BowlersDetails(element, Balls);
			queue[++noOfBowlers] = object;
			int position = noOfBowlers;
			while((position != 1) && object.getPriority() > queue[position/2].getPriority()) {
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
	 * delete the element from the queue
	 */
	public void deQueue() throws Exception {
		while(noOfViratBalls!=0){
			if(isEmpty()){
				throw(new Exception("queue is empty"));
			}
			BowlersDetails store = queue[1];
			queue[1] = queue[noOfBowlers];
			int count = noOfBowlers-1;
			
			while(count != 0){
				int pos = count;
				while((pos != 1) && queue[pos].getPriority() > queue[pos/2].getPriority()){
					BowlersDetails temp = queue[pos];
					queue[pos] = queue[pos/2];
					queue[pos/2] = temp;
					pos = pos/2;
				}
				count--;
			}
			noOfBowlers--;
			noOfViratBalls--;
			enQueue(store.getElement(),store.getPriority()-1);
		}
		
		
	}

	
	/**
	 * @return true when empty
	 */
	public boolean isEmpty() {
		if(noOfBowlers==0)
			return true;
		return false;
	}

	
	/**
	 * @return true when full
	 */
	public boolean isFull() {
		if(noOfBowlers == Size)
			return true;
		return false;
	}

	/**
	 * @return size of the queue
	 */
	
	public int getSize() {
		return noOfBowlers;
	}

	
	/**
	 * Display the bowler detail
	 */
	public void display() {
		for(int i=1;i<=noOfBowlers;i++){
			System.out.println("BowlerDetail is :" + queue[i].getElement()+queue[i].getPriority());
			
		}
		
	}


}
