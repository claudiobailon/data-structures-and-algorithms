package challenges.challenges;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class ArrayShiftTest {
    @Test
    public void testIndexOfArray() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
    @Test public void testArrayShift() {
        ArrayShift arrayShift = new ArrayShift();
        int[] original= {1,2,3,4,5,6};
        int[] original2= {1,2,3,4,5};
        int[] outputArray = arrayShift.arrayShift(original, 7);
        int[] outputArray2 = arrayShift.arrayShift(original2, 7);
        int[] expectedArray = {1,2,3,7,4,5,6};
        int[] expectedArray2 = {1,2,3,7,4,5};
        assertArrayEquals(expectedArray, outputArray);
        assertArrayEquals(expectedArray2, outputArray2);
    }
}