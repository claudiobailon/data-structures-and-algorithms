package datastructures.hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {
    @Test public void testHashtableConstructor(){
        Hashtable test = new Hashtable(4);
        assertEquals(4, test.hashTable.size());//constructor creates a Hashtable of given size
    }

    @Test public void testAddAndGet() throws Exception{
        Hashtable test = new Hashtable(4);
        test.add("one", 1);
        test.add("two", 2);
        test.add("three", 3);
        test.add("four", 4);

        assertEquals( 1, test.get("one"));//the add and get methods work as expected
        assertEquals( 2, test.get("two"));
        assertEquals( 3, test.get("three"));
        assertEquals( 4, test.get("four"));
        assertThrows(Exception.class, () -> test.add("one", 1));// throws exception if key being added is already in Hashtable
        assertThrows(Exception.class, () -> test.get("five"));// throws exception if key being searched for is not in Hashmap

    }

    @Test public void testContains() throws Exception{
        Hashtable test = new Hashtable(4);

        test.add("one", 1);
        test.add("two", 2);
        test.add("three", 3);
        test.add("four", 4);

        assertTrue(test.contains("one"));
        assertFalse(test.contains("five"));

    }
}
