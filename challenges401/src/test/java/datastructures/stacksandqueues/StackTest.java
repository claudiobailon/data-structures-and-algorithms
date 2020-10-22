package datastructures.stacksandqueues;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    @Test public void testPush(){
        Stack stack = new Stack();
        stack.push(1);
        assertEquals(1,stack.top.value);

        stack.push(2);
        assertEquals(2,stack.top.value);
        assertEquals(1,stack.top.next.value);
    }
    @Test public void testPop(){
        Stack stack = new Stack();
        assertThrows(NullPointerException.class, () -> stack.pop());

        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop());
        assertEquals(1, stack.top.value);
        assertEquals(1, stack.pop());
        assertNull(stack.top);
    }
    @Test public void testPeek(){
        Stack stack = new Stack();
        assertThrows(NullPointerException.class, () -> stack.peek());

        stack.push(1);
        assertEquals(1, stack.peek());
        stack.push(2);
        assertEquals(2,stack.peek());
    }
    @Test public void testIsEmpty(){
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
    }
    @Test public void testToString(){
        Stack stack = new Stack();
        assertEquals("NULL", stack. toString());
        stack.push(1);
        assertEquals("{1} -> NULL", stack.toString());
        stack.push(2);
        assertEquals("{2} -> {1} -> NULL", stack.toString());
    }
}
