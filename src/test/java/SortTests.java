package test.java;

import com.dargueta.algorithms.Sorts;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by derek on 11/18/15.
 */
public class SortTests {

    @Test
    public void testBubbleSort() {
        int[] testArr1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] expected1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] actual1 = Sorts.bubbleSort(testArr1);
        assertArrayEquals(expected1, actual1);

        int[] testArr2 = new int[]{6, 5, 4, 3, 2, 1};
        int[] expected2 = new int[]{1, 2, 3, 4, 5, 6};
        int[] actual2 = Sorts.bubbleSort(testArr2);
        assertArrayEquals(expected2, actual2);

        int[] testArr3 = new int[]{2, 2, 2, 2, 2, 2};
        int[] expected3 = new int[]{2, 2, 2, 2, 2, 2};
        int[] actual3 = Sorts.bubbleSort(testArr3);
        assertArrayEquals(expected3, actual3);

        int[] testArr4 = new int[]{-1000, 1000, -50, 50, 0, 99, 123};
        int[] expected4 = new int[]{-1000, -50, 0, 50, 99, 123, 1000};
        int[] actual4 = Sorts.bubbleSort(testArr4);
        assertArrayEquals(expected4, actual4);
    }
}
