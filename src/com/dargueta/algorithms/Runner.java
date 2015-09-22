package com.dargueta.algorithms;

import java.util.Arrays;

/**
 * Created by derek on 9/17/15.
 */
public class Runner {

    public static void main(String[] args) {
        int[] dummylist = new int[]{5, 7, 1, 9, 3, 0, 4, 7, 1, 3, 88, 34, 234, 546, 23, 856, 213, 34, 234, 64, 894};
        System.out.println(Arrays.toString(Sorts.bubbleSort(dummylist)));
        System.out.println(Arrays.toString(Sorts.quickSort(dummylist)));
    }
}
