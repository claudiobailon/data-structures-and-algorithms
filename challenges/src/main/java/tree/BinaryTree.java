package tree;

import java.util.ArrayList;

public class BinaryTree extends Tree{
    public BinaryTree(Node root){
        super(root);
    }
    public BinaryTree(){
        super();
    }

    public ArrayList<Integer> preOrder(Node current, ArrayList<Integer> output){
        output.add(current.getValue());
        if(current.left != null)preOrder(current.left,output);
        if(current.right != null)preOrder(current.right, output);
        return output;
    }

    public ArrayList<Integer> inOrder(Node current, ArrayList<Integer> output){
        if(current.left != null) inOrder(current.left, output);
        output.add(current.getValue());
        if(current.right != null) inOrder(current.right, output);
        return output;
    }

    public ArrayList<Integer> postOrder(Node current, ArrayList<Integer> output){
        if(current.left != null) postOrder(current.left, output);
        if(current.right != null) postOrder(current.right, output);
        output.add(current.getValue());
        return output;
    }



}
