package com.dargueta.data_structures.lists;

/**
 * Created by derek on 9/14/15.
 *
 * A Linked List is a collection data structure consisting of a series of nodes, where each node points to the next
 * node. Looking something like:
 *
 * ["bob"] -> ["tim"] -> ["john"] -> ["jake"]
 *
 * As opposed to an array which would look like:
 * ["bob"]["tim"]["john"]["jake"]
 * where each element is accessible by index value.
 *
 * Since a Linked List does not have indexes, merely pointers on each node, to access a node at "index" 3 (0-based),
 * you would have to iterate down the list, starting at the head node, or also called the root, 4 times until you
 * get to index 3. Therefore, Linked List access is considered O(n) time where n is the index, while an array has
 * O(1) access time.
 *
 * A Linked List has a much more flexible structure than an array, as to insert a new node, you simply need to adjust
 * the pointers. Whereas to insert an element into an array, you'd need to copy down length-index elements down one
 * spot to create a vacancy for the new element.
 */
public class LinkedList {

    private LLNode head;
    private int count;

    public LinkedList() {
        this.head = null;
        this.count = 0;
    }

    public LinkedList(int val) {
        this.head = new LLNode(val);
        this.count = 1;
    }

    public void insert(int val) {
        if(head == null) {
            head = new LLNode(val);
        } else {

            // tmp holds a reference to head - modifying it would modify head as well
            LLNode tmp = head;
            while(tmp.getNext() != null) {
                tmp = tmp.getNext();
            }

            // because of earlier comment, setting "next" of tmp will save new node to the list
            tmp.setNext(new LLNode(val));
        }
        count++;
    }

    public void delete(int val) {

        if(count == 0) {
            return;
        }

        if(head.getVal() == val) {
            head = head.getNext();
        } else {

            LLNode tmp = head;
            while(tmp.getNext() != null && tmp.getNext().getVal() != val) {
                tmp = tmp.getNext();
            }

            if(tmp.getNext() == null) {
                // val was not found
                // probably should raise an exception
                return;
            }

            tmp.setNext(tmp.getNext().getNext());
        }
        count--;
    }

    public int get(int index) {
        if(index >= count || index < 0) {
            // TODO - make custom exception class
            throw new ArrayIndexOutOfBoundsException();
        }

        LLNode tmp = this.head;
        while(index != 0) {
            tmp = tmp.getNext();
            index--;
        }

        return tmp.getVal();
    }

    public int getCount() {
        return this.count;
    }

    @Override
    public String toString() {
        if(this.head == null) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[").append(head.toString());
        LLNode tmp = head;
        while(tmp.getNext() != null) {
            tmp = tmp.getNext();
            sb.append(", ").append(tmp.toString());
        }
        return sb.append("]").toString();
    }
}


class LLNode {

    private int val;
    private LLNode next;

    public LLNode(int val) {
        this.val = val;
        this.next = null;
    }

    public int getVal() {
        return this.val;
    }

    public LLNode getNext() {
        return this.next;
    }

    public void setNext(LLNode n) {
        this.next = n;
    }

    @Override
    public String toString() {
        return Integer.toString(this.val);
    }
}