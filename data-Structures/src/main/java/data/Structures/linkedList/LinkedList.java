package data.Structures.linkedList;

public class LinkedList {

    public static void main(String[] Args) throws Exception {
        LinkedList list = new LinkedList();
        list.insert(4);
        list.insert(2);
        list.insert(6);
        list.insert(5);
        list.append(3);
        list.insertBefore(2,9);
        list.insertAfter(2,7);
        System.out.println(list.includes(6));
        System.out.println(list);
        System.out.println(list.llKthFromTheEnd(2));
        System.out.println(list.llKthFromTheEnd(3));
        System.out.println(list.llKthFromTheEnd(4));
        System.out.println(list.llKthFromTheEnd(5));
        System.out.println(list.llKthFromTheEnd(6));
//        System.out.println(list.llKthFromTheEnd(10));

    }

    public class Node {
        public int value;
        public Node next;
        public Node prev;


        public  Node(int value){
            this.value = value;
            this.next = null;
            this.prev = null;

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
    public String toString(){
        return toString(this.head);
    }

   public String toString(Node current) {
       if (current == null) {
           return "NULL";
       }
       String output = String.format("{%d} -> %s", current.value,toString(current.next));
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

   public void append(int newValue){
       Node newNode = new Node(newValue);
       if(head == null){
           head = newNode;
           tail = newNode;
           return;
       }
       newNode.next = null;

       Node last = head;
       while( last.next != null){
           last = last.next;
       }
       last.next = newNode;
       return;

   }
   public void insertBefore(int numToSearch, int newValue) throws Exception {
        Node previousChecked = head;
        if (head.value == numToSearch) {
            insert(newValue);
        }
        do {
            if (previousChecked.next == null) {
                throw new Exception("That value is not in this linked list.");
            }
            if (previousChecked.next.value == numToSearch) {
                Node newNode = new Node(newValue);
                newNode.next = previousChecked.next;
                previousChecked.next = newNode;
                return;
            } else {
                previousChecked = previousChecked.next;
            }
        } while (previousChecked != null);
    }

   

  public void insertAfter(int numToSearch, int newValue) throws Exception {
      Node currentNode = head;
      while(currentNode != null){
          if(currentNode.value == numToSearch){
              Node newNode = new Node(newValue);
              newNode.next = currentNode.next;
              currentNode.next = newNode;
              return;
          }
          currentNode = currentNode.next;
      }
      throw new Exception("That value is not in this linked list.");
  }

  public String llKthFromTheEnd(int k) throws Exception{
//Solution help from https://leetcode.com/problems/remove-nth-node-from-end-of-list/solution/
      Node node = head;
       Node first = node;
       Node second = node;
      if(k < 0){
          throw new Exception("K cannot be negative");
      }
      int listLength = 0;
       for(int i =0; i < k + 1; i++){
           first = first.next;
           listLength ++;
       }
        while(first != null){
            first = first.next;
            second = second.next;
            System.out.println(listLength);
        }
      if(k >= listLength){
          throw new Exception("K is larger than the list");
      }
//        int kthValue = second.value;
        return String.format("This returns %d", second.value);
  }

  }

