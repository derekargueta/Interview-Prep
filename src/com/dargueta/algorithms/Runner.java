package com.dargueta.algorithms;

import java.util.Arrays;

/**
 * Created by derek on 9/17/15.
 */
public class Runner {

    public static int[] generateRandomList() {
        int[] list = new int[20000];
        for(int i = 0; i < list.length; i++) {
            list[i] = (int)(Math.random() * 1000000 + 1);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] dummylist = generateRandomList();
        System.out.println("Generated list");
//        int[] dummylist = new int[]{5, 7, 1, 9, 3, 0, 4, 7, 3, 546, 234, 1234, 787, 3456, 785, 3452, 85678, 123, 987, 1, 3, 88, 34, 234, 546, 23, 856, 213, 34, 234, 64, 894};
        System.out.println("Bubble sort:    " + Arrays.toString(Sorts.bubbleSort(dummylist)));
        System.out.println("Quick sort:     " + Arrays.toString(Sorts.quickSort(dummylist)));
        System.out.println("Insertion sort: " + Arrays.toString(Sorts.insertionSort(dummylist)));
    }
}
