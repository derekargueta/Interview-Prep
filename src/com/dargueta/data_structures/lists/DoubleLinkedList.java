package com.dargueta.data_structures.lists;

/**
 * Created by derek on 9/14/15.
 *
 * NOT FINISHED!
 */
public class DoubleLinkedList {

    private DLLNode head;
    private int size;

    public DoubleLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void insert(int val) {
        if(this.head == null) {
            this.head = new DLLNode(val);
        } else {

            DLLNode tmp = this.head;
            while(tmp.getNext() != null) {
                tmp = tmp.getNext();
            }

            tmp.setNext(val);
        }
        this.size++;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(this.head.toString());
        DLLNode tmp = this.head;
        while(tmp.getNext() != null) {
            tmp = tmp.getNext();
            sb.append(", ").append(tmp.toString());
        }

        return sb.toString();
    }
}



class DLLNode {

    private int val;
    private DLLNode prev;
    private DLLNode next;

    public DLLNode(int val) {
        this.val = val;
        this.prev = null;
        this.next = null;
    }

    public DLLNode(int val, DLLNode prev) {
        this.val = val;
        this.prev = prev;
        this.next = null;
    }

    public int getVal() {
        return this.val;
    }

    public DLLNode getNext() {
        return this.next;
    }

    public void setNext(int val) {
        this.next = new DLLNode(val, this);
    }

    @Override
    public String toString() {
        return Integer.toString(this.val);
    }
}