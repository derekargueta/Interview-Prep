package com.dargueta.algorithms;


/**
 * Created by derek on 9/14/15.
 */
public class Sorts {

    /**
     *
     * SPACE: O(1)
     * TIME : O(n^2) worst-case
     *
     */
    public static int[] bubbleSort(int[] list) {
        for(int x = 0; x < list.length - 1; x++) {
            for(int y = 0; y < list.length - x - 1; y++) {
                if(list[y] > list [y+1]) {
                    // swap
                    int tmp = list[y];
                    list[y] = list[y+1];
                    list[y+1] = tmp;
                }
            }
        }

        return list;
    }

    /**
     *
     * SPACE: O(1)
     * TIME : O(n^2) worst-case
     * BEST SCENARIOS: nearly sorted (b/c O(n) time) or small problem set (b/c low memory overhead)
     *
     * What this looks like:
     * Step 1 - i = 0: [4, 8, 1, 0] Change nothing since j > 0 (see algo below for `j`)
     * Step 2 - i = 1: [4, 8, 1, 0] 8 > 4, continue
     * Step 3 - i = 2: [4, 8, 1, 0] 1 < 8 so we go to inner loop
     *                 [4, 8, 8, 0] "slide" 8 to the right (one iteration of inner loop)
     *                 [4, 4, 8, 0] "slide" 4 to the right (one iteration of inner loop)
     *                 [1, 4, 8, 0] place 1
     * Step 4 - i = 3: [1, 4, 8, 0] 0 < 8 so same thing as step 3
     *                 [1, 4, 8, 8] "slide" 8 to the right
     *                 [1, 4, 4, 8] "slide" 4 to the right
     *                 [1, 1, 4, 8] "slide" 1 to the right
     *                 [0, 1, 4, 8] place 0
     */
    public static int[] insertionSort(int[] list) {
        // iterate through all elements of the array
        for(int i = 0; i < list.length; i++) {

            int element = list[i];

            // find where they belong going right to left by iterating as long as this element is smaller than its
            // neighbor
            int j = i;
            while(j > 0 && list[j-1] > element) {

                // shift items left-to-right
                list[j] = list[j - 1];
                j--;
            }

            // place the element where it finally belongs <3
            // It's ok to place the element here since list[j] will be a duplicate value of what was at list[j-1]
            // (see explanation above)
            list[j] = element;
        }

        return list;
    }

    /**
     *
     * SPACE: O(1)
     * TIME : O(n^2) worst-case
     * IMPORTANT: non-adaptive. best for when swaps are expensive and you need as few as possible
     */
    public static int[] selectionSort(int[] list) {

        for(int i = 0; i < list.length-1; i++) {
            int smallestVal = list[i];
            int smallestIndex = i;

            // iterate through the remainder of the list to find the next smallest value
            for(int j = i + 1; j < list.length; j++) {
                if(i != j && list[j] < smallestVal) {
                    // update smallest
                    smallestIndex = j;
                    smallestVal = list[j];
                }
            }

            // swap to bring the small value up front and in position
            int cup = list[i];
            list[i] = smallestVal;
            list[smallestIndex] = cup;
        }

        return list;
    }

    /**
     *
     * SPACE: O(1)
     *
     */
    public static int[] shellSort(int[] list) {

        return null;
    }

    /**
     *
     * SPACE: O(n)
     *
     */
    public static int[] mergeSort(int[] list) {

        return null;
    }

    /**
     *
     * SPACE: O(1)
     * TIME : O(nlog(n))
     *
     */
    public static int[] heapSort(int[] list) {

        return null;
    }

    private static int[] quicksortHelper(int[] list, int low, int high) {
        if(high - low < 1) return list;

        int pivot = list[low + (high - low) / 2];
        int left = low;
        int right = high;
        while(left < right) {
            while(list[left] < pivot) {
                left++;
            }
            while(list[right] > pivot) {
                right--;
            }

            if(left <= right) {
                int tmp = list[left];
                list[left] = list[right];
                list[right] = tmp;
                left++;
                right--;
            }
        }

        if(low < right) {
            list = quicksortHelper(list, low, right);
        }

        if(left < high) {
            list = quicksortHelper(list, left, high);
        }

        return list;
    }

    /**
     *
     * SPACE: O(log(n))
     *
     */
    public static int[] quickSort(int[] list) {
        return quicksortHelper(list, 0, list.length-1);
    }

    public static int[] quick3Sort(int[] list) {
        // -- TODO
        return null;
    }
}
