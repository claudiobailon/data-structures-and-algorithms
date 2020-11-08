package datastructures.graph.breadthfirst;

import datastructures.graph.Graph;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BreadthFirstTest {

    @Test public void testBreadthFirstTraversal() throws Exception {
        Graph testGraph = new Graph();
        Graph.Node a = testGraph.addNode("a");
        Graph.Node b = testGraph.addNode("b");
        Graph.Node c = testGraph.addNode("c");
        Graph.Node d = testGraph.addNode("d");
        Graph.Node e = testGraph.addNode("e");
        Graph.Node f = testGraph.addNode("f");
        Graph.Node g = testGraph.addNode("g");
        Graph.Node h = testGraph.addNode("h");
        Graph.Node i = testGraph.addNode("i");
        Graph.Node empty = null;


        testGraph.addEdge(a,b);
        testGraph.addEdge(b,c);
        testGraph.addEdge(b,d);
        testGraph.addEdge(c,f);
        testGraph.addEdge(d,e);
        testGraph.addEdge(e,f);
        testGraph.addEdge(e,g);
        testGraph.addEdge(f,h);
        testGraph.addEdge(g,h);
        testGraph.addEdge(g,i);
        testGraph.addEdge(h,i);

        ArrayList<Graph.Node> output = BreadthFirst.breadthFirst(a);
        assertEquals("a",output.get(0).getValue());//a should be visited first
        String expected = "[{value=a}, {value=b}, {value=c}, {value=d}, {value=f}, {value=e}, {value=h}, {value=g}, {value=i}]";
        assertEquals(expected,output.toString());//nodes should be displayed in correct order
        assertThrows(Exception.class, () -> BreadthFirst.breadthFirst(empty));//throws error if given node is null
    }
}
