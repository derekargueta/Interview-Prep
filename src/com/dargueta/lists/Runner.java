package com.dargueta.lists;


/**
 * Created by derek on 9/14/15.
 */
public class Runner {

    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.insert(4);
        dll.insert(6);
        dll.insert(1);
        dll.insert(9);
        System.out.println(dll);

        LinkedList ll = new LinkedList();
        if(ll.getCount() != 0) System.err.println("LinkedList should be empty");

        ll.insert(1);
        if(ll.getCount() != 1) System.err.println("LinkedList should have one element");
        if(ll.get(0).getVal() != 1) System.err.println("First node should be 1");

        ll.insert(5);
        if(ll.getCount() != 2) System.err.println("LinkedList should have two elements");
        if(ll.get(1).getVal() != 5) System.err.println("Second node should be 5");

        ll.insert(9);
        if(ll.getCount() != 3) System.err.println("LinkedList should have three elements");
        if(ll.get(2).getVal() != 9) System.err.println("Third node should be 9");

        ll.delete(5);
        if(ll.getCount() != 2) System.err.println("LinkedList should have two elements");
        if(ll.get(1).getVal() != 9) System.err.println("Second node should be 9");

        ll.insert(15);
        if(ll.getCount() != 3) System.err.println("LinkedList should have three elements");
        if(ll.get(2).getVal() != 15) System.err.println("Third node should be 15");
    }
}
