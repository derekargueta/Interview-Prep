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
    }
}
