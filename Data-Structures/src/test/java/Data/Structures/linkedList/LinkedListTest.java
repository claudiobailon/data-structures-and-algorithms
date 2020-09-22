package Data.Structures.linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {//not sure why it won't let me run these tests. It says "No tests found for given includes: [Data.Structures.linkedList.LinkedListTest](filter.includeTestsMatching)"
    @Test public void testTesting() {
        assertTrue(true);
        System.out.println("Testing");
    }
    @Test public void testNewLinkedList() {
        LinkedList testList = new LinkedList();
        assertEquals("NULL", testList.toString());
        System.out.println("Testing:");
        System.out.println(testList);
    }
    @Test public void testInsert() {
        LinkedList testList = new LinkedList();
        testList.insert(3);
        testList.insert(4);
        testList.insert(5);
        System.out.println(testList);
        assertEquals("{5} -> {4} -> {3} -> NULL", testList.toString());
    }

    @Test public void testIncludes() {
        LinkedList testList = new LinkedList();
        testList.insert(1);
        testList.insert(2);
        testList.insert(3);
        assertTrue(testList.includes(1));
        assertFalse(testList.includes(4));
    }
    @Test public void testAppend(){
        LinkedList testList = new LinkedList();
        testList.insert(3);
        testList.insert(4);
        testList.insert(5);
        testList.append(6);
        assertEquals("{5} -> {4} -> {3} -> {6} -> NULL", testList.toString());

    }

    @Test public void testInsertBefore() throws Exception {
        LinkedList testList = new LinkedList();
        testList.insert(3);
        testList.insert(4);
        testList.insert(5);
        testList.insertBefore(3,6);
        assertEquals("{5} -> {4} -> {6} -> {3} -> NULL", testList.toString());
    }

    @Test public void testInsertAfter() throws Exception {
        LinkedList testList = new LinkedList();
        testList.insert(3);
        testList.insert(4);
        testList.insert(5);
        testList.insertBefore(4, 9);
        assertEquals("{5} -> {4} -> {9} -> {3} -> NULL", testList.toString());
    }


}
