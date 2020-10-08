package utilities;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {
    public static KaryTree<Integer> createTree() {
        KaryTree.KNode<Integer> root = new KaryTree.KNode<>(5);
        KaryTree.KNode<Integer> six = new KaryTree.KNode<>(6);       // visual:
        KaryTree.KNode<Integer> seven = new KaryTree.KNode<>(7);                          //5
        KaryTree.KNode<Integer> eight = new KaryTree.KNode<>(8);          //6               7                8
        KaryTree.KNode<Integer> nine = new KaryTree.KNode<>(9);  //  9    10   11    12    13   14     15    16   30
        KaryTree.KNode<Integer> ten = new KaryTree.KNode<>(10);
        KaryTree.KNode<Integer> eleven = new KaryTree.KNode<>(11);
        KaryTree.KNode<Integer> twelve = new KaryTree.KNode<>(12);
        KaryTree.KNode<Integer> thirteen = new KaryTree.KNode<>(13);
        KaryTree.KNode<Integer> fourteen = new KaryTree.KNode<>(14);
        KaryTree.KNode<Integer> fifteen = new KaryTree.KNode<>(15);
        KaryTree.KNode<Integer> sixteen = new KaryTree.KNode<>(16);
        KaryTree.KNode<Integer> thirty = new KaryTree.KNode<>(30);

        root.addChild(six);
        root.addChild(seven);
        root.addChild(eight);
        six.addChild(nine);
        six.addChild(ten);
        six.addChild(eleven);
        seven.addChild(twelve);
        seven.addChild(thirteen);
        seven.addChild(fourteen);
        eight.addChild(fifteen);
        eight.addChild(sixteen);
        eight.addChild(thirty);

        return new KaryTree<>(root);
    }
    public static KaryTree<Integer> createTree2() {
        KaryTree.KNode<Integer> root = new KaryTree.KNode<>(4);//visual:
        KaryTree.KNode<Integer> seven = new KaryTree.KNode<>(7);                          //4
        KaryTree.KNode<Integer> eight = new KaryTree.KNode<>(8);           //7             8            19
        KaryTree.KNode<Integer> nineteen = new KaryTree.KNode<>(19);  //  13   14           11        16
        KaryTree.KNode<Integer> eleven = new KaryTree.KNode<>(11);
        KaryTree.KNode<Integer> thirteen = new KaryTree.KNode<>(13);
        KaryTree.KNode<Integer> fourteen = new KaryTree.KNode<>(14);
        KaryTree.KNode<Integer> sixteen = new KaryTree.KNode<>(16);

        root.addChild(seven);
        root.addChild(eight);
        root.addChild(nineteen);
        seven.addChild(thirteen);
        seven.addChild(fourteen);
        eight.addChild(eleven);
        nineteen.addChild(sixteen);

        return new KaryTree<>(root);
    }

    @Test public void testFizzBuzzTree(){
        KaryTree<Integer> input = createTree();
        KaryTree<Integer> input2 = createTree2();

        KaryTree<String> output = FizzBuzzTree.fizzBuzzTree(input);
        KaryTree<String> output2 = FizzBuzzTree.fizzBuzzTree(input2);
        String expected = "Buzz -> Fizz -> Fizz -> Buzz -> 11 -> 7 -> Fizz -> 13 -> 14 -> 8 -> FizzBuzz -> 16 -> FizzBuzz";
        String expected2 = "4 -> 7 -> 13 -> 14 -> 8 -> 11 -> 19 -> 16";
        String recieved = output.toString();
        String recieved2 = output2.toString();
        assertEquals(expected,recieved);//changes correct values
        assertEquals(expected2, recieved2);//doensn't change anything if no values are divisible by 3 or 5
    }

}
