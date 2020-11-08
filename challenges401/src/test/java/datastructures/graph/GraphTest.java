package datastructures.graph;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class GraphTest {
    @Test public void testCreateGraph(){
        Graph test = new Graph();
        assertNotNull(test);
        assertEquals(0, test.size());
    }
    @Test public void testAddNode(){
        Graph test = new Graph();
        Graph.Node node = test.addNode("Connell");
        assertEquals(1, test.size());
        assertEquals("Connell",node.getValue());//node contains added value
        Graph.Node node2 = test.addNode(12);
        assertEquals(12,node2.getValue());//node is generic and works for ints as well as Strings
    }
    @Test public void testAddEdge() throws Exception {
        //I had trouble doing an assertTrue to see if an edge was in the array list of edges
        Graph test = new Graph();
        Graph.Node node = test.addNode("Connell");
        Graph.Node node2 = test.addNode("Othello");
        Graph.Node node3= test.addNode("Warden");
        Graph.Node node4= test.addNode("Lind");
        Graph.Node node5= new Graph.Node("Pasco");

        test.addEdge(node, node2);
        Graph.Edge testEdge = new Graph.Edge(node, node2);
        assertEquals( 1, node.edges.size());
        assertEquals( 1, node2.edges.size());
        assertEquals("{origin=Connell, destination=Othello}", node.edges.get(0).toString());//edges arraylist has correct edge
        assertEquals("{origin=Othello, destination=Connell}", node2.edges.get(0).toString());//edges arraylist has correct edge
        test.addEdge(node, node3);
        test.addEdge(node, node4);
        test.addEdge(node2, node4);
        test.addEdge(node4, node3);
        assertEquals("{origin=Connell, destination=Warden}", node.edges.get(1).toString());
        assertEquals("{origin=Connell, destination=Lind}", node.edges.get(2).toString());
        assertEquals("{origin=Othello, destination=Lind}", node2.edges.get(1).toString());
        assertEquals("{origin=Lind, destination=Warden}", node4.edges.get(2).toString());//edges arraylist has correct edge
        assertThrows( Exception.class, () -> test.addEdge(node, node5));//throws exception if adding edge between a node that is not in graph


    }
    @Test public void testGetNodes(){
        Graph test = new Graph();
        assertNull(test.getNodes());//should return null for empty graph
        Graph.Node node = test.addNode("Connell");
        Graph.Node node2 = test.addNode("Othello");
        Graph.Node node3= test.addNode("Warden");
        Graph.Node node4= test.addNode("Lind");
        assertTrue(test.getNodes().contains(node));
        assertTrue(test.getNodes().contains(node2));
        assertTrue(test.getNodes().contains(node3));
        assertTrue(test.getNodes().contains(node4));
    }

    @Test public void testGetNeighborsAndSize() throws Exception {
        Graph test = new Graph();
        Graph.Node node = test.addNode("Connell");
        Graph.Node node2 = test.addNode("Othello");
        Graph.Node node3= test.addNode("Warden");
        Graph.Node node4= test.addNode("Lind");
        Graph.Node node5= test.addNode("Pasco");


        test.addEdge(node, node2);
        test.addEdge(node, node3);
        test.addEdge(node, node4);
        test.addEdge(node5, node4);



        ArrayList<Graph.Edge> edgesOfConnell = test.getNeighbors(node);
        ArrayList<Graph.Node> connellDestinations= new ArrayList<>();
        for(Graph.Edge edge :edgesOfConnell) connellDestinations.add(edge.destination);
        assertTrue(connellDestinations.contains(node2));
        assertTrue(connellDestinations.contains(node3));
        assertTrue(connellDestinations.contains(node4));//connell should have all 3 other destinations as neigbors
        assertEquals(3,connellDestinations.size());
        assertFalse(connellDestinations.contains(node5));//should not contain an edge that is not it's neighbor
        assertEquals(5,test.size());//Graph is of size 5
    }

}
