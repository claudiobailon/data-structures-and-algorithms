package datastructures.stacksandqueues;

public class Stack {
    Node top = null;

    public void push(int value){
        Node newNode = new Node(value);
        newNode.next= top;
        top = newNode;
    }
    public int pop() throws NullPointerException{
        if(isEmpty()) throw new NullPointerException();
        int popped = top.value;
        top = top.next;
        return popped;
    }
    public int peek() throws NullPointerException{
        if(isEmpty()) throw new NullPointerException();
        return top.value;
    }
    public boolean isEmpty(){
        return top == null;
    }

    @Override
    public String toString(){
        return toString(top);
    }
    public String toString(Node node){
        if(node == null) return "NULL";
        return String.format("%s -> ", node.toString()) + toString(node.next);
    }

}
