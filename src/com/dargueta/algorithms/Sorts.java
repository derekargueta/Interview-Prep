package com.dargueta.algorithms;

import java.util.Arrays;

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
            for(int y = 0; y < list.length - 1; y++) {
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
     */
    public static int[] insertionSort(int[] list) {
        // iterate through all elements of the array
        for(int i = 0; i < list.length; i++) {

            int element = list[i];

            // find where they belong going right to left by iterating as long as the element is smaller
            int j;
            for(j = i; j > 0 && list[j] > element; j--) {

                // shift items to the right
                list[j] = list[j - 1];
            }

            // place the element where it finally belongs <3
            list[j] = element;
        }
        
        return list;
    }

    public static int[] selectionSort(int[] list) {

        return null;
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
        if(high - low < 2) return list;

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

        return null;
    }
}
