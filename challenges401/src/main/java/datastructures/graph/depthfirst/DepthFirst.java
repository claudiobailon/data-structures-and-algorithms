package datastructures.graph.depthfirst;

import datastructures.graph.Graph;

import java.util.ArrayList;
import java.util.HashSet;

public class DepthFirst {
    public static ArrayList<Graph.Node> depthFirst(Graph graph) {
        ArrayList<Graph.Node> output = new ArrayList<>();
        HashSet<Graph.Node> visited = new HashSet<>();
        ArrayList<Graph.Node> graphNodes = graph.getNodes();

        if(graph.getNodes() !=null) {
            for (int i=0; i< graphNodes.size(); i++) {
                setNodeList(graphNodes.get(i), output, visited);
            }
        }
        return output;
    }

    static void setNodeList(Graph.Node node, ArrayList<Graph.Node> output, HashSet<Graph.Node> visited){
        ArrayList<Graph.Edge> neighbors = node.getEdges();
        if(visited.add(node)){
            output.add(node);
            for(int j= 0; j< neighbors.size(); j++){
                setNodeList(neighbors.get(j).getDestination(), output, visited);
            }
        }
    }
}
