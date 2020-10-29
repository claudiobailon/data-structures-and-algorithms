package challenges.treeintersection;


import challenges.tree.BinaryTree;
import challenges.tree.Node;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TreeIntersectionTest {

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
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);
        Node eight = new Node(8);
        Node nine = new Node(9);
        Node ten = new Node(10);
        Node eleven = new Node(11);

        four.setLeft(ten);               //4
        four.setRight(six);       //10          6
        ten.setLeft(eleven);   //11    9     5     7
        ten.setRight(nine);  //      8
        nine.setLeft(eight);//      ^^visual^^
        six.setLeft(five);
        six.setRight(seven);
        return four;
    }
    public static Node createTree3(){
        Node twenty = new Node(20);
        Node thirty = new Node(30);
        Node forty = new Node(40);
        Node fifty = new Node(50);
        Node sixty = new Node(60);
        Node seventy = new Node(70);
        Node eighty = new Node(80);

        twenty.setLeft(thirty);            //20
        twenty.setRight(sixty);       //30       60
        thirty.setLeft(forty);      //40 50    80  70
        thirty.setRight(fifty); //    ^^visual^^
        sixty.setLeft(eighty);
        sixty.setRight(seventy);
        return twenty;
    }
    BinaryTree testTree1 = new BinaryTree(createTree());
    BinaryTree testTree2 = new BinaryTree(createTree2());
    BinaryTree testTree3 = new BinaryTree(createTree3());
    BinaryTree testTree4 = new BinaryTree();

    @Test public void testTreeIntersection() throws Exception {
        ArrayList<Integer> test = TreeIntersection.treeIntersection(testTree1, testTree2);

        assertEquals("[4, 6, 5, 7]", test.toString());
        assertThrows(Exception.class, ()-> TreeIntersection.treeIntersection(testTree3, testTree4));//throws exception when one tree has empty root
    }

    @Test public void testTreeIntersectionNoDuplicates() throws Exception{
        ArrayList<Integer> test = TreeIntersection.treeIntersection(testTree2, testTree3);//trees have no intersections, so resulting arraylist should be empty
        assertEquals(0, test.size());
    }

}
