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

    @Test public void testGetNeighbors() throws Exception {
        Graph test = new Graph();
        Graph.Node node = test.addNode("Connell");
        Graph.Node node2 = test.addNode("Othello");
        Graph.Node node3= test.addNode("Warden");
        Graph.Node node4= test.addNode("Lind");

        test.addEdge(node, node2);
        test.addEdge(node, node3);
        test.addEdge(node, node4);
        test.addEdge(node2, node4);
        test.addEdge(node4, node3);

        ArrayList<Graph.Edge> edgesOfConnell = test.getNeighbors(node);
        for(Graph.Node destination: )
        ArrayList<Graph.Edge> edgesOfOthello = test.getNeighbors(node2);
        ArrayList<Graph.Edge> edgesOfWarden = test.getNeighbors(node3);
        ArrayList<Graph.Edge> edgesOfLind = test.getNeighbors(node4);
//        System.out.println(edgesOfConnell.size());
        assertEquals(3,edgesOfConnell.size());
        System.out.println(edgesOfConnell);
        System.out.println(node2);
        assertTrue(edgesOfConnell.contains(node2));

    }

}
