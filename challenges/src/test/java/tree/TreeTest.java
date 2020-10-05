package tree;

import org.junit.Test;
import static org.junit.Assert.*;

public class TreeTest {
    @Test public void testTree(){
        Tree tree = new Tree();
        assertNotNull(tree);// there should be a tree created
        assertNull(tree.root);//root should be empty

        tree.setRoot(new Node(1));//setRoot method should set root to 1
        assertEquals(1,tree.getRoot().getValue());

    }


}
