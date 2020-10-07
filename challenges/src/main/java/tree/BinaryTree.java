package tree;

import sun.misc.Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class BinaryTree extends Tree{
    public BinaryTree(Node root){
        super(root);
    }
    public BinaryTree(){
        super();
    }
    int maxValue;

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

    public int findMaxValue(Node current){

        if(current.value > maxValue) maxValue = current.value;
        if(current.left!= null) findMaxValue(current.left);
        if(current.right != null) findMaxValue(current.right);
        return maxValue;
    }

    public ArrayList<Integer> breadthFirst(BinaryTree tree) throws InterruptedException {
        ArrayList<Integer> output = new ArrayList<Integer>();
        Queue<Node> queue = new Queue<Node>();
        Node root = tree.root;
        queue.enqueue(root);
        while(!queue.isEmpty()){
            Node node = (Node) queue.dequeue(); //casts the value being dequeued as a Node and assigns it to a Node called node
            output.add(node.getValue());//adds node value that was just dequeued to output ArrayList
            if(node.left != null) queue.enqueue(node.left);
            if(node.right != null) queue.enqueue(node.right);
        }
        return output;
    }

}
