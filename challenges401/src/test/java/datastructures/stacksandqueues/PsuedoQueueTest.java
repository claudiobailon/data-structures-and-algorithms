package datastructures.stacksandqueues;
import org.junit.Test;

import static org.junit.Assert.*;
public class PsuedoQueueTest {
    @Test public void testEnqueue(){
        PsuedoQueue queue = new PsuedoQueue();
        queue.enqueue(1);
        assertEquals(1, queue.inputStack.peek());//checks to make sure value as been added
        queue.enqueue(2);
        assertEquals(2, queue.inputStack.peek());//checks that 2 has been added
    }
    @Test public void testDequeue(){
        PsuedoQueue queue = new PsuedoQueue();
        assertThrows(NullPointerException.class, () -> queue.dequeue());//throws exception if queue is empty
        queue.enqueue(1);
        queue.enqueue(2);

        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.dequeue());

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();//takes 1 out of queue
        queue.dequeue();//takes 2 out of queue
        queue.enqueue(4);//adds 4 to queue
        queue.enqueue(5);// adds 5 to queue
        queue.enqueue(6);// adds 6 to queue

        assertEquals(3, queue.dequeue());//empties last of the original queue
        assertEquals(4, queue.dequeue());//makes sure 4,5,6 were added to output stack correctly
        assertEquals(5, queue.dequeue());
        assertEquals(6, queue.dequeue());
        assertThrows(NullPointerException.class, () -> queue.dequeue());//should throw exception on this now empty stack


    }
}
