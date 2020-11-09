package datastructures.graph.getedge;
import datastructures.graph.Graph;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetEdgeTest {

    public static Graph testGraph(){
        Graph testGraph = new Graph();
        Graph.Node Pandora = testGraph.addNode("Pandora");
        Graph.Node Metroville = testGraph.addNode("Metroville");
        Graph.Node Arendelle = testGraph.addNode("Arendelle");
        Graph.Node Monstropolis = testGraph.addNode("Monstropolis");
        Graph.Node Naboo = testGraph.addNode("Naboo");
        Graph.Node Narnia = testGraph.addNode("Narnia");

        testGraph.addEdge(Pandora,Arendelle, 150);
        testGraph.addEdge(Pandora,Metroville, 82);
        testGraph.addEdge(Arendelle,Metroville, 99);
        testGraph.addEdge(Arendelle,Monstropolis,42);
        testGraph.addEdge(Metroville,Monstropolis, 105);
        testGraph.addEdge(Monstropolis,Naboo, 73);
        testGraph.addEdge(Metroville,Naboo, 26);
        testGraph.addEdge(Naboo,Narnia, 250);
        testGraph.addEdge(Metroville,Narnia, 37);

        return testGraph;
    }

    @Test public void testSimpleFlight()throws Exception{
        Graph test = testGraph();
        GetEdge.FlightPlan panaren = GetEdge.planFlight(test, new String[]{"Pandora","Arendelle"});
        GetEdge.FlightPlan pannab = GetEdge.planFlight(test, new String[]{"Pandora","Naboo"});
        assertTrue(panaren.possible);//trip should be possible
        assertFalse(pannab.possible);//trip should not be possible
        assertEquals(150,panaren.cost);//cost should be 150
        assertEquals(0,pannab.cost);//cost for impossible trip should be 0
        assertEquals("True, $150", panaren.toString());//planFlight returns if flight is possible and cost
        assertEquals("False, $0", pannab.toString());

    }

    @Test public void testMultiLegFlight() throws Exception{
        Graph test = testGraph();
        GetEdge.FlightPlan panmetmon = GetEdge.planFlight(test, new String[]{"Pandora","Metroville","Monstropolis"});
        GetEdge.FlightPlan panmetmonaren = GetEdge.planFlight(test, new String[]{"Pandora","Metroville","Monstropolis","Arendelle"});
        GetEdge.FlightPlan narnabaren = GetEdge.planFlight(test, new String[]{"Narnia","Naboo","Arendelle"});
//        GetEdge.FlightPlan tooSmall = GetEdge.planFlight(test, new String[]{"Narnia"});

        assertTrue(panmetmon.possible);//multiple direct connections should be possible
        assertTrue(panmetmonaren.possible);//4 destinations should also be possible
        assertFalse(narnabaren.possible);//flight plan with an indirect flight should still be false
        assertEquals(187,panmetmon.cost);//cost should be 187
        assertEquals(229,panmetmonaren.cost);//cost should be 229
        assertEquals(0,narnabaren.cost);//cost of impossible trip should still be 0
        assertEquals("True, $187", panmetmon.toString());//toString method works on muli-destination flights
        assertEquals("True, $229", panmetmonaren.toString());
        assertEquals("False, $0", narnabaren.toString());


        assertThrows(Exception.class, () -> GetEdge.planFlight(test, new String[]{"Narnia"}));//should throw error if not enough destinations

    }
}
