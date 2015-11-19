package com.dargueta.data_structures.lists;

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
 * You can almost think of this data structure as a fragmented array.
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

    /**
     * This function adds an entire new node. For this, we simply take the same approach as with a standard linked list.
     * @param arr
     */
    public void insert(int[] arr) {
        // empty nodes don't add any value to the list, just complexity. Ignore any attempts to add empty arrays
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


    public void insert(int val, int index) {
        // -- TODO
    }


    /**
     * The strategy for a "get" in an unrolled linked list, is to reduce the index input by the length of the array
     * on each node until the index is within the bounds of a node's array. At that point, you can just pull the value
     * from the array in O(1) time. In this sense, an unrolled linked list may often have more efficient look-up than
     * a standard linked list.
     *
     * i.e.
     * [1, 2] -> [3, 7, 1] -> [8, 3, 8, 9, 3] -> [1]
     * to look up at index 5:
     * 1st node - index -= 2 = 3
     * 2nd node - index -= 3 = 0
     * 3rd node - 0 < 5 so just grab from spot 0 on the third node and boom, you have index 5 of the entire list
     *
     * @param index
     * @return
     */
    public int getAt(int index) {
        if(index < 0 || index > this.size) {
            return -1;
        }

        ULLNode tmp = this.head;
        while(index >= tmp.getArr().length) {
            index -= tmp.getArr().length;
            tmp = tmp.getNext();
        }

        // since the index has been reduced as we loop through the list, just access the element directly
        return tmp.getArr()[index];
    }

    /**
     * The strategy for "delete" is similar to that of "get" with one small change - we want to stay one node behind
     * the node that contains the actual value. This is so that if we are deleting the only value of a node, we can
     * remove the node entirely.
     *
     * i.e.
     * [1, 2, 5] -> [6] -> [8, 3, 5]
     * To delete index 3 (value of 6), we would want to delete the entire node as well. Otherwise, the list could
     * look like [1, 2, 5] -> [] -> [8, 3, 5] which is both pointless and would ruin our "get" algorithm. Instead,
     * it would be much cleaner and better for the result to look like [1, 2, 5] -> [8, 3, 5]. To do this, we need a
     * reference to the previous node since this implementation is singly-linked.
     *
     * @param index
     */
    public void deleteAt(int index) {
        // TODO - optimize. From a glance, there's duplicate code and unnecessary code
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

            if (tmp.getNext().getArr().length == 1) {
                // the element we are looking for is the only one in the node, so just remove the node
                tmp.setNext(tmp.getNext().getNext());
            } else {
                // need to set a new smaller array in the node without the element AKA "deleting" it
                int[] arr = tmp.getNext().getArr();      // the array containing the original values
                int[] newArr = new int[arr.length - 1];  // the new smaller-by-one array we're going to set in the node
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

    /**
     * By keeping `size` a constant value we increment and decrement, getting the size of the list is very simply and
     * cheap (O(1))
     * @return
     */
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
