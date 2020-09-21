package Data.Structures.linkedList;

public class LinkedList {

    public static void main(String[] Args){
        LinkedList list = new LinkedList();
        list.insert(4);
        list.insert(2);
        list.insert(6);
        System.out.println(list.includes(5));
        System.out.println(list);
    }

    public class Node {
        public int value;
        public Node next;

        public  Node(int value){
            this.value = value;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

   public void insert(int newValue){
        Node newNode = new Node(newValue);
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
   }
   public String toString() {
       if (this.head == null) {
           return "NULL";
       }
       String output = String.format("{%s}", this.head.toString());
       Node nextNode = this.head.next;
       while (nextNode != null) {
           output += String.format(" -> {%s}", nextNode.toString());
           nextNode = nextNode.next;
       }
       output += " -> NULL";
       return output;
   }
   public boolean includes ( int value){
       Node nextNode = this.head.next;

       if (this.head.value == value) {
           return true;
       }
       while (nextNode != null) {
           if (nextNode.value == value) {
               return true;
           }
           nextNode = nextNode.next;
       }
       return false;
   }

}
