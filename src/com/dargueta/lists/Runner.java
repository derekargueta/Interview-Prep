package com.dargueta.lists;


/**
 * Created by derek on 9/14/15.
 */
public class Runner {

    public static void main(String[] args) {
        // -- Double Linked List Tests --
        System.out.println("----- Running DoubleLinkedList Tests -----");
        DoubleLinkedList dll = new DoubleLinkedList();
        if(dll.getSize() != 0) System.err.println("DoubleLinkedList should be empty");
        dll.insert(4);
        dll.insert(6);
        dll.insert(1);
        dll.insert(9);
        System.out.flush();
        System.err.flush();



        // -- Linked List Tests --
        System.out.println("----- Running LinkedList Tests -----");
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

//        if(ll.get(-10).getVal() != -1) System.err.println("Should return -1");
//        if(ll.get(1000).getVal() != -1) System.err.println("Should return -1");
        System.out.flush();
        System.err.flush();



        // -- Linked List Tests --
        System.out.println("----- Running UnrolledLinkedList Tests -----");
        UnrolledLinkedList ull = new UnrolledLinkedList();
        if(ull.getSize() != 0) System.err.println("UnrolledLinkedList should be empty");

        ull.insert(new int[]{1, 2});
        if(ull.getSize() != 2) System.err.println("UnrolledLinkedList should have two elements");
        if(ull.getAt(0) != 1) System.err.println("0th element should be 1");
        if(ull.getAt(1) != 2) System.err.println("1st element should be 2");

        ull.insert(new int[]{3});
        if(ull.getSize() != 3) System.err.println("UnrolledLinkedList should have three elements");
        if(ull.getAt(0) != 1) System.err.println("0th element should be 1");
        if(ull.getAt(1) != 2) System.err.println("1st element should be 2");
        if(ull.getAt(2) != 3) System.err.println("2nd element should be 3");

        ull.insert(new int[]{});
        if(ull.getSize() != 3) System.err.println("UnrolledLinkedList should have three elements");
        if(ull.getAt(0) != 1) System.err.println("0th element should be 1");
        if(ull.getAt(1) != 2) System.err.println("1st element should be 2");
        if(ull.getAt(2) != 3) System.err.println("2nd element should be 3");
        System.out.flush();
        System.err.flush();
    }
}
