package test.java;

import com.dargueta.algorithms.Sorts;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by derek on 11/18/15.
 */
public class SortTests {

    private static int[] generateRandomList() {
        int[] list = new int[20000];
        for(int i = 0; i < list.length; i++) {
            list[i] = (int)(Math.random() * 1000000 + 1);
        }
        return list;
    }

    @Test
    public void testBubbleSort() {
        // -- test in-order
        int[] testArr1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] expected1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] actual1 = Sorts.bubbleSort(testArr1);
        assertArrayEquals(expected1, actual1);

        // -- test reverse
        int[] testArr2 = new int[]{6, 5, 4, 3, 2, 1};
        int[] expected2 = new int[]{1, 2, 3, 4, 5, 6};
        int[] actual2 = Sorts.bubbleSort(testArr2);
        assertArrayEquals(expected2, actual2);

        // -- test all same
        int[] testArr3 = new int[]{2, 2, 2, 2, 2, 2};
        int[] expected3 = new int[]{2, 2, 2, 2, 2, 2};
        int[] actual3 = Sorts.bubbleSort(testArr3);
        assertArrayEquals(expected3, actual3);

        // -- test semi-random
        int[] testArr4 = new int[]{-1000, 1000, -50, 50, 0, 99, 123};
        int[] expected4 = new int[]{-1000, -50, 0, 50, 99, 123, 1000};
        int[] actual4 = Sorts.bubbleSort(testArr4);
        assertArrayEquals(expected4, actual4);

        // -- test 20,000 random
        int[] testArr5 = generateRandomList();
        int[] expected5 = testArr5.clone();
        Arrays.sort(expected5);
        int[] actual5 = Sorts.bubbleSort(testArr5);
        assertArrayEquals(expected5, actual5);
    }


    @Test
    public void testInsertionSort() {
        // -- test in-order
        int[] testArr1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] expected1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] actual1 = Sorts.insertionSort(testArr1);
        assertArrayEquals(expected1, actual1);

        // -- test reverse
        int[] testArr2 = new int[]{6, 5, 4, 3, 2, 1};
        int[] expected2 = new int[]{1, 2, 3, 4, 5, 6};
        int[] actual2 = Sorts.insertionSort(testArr2);
        assertArrayEquals(expected2, actual2);

        // -- test all same
        int[] testArr3 = new int[]{2, 2, 2, 2, 2, 2};
        int[] expected3 = new int[]{2, 2, 2, 2, 2, 2};
        int[] actual3 = Sorts.insertionSort(testArr3);
        assertArrayEquals(expected3, actual3);

        // -- test semi-random
        int[] testArr4 = new int[]{-1000, 1000, -50, 50, 0, 99, 123};
        int[] expected4 = new int[]{-1000, -50, 0, 50, 99, 123, 1000};
        int[] actual4 = Sorts.insertionSort(testArr4);
        assertArrayEquals(expected4, actual4);

        // -- test 20,000 random
        int[] testArr5 = generateRandomList();
        int[] expected5 = testArr5.clone();
        Arrays.sort(expected5);
        int[] actual5 = Sorts.insertionSort(testArr5);
        assertArrayEquals(expected5, actual5);
    }


    @Test
    public void testSelectionSort() {
        // -- test in-order
        int[] testArr1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] expected1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] actual1 = Sorts.selectionSort(testArr1);
        assertArrayEquals(expected1, actual1);

        // -- test reverse
        int[] testArr2 = new int[]{6, 5, 4, 3, 2, 1};
        int[] expected2 = new int[]{1, 2, 3, 4, 5, 6};
        int[] actual2 = Sorts.selectionSort(testArr2);
        assertArrayEquals(expected2, actual2);

        // -- test all same
        int[] testArr3 = new int[]{2, 2, 2, 2, 2, 2};
        int[] expected3 = new int[]{2, 2, 2, 2, 2, 2};
        int[] actual3 = Sorts.selectionSort(testArr3);
        assertArrayEquals(expected3, actual3);

        // -- test semi-random
        int[] testArr4 = new int[]{-1000, 1000, -50, 50, 0, 99, 123};
        int[] expected4 = new int[]{-1000, -50, 0, 50, 99, 123, 1000};
        int[] actual4 = Sorts.selectionSort(testArr4);
        assertArrayEquals(expected4, actual4);

        // -- test 20,000 random
        int[] testArr5 = generateRandomList();
        int[] expected5 = testArr5.clone();
        Arrays.sort(expected5);
        int[] actual5 = Sorts.selectionSort(testArr5);
        assertArrayEquals(expected5, actual5);
    }


    @Test
    public void testQuickSort() {
        // -- test in-order
        int[] testArr1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] expected1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] actual1 = Sorts.quickSort(testArr1);
        assertArrayEquals(expected1, actual1);

        // -- test reverse
        int[] testArr2 = new int[]{6, 5, 4, 3, 2, 1};
        int[] expected2 = new int[]{1, 2, 3, 4, 5, 6};
        int[] actual2 = Sorts.quickSort(testArr2);
        assertArrayEquals(expected2, actual2);

        // -- test all same
        int[] testArr3 = new int[]{2, 2, 2, 2, 2, 2};
        int[] expected3 = new int[]{2, 2, 2, 2, 2, 2};
        int[] actual3 = Sorts.quickSort(testArr3);
        assertArrayEquals(expected3, actual3);

        // -- test semi-random
        int[] testArr4 = new int[]{-1000, 1000, -50, 50, 0, 99, 123};
        int[] expected4 = new int[]{-1000, -50, 0, 50, 99, 123, 1000};
        int[] actual4 = Sorts.quickSort(testArr4);
        assertArrayEquals(expected4, actual4);

        // -- test 20,000 random
        int[] testArr5 = generateRandomList();
        int[] expected5 = testArr5.clone();
        Arrays.sort(expected5);
        int[] actual5 = Sorts.quickSort(testArr5);
        assertArrayEquals(expected5, actual5);
    }
}
