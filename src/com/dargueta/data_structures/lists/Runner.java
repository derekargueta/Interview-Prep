package com.dargueta.data_structures.lists;


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
        System.out.println("----- Running UnrolledLinkedList Tests -----");
        UnrolledLinkedList ull = new UnrolledLinkedList();
        if(ull.getSize() != 0) System.err.println("UnrolledLinkedList should be empty");
        System.out.println(ull);

        ull.insert(new int[]{1, 2});
        if(ull.getSize() != 2) System.err.println("UnrolledLinkedList should have two elements");
        if(ull.getAt(0) != 1) System.err.println("0th element should be 1");
        if(ull.getAt(1) != 2) System.err.println("1st element should be 2");
        System.out.println(ull);

        ull.insert(new int[]{3});
        if(ull.getSize() != 3) System.err.println("UnrolledLinkedList should have three elements");
        if(ull.getAt(0) != 1) System.err.println("0th element should be 1");
        if(ull.getAt(1) != 2) System.err.println("1st element should be 2");
        if(ull.getAt(2) != 3) System.err.println("2nd element should be 3");
        System.out.println(ull);

        ull.insert(new int[]{});
        if(ull.getSize() != 3) System.err.println("UnrolledLinkedList should have three elements");
        if(ull.getAt(0) != 1) System.err.println("0th element should be 1");
        if(ull.getAt(1) != 2) System.err.println("1st element should be 2");
        if(ull.getAt(2) != 3) System.err.println("2nd element should be 3");
        System.out.println(ull);

        ull.deleteAt(0);
        if(ull.getSize() != 2) System.err.println("UnrolledLinkedList should have two elements");
        if(ull.getAt(0) != 2) System.err.println("1st element should be 2, instead is " + ull.getAt(0));
        if(ull.getAt(1) != 3) System.err.println("2nd element should be 3, instead is " + ull.getAt(1));
        System.out.println(ull);

        ull.insert(new int[]{5, 6, 7});
        if(ull.getSize() != 5) System.err.println("UnrolledLinkedList should have five elements");
        if(ull.getAt(0) != 2) System.err.println("0th element should be 2");
        if(ull.getAt(1) != 3) System.err.println("1st element should be 3");
        if(ull.getAt(2) != 5) System.err.println("2nd element should be 5");
        if(ull.getAt(3) != 6) System.err.println("3rd element should be 6");
        if(ull.getAt(4) != 7) System.err.println("4th element should be 7");
        System.out.println(ull);

        ull.deleteAt(1);
        if(ull.getSize() != 4) System.err.println("UnrolledLinkedList should have four elements");
        if(ull.getAt(0) != 2) System.err.println("0th element should be 2");
        if(ull.getAt(1) != 5) System.err.println("1st element should be 5, instead is " + ull.getAt(1));
        if(ull.getAt(2) != 6) System.err.println("2nd element should be 6, instead is " + ull.getAt(2));
        if(ull.getAt(3) != 7) System.err.println("3rd element should be 7, instead is " + ull.getAt(3));
        System.out.println(ull);

        ull.deleteAt(3);
        if(ull.getSize() != 3) System.err.println("UnrolledLinkedList should have three elements, instead has " + ull.getSize());
        if(ull.getAt(0) != 2) System.err.println("0th element should be 2, instead is" + ull.getAt(0));
        if(ull.getAt(1) != 5) System.err.println("1st element should be 5, instead is " + ull.getAt(1));
        if(ull.getAt(2) != 6) System.err.println("2nd element should be 6, instead is " + ull.getAt(2));
        System.out.println(ull);

        System.out.flush();
        System.err.flush();
    }
}
