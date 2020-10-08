package utilities;

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
        T value;
        List<KNode<T>> children = new ArrayList<>();

        public KNode(T value){this.value = value;}

        public boolean addChild(KNode<T> child) { return this.children.add(child); }

        public T getValue() { return value; }

        public List<KNode<T>> getChildren() { return children; }
    }

}
