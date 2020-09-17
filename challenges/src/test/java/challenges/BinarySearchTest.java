package challenges;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;


public class BinarySearchTest {

    @Test public void testBinarySearch() {
        BinarySearch search = new BinarySearch();
        int[] testArr1 = {4,8,15,16,23,42};
        int[] testArr2 = {11,22,33,44,55,66,77};
        int key = 15;
        int key2 = 90;
        int output = search.binarySearch(testArr1, 0,5, key);
        int output2 = search.binarySearch(testArr2, 0,6, key2);

        assertEquals(2, output);
        assertEquals(-1, output2);
    }

}

