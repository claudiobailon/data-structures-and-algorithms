package data.Structures.stacksandqueues;

public class Queue {
    Node front = null;
    Node back = null;

    public void enqueue(int value){
        Node node = new Node(value);
        if(front != null)back.next = node;
        else front = node;
        back = node;
    }
    public int dequeue() throws NullPointerException{
        if( front == null) throw new NullPointerException();
        int output = front.value;
        front = front.next;
        if(front == null) back = null;
        return output;
    }
    public int peek()throws NullPointerException{
        if(front == null) throw new NullPointerException();
        return front.value;
    }

    public boolean isEmpty(){
        return front == null;
    }

    @Override
    public String toString(){
        return toString(front);
    }
    public String toString(Node node){
        if(node == null) return "NULL";
        return String.format("%s -> ", node.toString()) + toString(node.next);
    }
}
