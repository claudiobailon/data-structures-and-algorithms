package datastructures.graph.getedge;

import datastructures.graph.Graph;

import java.util.ArrayList;

public class GetEdge {
    public static FlightPlan planFlight(Graph flights, String[] destinations)throws Exception{
        if(destinations.length < 2) throw new Exception("Not enough destinations to plan trip");

        Graph.Node current = null;
        ArrayList<Graph.Node> graphFlights = flights.getNodes();
        for(int i = 0; i < graphFlights.size(); i++){
            Graph.Node destination = graphFlights.get(i);
            if(destination.getValue().equals(destinations[0])){
                current = destination;
            }
        }
        if(current == null)return new FlightPlan(false, 0);
        int cost = 0;
        for( int i =1; i<destinations.length; i++){
            int cheapest = Integer.MAX_VALUE;
            Graph.Edge cheapestRoute = null;
            ArrayList<Graph.Edge> currentEdges = current.getEdges();
            for(int j =0; j<currentEdges.size(); j++){
                Graph.Edge edge = currentEdges.get(j);
                if(edge.getDestination().getValue().equals(destinations[i])){
                    if(cheapestRoute == null){
                        cheapest = edge.getWeight();
                        cheapestRoute= edge;
                    }else{
                        if(edge.getWeight() < cheapest){
                            cheapest = edge.getWeight();
                            cheapestRoute = edge;
                        }
                    }
                }
            }
            if(cheapestRoute == null)return new FlightPlan(false,0);
            cost += cheapest;
            current = cheapestRoute.getDestination();
        }
        return new FlightPlan(true,cost);
    }



    public static class FlightPlan{
        boolean possible;
        int cost;

        public FlightPlan(boolean possible, int cost) {
            this.possible = possible;
            this.cost = cost;
        }

        @Override
        public String toString(){
            if(possible) return "True, $"+ cost;
            else return "False, $0";
        }
    }
}
