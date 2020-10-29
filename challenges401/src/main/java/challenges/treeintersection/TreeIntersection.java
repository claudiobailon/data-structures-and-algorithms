package challenges.treeintersection;

import challenges.tree.BinaryTree;
import challenges.tree.Node;

import java.util.ArrayList;
import java.util.HashMap;

public class TreeIntersection {


    public static ArrayList<Integer> treeIntersection(BinaryTree tree1, BinaryTree tree2) throws Exception{
        if(tree1.getRoot() == null || tree2.getRoot() == null ){
            throw new Exception("That tree has no root");
        }
        HashMap listFromTreeOne = new HashMap();
        ArrayList<Integer> listOfDuplicates = new ArrayList<>();
        populateFirstList(tree1.getRoot(), listFromTreeOne);
        populateDuplicateList(tree2.getRoot(), listOfDuplicates, listFromTreeOne);
        return listOfDuplicates;
    }

    private static void populateFirstList(Node node, HashMap first){
        if(node != null){
            first.put(node.getValue(),node.getValue());
            populateFirstList(node.getLeft(),first);
            populateFirstList(node.getRight(),first);
        }
    }

    private static void populateDuplicateList(Node node, ArrayList<Integer> duplicate, HashMap first){
        if(node!= null){
            if(first.containsKey(node.getValue())) duplicate.add(node.getValue());
            populateDuplicateList(node.getLeft(), duplicate, first);
            populateDuplicateList(node.getRight(), duplicate, first);

        }
    }
}
