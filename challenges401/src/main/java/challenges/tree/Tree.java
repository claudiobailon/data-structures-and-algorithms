package challenges.tree;

public class Tree {
    Node root = null;

    public Tree(Node root){
        this.root = root;
    }
    public Tree(){}

    public Node getRoot(){
        return root;
    }
    public void setRoot(Node root){
        this.root = root;
    }
}
