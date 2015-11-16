package com.dargueta.lists;

/**
 * Created by derek on 11/16/15.
 *
 * An Unrolled LinkedList is a list data structure where each node has an array of elements in addition to the actual
 * list itself. For example, a list with 3 nodes may be a list where each node has a 3 element array, therefore the
 * list actually has 9 elements, 3 per node.
 *
 * ASCII art representation:
 *  ___________
 * | [1, 2, 3] |
 *  -----------
 * | [4, 5, 6] |
 *  -----------
 * | [7, 8, 9] |
 *  -----------
 *
 */
public class UnrolledLinkedList {
    private ULLNode head;
    private int size;

    public UnrolledLinkedList() {
        this.head = null;
    }

    public UnrolledLinkedList(ULLNode newNode) {
        this.head = newNode;
    }

    public UnrolledLinkedList(int val) {
        this.head = new ULLNode(null, new int[]{val});
    }

    public void insert(int[] arr) {
        // TODO
    }

    public ULLNode getAt(int index) {
        // TODO
        return null;
    }

    public int getSize() {
        return size;
    }
}

class ULLNode {
    private ULLNode next;
    private int[] arr;

    public ULLNode(ULLNode next, int[] arr) {
        this.next = next;
        this.arr = arr;
    }

    public ULLNode getNext() {
        return this.next;
    }

    public int[] getArr() {
        return this.arr;
    }
}
