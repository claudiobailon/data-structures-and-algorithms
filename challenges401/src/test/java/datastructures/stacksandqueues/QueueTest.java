package datastructures.stacksandqueues;
import org.junit.Test;

import static org.junit.Assert.*;
public class QueueTest {
    @Test public void testEnqueue(){
        Queue queue = new Queue();
        queue.enqueue(1);
        assertEquals(1, queue.front.value);
        assertEquals(1, queue.back.value);

        queue.enqueue(2);
        assertEquals(1, queue.front.value);
        assertEquals(2, queue.back.value);
    }
    @Test public void testDequeue(){
        Queue queue = new Queue();
        assertThrows(NullPointerException.class, () -> queue.dequeue());
        queue.enqueue(1);
        queue.enqueue(2);

        assertEquals(1, queue.dequeue());//removes 1 from queue
        assertEquals(2, queue.front.value);//2 is now at the front of the queue
        assertEquals(2, queue.dequeue());
        assertNull(queue.front);//Nothing left in queue
    }
    @Test public void testPeek(){
        Queue queue = new Queue();
        assertThrows(NullPointerException.class, () -> queue.peek());
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(1,queue.peek());

        queue.dequeue();
        assertEquals(2,queue.peek());
    }
    @Test public void testIsEmpty(){
        Queue queue = new Queue();
        assertTrue(queue.isEmpty());
        queue.enqueue(1);
        assertFalse(queue.isEmpty());
    }
    @Test public void testToString(){
        Queue queue = new Queue();
        assertEquals("NULL", queue.toString());

        queue.enqueue(1);
        assertEquals("{1} -> NULL", queue.toString());
        queue.enqueue(2);
        assertEquals("{1} -> {2} -> NULL", queue.toString());
    }
}
