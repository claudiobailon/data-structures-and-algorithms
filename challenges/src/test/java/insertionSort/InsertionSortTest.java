package insertionSort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class InsertionSortTest {
    @Test public void testInsertSort(){
        int[] input = {8,4,23,42,16,15};
        InsertionSort test = new InsertionSort();
        int[] output = {4,8,15,16,23,42};
        assertEquals(Arrays.toString(output), Arrays.toString(test.insertSort(input)));
    }
    @Test public void testReverseSorted(){
        int[] input = {20,18,12,8,5,-2};
        InsertionSort test = new InsertionSort();
        int[] output = {-2,5,8,12,18,20};
        assertEquals(Arrays.toString(output), Arrays.toString(test.insertSort(input)));
    }
    @Test public void testFewUniques(){
        int[] input = {5,12,7,5,5,7};
        InsertionSort test = new InsertionSort();
        int[] output = {5,5,5,7,7,12};
        assertEquals(Arrays.toString(output), Arrays.toString(test.insertSort(input)));
    }
    @Test public void testNearlySorted(){
        int[] input = {2,3,5,7,13,11};
        InsertionSort test = new InsertionSort();
        int[] output = {2,3,5,7,11,13};
        assertEquals(Arrays.toString(output), Arrays.toString(test.insertSort(input)));
    }
}
