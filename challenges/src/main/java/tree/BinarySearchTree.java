package tree;

public class BinarySearchTree extends BinaryTree{

    public BinarySearchTree(Node root){
        super(root);
    }

    public BinarySearchTree(){
        super();
    }

    public void add(int value, Node current) throws Exception{
        if(current == null){
            this.setRoot(new Node(value));
            return;
        }
        if(value == current.getValue()) throw new Exception("Value is already on this tree");

        if(value < current.getValue()){
            if(current.getLeft() == null){
                current.setLeft(new Node(value));
                return;
            } else{
                add(value, current.getLeft());
                return;
            }
        }
        if(value > current.getValue()){
            if(current.getRight() == null){
                current.setRight(new Node(value));
                return;
            } else{
                add(value, current.getRight());
                return;
            }
        }
    }
    public boolean contains(int value, Node current){// help from https://stackoverflow.com/questions/46385970/binary-search-tree-find-if-value-exists
//        Node current = new Node(value);
        if(current == null) return false;
        if(value == current.getValue())return true;
        if(value < current.getValue()) return contains(value, current.getLeft());
        return contains(value, current.getRight());
    }
}
