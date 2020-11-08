package datastructures.graph.breadthfirst;

import datastructures.graph.Graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirst {

    public static ArrayList<Graph.Node> breadthFirst(Graph.Node node) throws Exception{
        if(node == null) throw new Exception("Cannot traverse if input is null");

        ArrayList<Graph.Node> output = new ArrayList<>();
        HashSet<Graph.Node> visited = new HashSet<>();
        Queue<Graph.Node> queue = new LinkedList<>();

        visited.add(node);
        queue.add(node);

        while(!queue.isEmpty()){
            Graph.Node temp = queue.remove();
            ArrayList<Graph.Edge> tempEdges = temp.getEdges();
            for(int i =0; i< tempEdges.size(); i++){
                Graph.Node neighbor = tempEdges.get(i).getDestination();
                if(visited.add(neighbor)){
                    queue.add(neighbor);
                }
            }
            output.add(temp);
        }
        System.out.println(output);
        return output;
    }


}
