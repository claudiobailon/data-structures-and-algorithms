package datastructures.linkedList;

public class LinkedList {

    public static void main(String[] Args) throws Exception {
        LinkedList list = new LinkedList();
        list.insert(4);
        list.insert(2);
        list.insert(6);
        list.insert(5);
        list.append(3);
        list.insertBefore(2,1);
        list.insertAfter(2,7);
        System.out.println(list.includes(6));
        System.out.println(list);
        System.out.println(list.llKthFromTheEnd(2));
        System.out.println(list.llKthFromTheEnd(3));
        System.out.println(list.llKthFromTheEnd(4));
        System.out.println(list.llKthFromTheEnd(5));
        System.out.println(list.llKthFromTheEnd(6));
//        System.out.println(list.llKthFromTheEnd(10));
        LinkedList l2 = new LinkedList();
        LinkedList l3 = new LinkedList();
        l2.insert(5);
        l2.insert(8);
        l2.insert(9);
        l2.insert(3);
        System.out.println("List one: " + list);
        System.out.println("list two: " + l2);
        System.out.println("list three: "+ l3);

        LinkedList test = new LinkedList();
        LinkedList test2 = new LinkedList();
        LinkedList test3 = new LinkedList();
        LinkedList test4 = new LinkedList();
        LinkedList test5 = new LinkedList();
        LinkedList test6 = new LinkedList();

//        test.head = LinkedList.zipLists(list,l2);
        test2.head = LinkedList.zipLists(l2, list);
//        test3.head = LinkedList.zipLists(l3,l2);
//        test4.head = LinkedList.zipLists(l2, l3);
//        test5.head = LinkedList.zipLists(list, l3);
//        test6.head = LinkedList.zipLists(l3, list);
//        System.out.println(l3.toString());
//        System.out.println("List one and list two:" + test);
        System.out.println("List two and list one:" + test2);
//        System.out.println("List three and list two:" + test3);
//        System.out.println("List two and list three:"+ test4);
//        System.out.println("List one and list three:" + test5);
//        System.out.println("List three and list one:" + test6);



    }

    public class Node {
        public int value;
        public Node next = null;
        public Node prev = null;


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
//            System.out.println(listLength);
        }
      if(k >= listLength){
          throw new Exception("K is larger than the list");
      }
//        int kthValue = second.value;
        return String.format("This returns %d", second.value);
  }

  public static  Node zipLists(LinkedList l1, LinkedList l2) {
       Node n1 = l1.head;
       Node n2 = l2.head;
      if(l1 == null && l2 == null) return null;
      if(n1 == null) return n2;
      if(n2 == null) return n1;


      Node temp1 = n1.next;
       Node temp2 = n2.next;
       while(temp1 != null && temp2 != null){


           n1.next =n2;
           n2.next = temp1;

           n1 = temp1;
           n2 = temp2;
           temp1 = temp1.next;
           temp2 = temp2.next;
       }
//      if( n2 != null) n1.next = n2;
//      if( n1 != null) n2.next = temp1;
      n1.next = n2;
       if( temp1 != null)n2.next = temp1;


      return l1.head;

    }

  }

