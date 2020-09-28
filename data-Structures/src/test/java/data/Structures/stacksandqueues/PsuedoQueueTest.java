package data.Structures.stacksandqueues;
import org.junit.Test;

import static org.junit.Assert.*;
public class PsuedoQueueTest {
    @Test public void testEnqueue(){
        PsuedoQueue queue = new PsuedoQueue();
        queue.enqueue(1);
        assertEquals(1, queue.inputStack.peek());//checks to make sure value as been added
//        queue.enqueue(2);
//        queue.dequeue();
//        assertEquals(2, queue.inputStack.peek());//checks that 1 has been dequeued and 2 still remains
    }
    @Test public void testDequeue(){
        PsuedoQueue queue = new PsuedoQueue();
        assertThrows(NullPointerException.class, () -> queue.dequeue());
        queue.enqueue(1);
        queue.enqueue(2);

        assertEquals(1, queue.dequeue());

    }
}
