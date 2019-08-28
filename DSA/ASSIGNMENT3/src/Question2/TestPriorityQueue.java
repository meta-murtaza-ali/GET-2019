package Question2;

import static org.junit.Assert.*;

import org.junit.Test;



/**
 * @author Murtaza Ali
 *
 */
public class TestPriorityQueue {

	PriorityQueue priority = new PriorityQueue(6);

	@Test
	public void isEmptytest() throws Exception 
	{
		assertEquals(true, priority.isEmpty());
		priority.enQueue("job1",1);


		assertEquals(false, priority.isEmpty());

		priority.deQueue();

		assertEquals(true, priority.isEmpty());
	}

	@Test
	public void isFulltest() 
	{
		assertEquals(false, priority.isFull());
		priority.enQueue("job1",1);
		priority.enQueue("job2",2);
		priority.enQueue("job3",3);
		priority.enQueue("job4",4);
		priority.enQueue("job5",5);
		priority.enQueue("job6",6);
		assertEquals(false, priority.isFull());
	}

	@Test
	public void sizetest()
	{
		assertEquals(0, priority.getSize());
	}

	

}
