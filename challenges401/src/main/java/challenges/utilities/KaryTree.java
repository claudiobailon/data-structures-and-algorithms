package challenges.utilities;

import org.checkerframework.checker.units.qual.K;

import java.util.ArrayList;
import java.util.List;

//help with generics https://docs.oracle.com/javase/tutorial/java/generics/types.html
public class KaryTree<T> {
    KNode<T> root = null;

    public KaryTree(){}
    public KaryTree(KNode<T> root){this.root = root;}

    public KNode<T> getRoot(){return root;}
    public void setRoot(KNode<T> root){this.root = root;}

    static class KNode<T>{
        private T value;
        private ArrayList<KNode<T>> children = new ArrayList<>();

        public KNode(T value){this.value = value;}

        public void addChild(KNode<T> child) { children.add(child); }

        public T getValue() { return value; }
        public void setValue(T value){this.value = value;}

        public ArrayList<KNode<T>> getChildren() { return children; }

    }
    public String toString(){return toString(this.root);}
    public String toString(KaryTree.KNode current){
        String output = current.getValue().toString();
        for(KaryTree.KNode next : (ArrayList<KaryTree.KNode>) current.getChildren()){
            output += " -> " + toString(next);
        }
        return output;

    }

}
