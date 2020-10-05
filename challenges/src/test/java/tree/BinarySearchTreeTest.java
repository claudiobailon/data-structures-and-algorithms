package tree;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;


public class BinarySearchTreeTest {
    public static Node createTree(){
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);

        four.setLeft(two);           //4
        four.setRight(six);       //2     6
        two.setLeft(one);       //1  3  5  7
        two.setRight(three); //  ^^visual^^
        six.setLeft(five);
        six.setRight(seven);
        return four;
    }

    @Test public void testAddLeft() throws Exception{
        BinarySearchTree tree = new BinarySearchTree(new Node(4));
        tree.add(3, tree.getRoot());
        System.out.println(tree.inOrder(tree.getRoot(), new ArrayList<Integer>()));
        assertEquals("[3, 4]", // value less than current should be added to the left
                tree.inOrder(tree.getRoot(), new ArrayList<Integer>()).toString());

    }
    @Test public void testAddRight() throws Exception{
        BinarySearchTree tree = new BinarySearchTree(new Node(4));
        tree.add(5, tree.getRoot());
        System.out.println(tree.inOrder(tree.getRoot(), new ArrayList<Integer>()));
        assertEquals("[4, 5]", //value greater than current should be added to the right
                tree.inOrder(tree.getRoot(), new ArrayList<Integer>()).toString());

    }
    @Test public void testContains() throws Exception{
        BinarySearchTree tree = new BinarySearchTree();
        assertFalse(tree.contains(3, tree.getRoot()));
        tree.add(4, tree.getRoot());
        assertTrue(tree.contains(4,tree.getRoot()));//should return true if tree contains value
        tree.add(1, tree.getRoot());
        tree.add(2, tree.getRoot());
        tree.add(3, tree.getRoot());
        tree.add(5, tree.getRoot());
        tree.add(6, tree.getRoot());
        tree.add(7, tree.getRoot());
        System.out.println(tree.inOrder(tree.getRoot(), new ArrayList<Integer>()));
        assertTrue(tree.contains(1,tree.getRoot()));
        assertTrue(tree.contains(2,tree.getRoot()));
        assertTrue(tree.contains(3,tree.getRoot()));
        assertTrue(tree.contains(5,tree.getRoot()));
        assertTrue(tree.contains(6,tree.getRoot()));
        assertTrue(tree.contains(7,tree.getRoot()));
        assertFalse(tree.contains(8,tree.getRoot()));// should return false if tree does not contain value


    }
}
