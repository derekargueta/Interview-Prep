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
        System.out.println("Insertion sort: " + Arrays.toString(Sorts.insertionSort(dummylist)));
        System.out.println("Selection sort: " + Arrays.toString(Sorts.selectionSort(dummylist)));
    }
}
