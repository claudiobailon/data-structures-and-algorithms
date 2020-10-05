package tree;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;


public class BinaryTreeTest {

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
    public static Node createTree2(){
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);
        Node eight = new Node(8);
        Node nine = new Node(9);
        Node ten = new Node(10);
        Node eleven = new Node(11);

        four.setLeft(two);             //4
        four.setRight(six);       //2          6
        two.setLeft(one);      //1    3     5     7
        two.setRight(three);  //    9  8        11
        three.setLeft(nine);//                    10
        three.setRight(eight);//  ^^visual^^
        six.setLeft(five);
        six.setRight(seven);
        seven.setLeft(eleven);
        eleven.setRight(ten);
        return four;
    }

    @Test public void testPreOrder(){
        Node root = createTree();
        BinaryTree tree = new BinaryTree(root);

        System.out.println(tree.preOrder(tree.getRoot(), new ArrayList<Integer>()));
        assertEquals("[4, 2, 1, 3, 6, 5, 7]", // values are added as they as they come up
                tree.preOrder(tree.getRoot(), new ArrayList<Integer>()).toString());
    }
    @Test public void testInOrder(){
        Node root = createTree();
        BinaryTree tree = new BinaryTree(root);

        System.out.println(tree.inOrder(tree.getRoot(), new ArrayList<Integer>()));
        assertEquals("[1, 2, 3, 4, 5, 6, 7]", // values are added when they have no left (or left has been added)
                tree.inOrder(tree.getRoot(), new ArrayList<Integer>()).toString());
    }
    @Test public void testPostOrder(){
        Node root = createTree();
        BinaryTree tree = new BinaryTree(root);

        System.out.println(tree.postOrder(tree.getRoot(), new ArrayList<Integer>()));
        assertEquals("[1, 3, 2, 5, 7, 6, 4]", // values are added when they have no left or right or they both have already been added
                tree.postOrder(tree.getRoot(), new ArrayList<Integer>()).toString());
    }
    @Test public void testFindMaxValue(){
        Node root = createTree();
        Node root2= createTree2();
        BinaryTree tree = new BinaryTree(root);
        BinaryTree tree2 = new BinaryTree(root2);

        assertEquals(7,tree.findMaxValue(root));//works on balanced tree
        assertEquals(11,tree2.findMaxValue(root2));//works on unbalanced tree

    }

}
