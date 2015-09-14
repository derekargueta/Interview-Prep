package com.dargueta.lists;

/**
 * Created by derek on 9/14/15.
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

    public int getCount() {
        return this.count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(head.toString());
        LLNode tmp = head;
        while(tmp.getNext() != null) {
            tmp = tmp.getNext();
            sb.append(", ").append(tmp.toString());
        }
        return sb.toString();
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