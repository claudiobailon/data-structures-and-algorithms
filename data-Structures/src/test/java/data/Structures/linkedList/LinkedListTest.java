package data.Structures.linkedList;

import org.junit.Test;
import org.omg.PortableServer.LIFESPAN_POLICY_ID;

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
        testList.insertAfter(4, 9);
        assertEquals("{5} -> {4} -> {9} -> {3} -> NULL", testList.toString());
    }
    @Test public void testllKthFromTheEnd() throws Exception {
        LinkedList testList = new LinkedList();
        testList.insert(3);
        testList.insert(4);
        testList.insert(5);
        testList.insertAfter(4, 9);

        assertEquals("This returns 3", testList.llKthFromTheEnd(0));
        assertEquals("This returns 9", testList.llKthFromTheEnd(1));
        assertEquals("This returns 4", testList.llKthFromTheEnd(2));
        assertEquals("This returns 5", testList.llKthFromTheEnd(3));

    }
    @Test public void testExemptionsllKthFromTheEnd() throws Exception {
        LinkedList testList = new LinkedList();
        testList.insert(3);
        testList.insert(4);
        testList.insert(5);
        testList.insertAfter(4, 9);
        assertThrows(Exception.class, () -> testList.llKthFromTheEnd(-1));
        assertThrows(Exception.class, () -> testList.llKthFromTheEnd(5));
        assertThrows(Exception.class, () -> testList.llKthFromTheEnd(7));
    }
@Test public void testZipLists(){
    LinkedList testList1 = new LinkedList();
    LinkedList testList2 = new LinkedList();
    LinkedList testList3 = new LinkedList();
    LinkedList testList4 = new LinkedList();
    LinkedList testList5 = new LinkedList();
    LinkedList testList6 = new LinkedList();
    LinkedList testList7 = new LinkedList();
    LinkedList testList8 = new LinkedList();

    LinkedList test1 = new LinkedList();
    LinkedList test2 = new LinkedList();
    LinkedList test3 = new LinkedList();
    LinkedList test4 = new LinkedList();
    LinkedList test5 = new LinkedList();
    LinkedList test6 = new LinkedList();



    testList1.insert(6);
    testList1.insert(2);
    testList1.insert(8);
    testList1.insert(3);
    testList1.insert(7);
    testList1.insert(4);

    testList2.insert(1);
    testList2.insert(5);
    testList2.insert(9);

    testList3.insert(6);
    testList3.insert(4);

    testList5.insert(6);
    testList5.insert(4);

    testList7.insert(6);
    testList7.insert(2);
    testList7.insert(8);
    testList7.insert(3);
    testList7.insert(7);
    testList7.insert(4);

    testList8.insert(1);
    testList8.insert(5);
    testList8.insert(9);


    test1.head = LinkedList.zipLists(testList1,testList2);
    test2.head = LinkedList.zipLists(testList8,testList7);
    test3.head = LinkedList.zipLists(testList3,testList4);
    test4.head = LinkedList.zipLists(testList4,testList5);
    test5.head = LinkedList.zipLists(testList4, testList6);


    assertEquals("{4} -> {9} -> {7} -> {5} -> {3} -> {1} -> {8} -> {2} -> {6} -> NULL", test1.toString());
    assertEquals("{9} -> {4} -> {5} -> {7} -> {1} -> {3} -> {8} -> {2} -> {6} -> NULL", test2.toString());
    assertEquals("{4} -> {6} -> NULL", test3.toString());//Checks that if the second list is empty, the first is returned
    assertEquals("{4} -> {6} -> NULL", test4.toString());//Checks that if the first list is empty, the second is returned
    assertEquals("NULL", test5.toString());//Checks that if both entered lists are empty, return null





}

}
