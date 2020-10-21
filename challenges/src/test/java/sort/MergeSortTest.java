package sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MergeSortTest {

    @Test
    public void testMergeSort(){
        int[] input = {8,4,23,42,16,15};
        MergeSort test = new MergeSort();
        int[] output = {4,8,15,16,23,42};
        assertEquals(Arrays.toString(output), Arrays.toString(test.mergeSort(input)));
    }
    @Test public void testReverseSorted(){
        int[] input = {20,18,12,8,5,-2};
        MergeSort test = new MergeSort();
        int[] output = {-2,5,8,12,18,20};
        assertEquals(Arrays.toString(output), Arrays.toString(test.mergeSort(input)));
    }
    @Test public void testFewUniques(){
        int[] input = {5,12,7,5,5,7};
        MergeSort test = new MergeSort();
        int[] output = {5,5,5,7,7,12};
        assertEquals(Arrays.toString(output), Arrays.toString(test.mergeSort(input)));
    }
    @Test public void testNearlySorted(){
        int[] input = {2,3,5,7,13,11};
        MergeSort test = new MergeSort();
        int[] output = {2,3,5,7,11,13};
        assertEquals(Arrays.toString(output), Arrays.toString(test.mergeSort(input)));
    }
    @Test public void testSingleIndex(){
        int[] input = {2};
        MergeSort test = new MergeSort();
        int[] output = {2};
        assertEquals(Arrays.toString(output), Arrays.toString(test.mergeSort(input)));
    }

}
