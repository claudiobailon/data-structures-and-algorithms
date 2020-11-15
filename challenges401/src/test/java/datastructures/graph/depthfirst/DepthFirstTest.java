package datastructures.graph.depthfirst;

import datastructures.graph.Graph;
import datastructures.graph.breadthfirst.BreadthFirst;
import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.*;


public class DepthFirstTest {

    @Test
    public void testBreadthFirstTraversal() throws Exception {
        Graph testGraph = new Graph();
        Graph.Node a = testGraph.addNode("a");//since this node is added first, depthFirst fill start it's traversal with this node
        Graph.Node b = testGraph.addNode("b");
        Graph.Node c = testGraph.addNode("c");
        Graph.Node d = testGraph.addNode("d");
        Graph.Node e = testGraph.addNode("e");
        Graph.Node f = testGraph.addNode("f");
        Graph.Node g = testGraph.addNode("g");
        Graph.Node h = testGraph.addNode("h");


        testGraph.addEdge(a, b);
        testGraph.addEdge(a, d);
        testGraph.addEdge(b, c);
        testGraph.addEdge(b, d);
        testGraph.addEdge(c, g);
        testGraph.addEdge(d, e);
        testGraph.addEdge(d, h);
        testGraph.addEdge(d, f);
        testGraph.addEdge(h, f);

        ArrayList<Graph.Node> output = DepthFirst.depthFirst(testGraph);
        assertEquals(output.size(),testGraph.size());//Output should have same number of nodes as nodes in graph
        String expected = "[{value=a}, {value=b}, {value=c}, {value=g}, {value=d}, {value=e}, {value=h}, {value=f}]";
        assertEquals(expected, output.toString());//list should be in order of pre-order, depth-first traversal
        Graph.Node i = testGraph.addNode("i");
        ArrayList<Graph.Node> output2 = DepthFirst.depthFirst(testGraph);
        assertTrue(output2.get(output2.size()-1).getValue().equals("i"));//node with no edges that is added last should be last in output arrayList

    }
}
