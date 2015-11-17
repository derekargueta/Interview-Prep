package com.dargueta.lists;

import java.util.Arrays;

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
        // empty nodes don't add any value to the list, just complexity
        if(arr.length == 0) return;

        if(this.head == null) {
            this.head = new ULLNode(null, arr);
        } else {
            // TODO
            ULLNode tmp = this.head;

            // get to the end of the list
            while(tmp.getNext() != null) {
                tmp = tmp.getNext();
            }

            tmp.setNext(new ULLNode(null, arr));
        }

        this.size += arr.length;
    }

    public int getAt(int index) {
        if(index < 0 || index > this.size) {
            return -1;
        }

        ULLNode tmp = this.head;
        while(index >= tmp.getArr().length) {
            index -= tmp.getArr().length;
            tmp = tmp.getNext();
        }

        return tmp.getArr()[index];
    }

    public void deleteAt(int index) {
        // TODO
        if(index < 0 || index > this.size) {
            return;
        }

        if(index < this.head.getArr().length) {
            int[] arr = this.head.getArr();
            int[] newArr = new int[arr.length-1];
            int j = 0;
            for(int i = 0; i < arr.length; i++) {
                if(i == index) continue;

                newArr[j++] = arr[i];
            }
            this.head.setArr(newArr);
        } else {

            ULLNode tmp = this.head;
            index -= tmp.getArr().length;
            while (index >= tmp.getNext().getArr().length) {
                index -= tmp.getNext().getArr().length;
                tmp = tmp.getNext();
            }

            // looks like element is in current node?

            if (tmp.getNext().getArr().length == 1) {
                // the element we are looking for is the only one in the node, so just remove the node
                tmp.setNext(tmp.getNext().getNext());
            } else {
                // need to set a new array in the node without the element AKA "deleting" it
                int[] arr = tmp.getNext().getArr();
                int[] newArr = new int[arr.length - 1];
                int j = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (i == index) continue;
                    newArr[j++] = arr[i];
                }
                tmp.getNext().setArr(newArr);
            }
        }
        this.size--;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {

        if(this.head == null) {
            return "{}";
        }

        StringBuilder sb = new StringBuilder("{");
        ULLNode tmp = this.head;
        while(tmp.getNext() != null) {
            sb.append(tmp.toString()).append(", ");
            tmp = tmp.getNext();
        }
        return sb.append(tmp.toString()).append("}").toString();
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

    public void setNext(ULLNode n) {
        this.next = n;
    }

    public int[] getArr() {
        return this.arr;
    }

    public void setArr(int[] newArr) {
        this.arr = newArr;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.arr);
    }
}
