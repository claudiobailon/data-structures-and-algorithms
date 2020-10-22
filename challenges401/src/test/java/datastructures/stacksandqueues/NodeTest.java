package datastructures.stacksandqueues;
import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {
    @Test public void testNode(){
        Node node = new Node(1);
        assertNotNull(node);
    }
    @Test public void testToString(){
        Node node = new Node(1);
        assertEquals("{1}", node.toString());
    }

}
