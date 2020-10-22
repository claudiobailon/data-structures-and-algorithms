package challenges.utilities;

public class AnimalShelter {
    Node front = null;
    Node back = null;

    public void enqueue(Animal animal){
        Node node = new Node(animal);
        if(front == null)front = node;//changes front node to inputted animal if queue is empty
        else if (front.next == null) {//if front has no next, back is set to inputted animal and front points to the new back
          back = node;
          front.next = back;
        }else{//if there is already a queue, new animal is set to the back
            back.next = node;
            back = back.next;
        }
    }
    public Animal dequeue(String pref) {
        if( !pref.equals("dog") && !pref.equals("cat")) return null;//if pref is not cat or dog, return null
        if(front == null) return null;//return null if queue is empty
        if(front.animal.type.equals(pref)){//if the pref matches the animal in front of queue, return that animal
            Node temp = front;
            front = front.next;
            return temp.animal;
        }
        return search(front.next, front, pref);
    }
    private Animal search(Node node, Node prevNode, String pref){
        if(node == null)return null;
        if(node.animal.type.equals(pref)){
            prevNode.next = node.next;
            return node.animal;
        }
        return search(node.next, node, pref);
    }
    @Override
    public String toString(){
        return toString(front);
    }
    private String toString(Node node){
        if(node == null)return "NULL";
        return String.format("{%s} -> %s", node.animal.toString(), toString(node.next));
    }

}
