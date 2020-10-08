package utilities;

import org.checkerframework.checker.units.qual.K;

import java.util.ArrayList;

public class FizzBuzzTree {
    private KaryTree.KNode root;

    public static KaryTree<String> fizzBuzzTree(KaryTree<Integer> input){
        KaryTree<String> output = new KaryTree<String>();
        output.setRoot(fizzBuzz(input.getRoot()));
        return output;
    }

    public static KaryTree.KNode<String> fizzBuzz(KaryTree.KNode<Integer> current){
        KaryTree.KNode<String> node = new KaryTree.KNode<>(fizzBuzzed(current.getValue()));
        for(KaryTree.KNode<Integer> child: current.getChildren()){
            node.addChild(fizzBuzz(child));
        }
        return node;
    }
    public static String fizzBuzzed(int value){
        if (value % 15 == 0) return "FizzBuzz";
        if (value % 3 == 0) return "Fizz";
        if (value % 5 == 0) return "Buzz";
        return Integer.toString(value);
    }


}
