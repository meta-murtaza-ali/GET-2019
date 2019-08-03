package Question2;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestQueue {
    QueueOperations queueInstance;

    //test cases for enQueue()
    @Test
    public void testenQueueShouldReturnTrueWhenFirstValueAdded() {
        queueInstance=new QueueOperations(10);
        boolean isenQueue=queueInstance.enQueue(5);
        assertEquals(true,isenQueue);
    }
    
    @Test
    public void testenQueueShouldReturnTrueWhenQueueNotFullAndRearNotAtEnd() {
        queueInstance=new QueueOperations(10);
        queueInstance.enQueue(56);
        queueInstance.enQueue(7);
        boolean isenQueue=queueInstance.enQueue(5);
        assertEquals(true,isenQueue);
    }
    
    @Test
    public void testenQueueShouldReturnTrueWhenQueueNotFullAndRearAtEnd() {
        queueInstance=new QueueOperations(4);
        queueInstance.enQueue(56);
        queueInstance.enQueue(7);
        queueInstance.enQueue(7);
        queueInstance.enQueue(7);
        queueInstance.deQueue();
        boolean isenQueue=queueInstance.enQueue(5);
        assertEquals(true,isenQueue);
    }
    
    @Test
    public void testenQueueShouldReturnFalseWhenQueueFullAndRearAtEnd() {
        queueInstance=new QueueOperations(2);
        queueInstance.enQueue(5);
        queueInstance.enQueue(20);
        boolean isenQueue=queueInstance.enQueue(34);
        assertEquals(false,isenQueue);
    }
    
    @Test
    public void testenQueueShouldReturnFalseWhenQueueFullAndRearNotAtEnd() {
        queueInstance=new QueueOperations(4);
        queueInstance.enQueue(5);
        queueInstance.enQueue(20);
        queueInstance.enQueue(4);
        queueInstance.deQueue();
        queueInstance.enQueue(2);
        queueInstance.enQueue(9);
        boolean isenQueue=queueInstance.enQueue(34);
        assertEquals(false,isenQueue);
    }
    
    //test cases for deQueue()
    @Test
    public void testdeQueueShouldReturnObjectWhenQueueNotEmptyAndRearNotAtEnd() {
        queueInstance=new QueueOperations(10);
        queueInstance.enQueue(5);
        queueInstance.enQueue(47);
        queueInstance.enQueue(20);
        boolean actualOutput=queueInstance.deQueue();
        boolean expectedOutput=true;
        assertEquals(expectedOutput,actualOutput);
    }
    
    @Test
    public void testdeQueueShouldReturnObjectWhenQueueNotEmptyAndRearAtEnd() {
        queueInstance=new QueueOperations(4);
        queueInstance.enQueue(5);
        queueInstance.enQueue(47);
        queueInstance.deQueue();
        queueInstance.enQueue(20);
        queueInstance.enQueue(20);
        boolean actualOutput=queueInstance.deQueue();
        boolean expectedOutput=true;
        assertEquals(expectedOutput,actualOutput);
    }
    
       
    //test cases for isEmpty()
    @Test
    public void testIsEmptyShouldReturnFalseWhenQueueNotEmptyAndRearNotAtEnd() {
        queueInstance=new QueueOperations(10);
        queueInstance.enQueue(5);
        queueInstance.enQueue(47);
        queueInstance.enQueue(20);
        boolean actualOutput=queueInstance.isEmpty();
        assertEquals(false,actualOutput);
    }
    
    @Test
    public void testIsEmptyShouldReturnFalseWhenQueueNotEmptyAndRearAtEnd() {
        queueInstance=new QueueOperations(4);
        queueInstance.enQueue(5);
        queueInstance.enQueue(47);
        queueInstance.deQueue();
        queueInstance.enQueue(20);
        queueInstance.enQueue(47);
        boolean actualOutput=queueInstance.isEmpty();
        assertEquals(false,actualOutput);
    }
    
    @Test
    public void testIsEmptyShouldReturnTrueWhenQueueIsEmpty() {
        queueInstance=new QueueOperations(10);
        boolean actualOutput=queueInstance.isEmpty();
        assertEquals(true,actualOutput);
    }
    
    //test cases for isFull()
    @Test
    public void testIsFullShouldReturnFalseWhenQueueNotFullAndRearNotAtEnd() {
        queueInstance=new QueueOperations(10);
        queueInstance.enQueue(5);
        queueInstance.enQueue(47);
        queueInstance.enQueue(20);
        boolean actualOutput=queueInstance.isFull();
        assertEquals(false,actualOutput);
    }
    
    @Test
    public void testIsFullShouldReturnFalseWhenQueueNotFullAndRearAtEnd() {
        queueInstance=new QueueOperations(4);
        queueInstance.enQueue(5);
        queueInstance.enQueue(47);
        queueInstance.deQueue();
        queueInstance.enQueue(20);
        queueInstance.enQueue(47);
        boolean actualOutput=queueInstance.isFull();
        assertEquals(false,actualOutput);
    }
    
    @Test
    public void testIsFullShouldReturnTrueWhenQueueIsFullAndRearAtEnd() {
        queueInstance=new QueueOperations(2);
        queueInstance.enQueue(5);
        queueInstance.enQueue(47);
        boolean actualOutput=queueInstance.isFull();
        assertEquals(true,actualOutput);
    }
    
    @Test
    public void testIsFullShouldReturnTrueWhenQueueIsFullAndRearNotAtEnd() {
        queueInstance=new QueueOperations(4);
        queueInstance.enQueue(5);
        queueInstance.enQueue(47);
        queueInstance.deQueue();
        queueInstance.enQueue(4);
        queueInstance.enQueue(7);
        queueInstance.enQueue(48);
        boolean actualOutput=queueInstance.isFull();
        assertEquals(true,actualOutput);
    }

}