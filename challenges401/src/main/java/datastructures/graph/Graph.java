package datastructures.graph;

import java.util.ArrayList;

public class Graph<T> {
    ArrayList<Node> graphNodes = new ArrayList<>();// holds all nodes in graph

    //======================== Methods =============================
    public Node<T> addNode(T value){
        Node node = new Node(value);
        graphNodes.add(node);
        return node;
    }

    public void addEdge(Node nodeOne, Node nodeTwo)throws Exception{
        if(!graphNodes.contains(nodeOne) || !graphNodes.contains(nodeTwo)) throw new Exception("Node not in Graph");
        nodeOne.addEdge(nodeTwo);
        nodeTwo.addEdge(nodeOne);
    }

    public void addEdge(Node nodeOne, Node nodeTwo, int weight){
        nodeOne.addEdge(nodeTwo, weight);
        nodeTwo.addEdge(nodeOne, weight);
    }

    public ArrayList<Node> getNodes(){
        if(graphNodes.size()==0) return null;
        return graphNodes;
    }

    public ArrayList<Node> getNeighbors(Node node){return node.edges;}

    public int size(){return graphNodes.size();}

    //======================== Node Class =============================

    public static class Node<T> {
        public T value;
        public ArrayList<Edge> edges = new ArrayList<>();// holds edges connected to node

        public Node(T value){
            this.value= value;
        }

        public T getValue(){return value;}
        public void setValue(T value){this.value=value;}

        public void addEdge(Node destination){
            Edge edge = new Edge(new Node(value), destination);
            edges.add(edge);
        }
        public void addEdge(Node destination, int weight){
            Edge edge = new Edge(new Node(value), destination, weight);
            edges.add(edge);
        }

        public ArrayList<Edge> getEdges(){return edges;}

        @Override
        public String toString() {
            return "{" + "value=" + value + "}";
        }
    }

    //======================== Edge Class =============================
    public static class Edge{
        Node origin;
        Node destination;
        int weight =1;

        Edge(Node origin, Node destination){
            this.origin = origin;
            this. destination = destination;
        }
        Edge(Node origin, Node destination, int weight){
            this.origin = origin;
            this. destination = destination;
            this.weight = weight;
        }

        public Node getOrigin() {return origin; }
        public void setOrigin(Node origin) {this.origin = origin; }

        public Node getDestination() {return destination; }
        public void setDestination(Node destination) {this.destination = destination; }

        public int getWeight() { return weight; }
        public void setWeight(int weight) { this.weight = weight; }

        @Override public String toString() {
            return "{" + "origin=" + origin.getValue() + ", destination=" + destination.getValue() + '}';
        }
    }
}
