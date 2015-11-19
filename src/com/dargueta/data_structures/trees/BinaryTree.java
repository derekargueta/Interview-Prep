package com.dargueta.data_structures.trees;

/**
 * Created by derek on 9/14/15.
 */
public class BinaryTree<T extends Comparable<T>> {
    private BNode<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public BinaryTree(T t) {
        this.root = new BNode<T>(t);
    }

    private boolean innerInsert(T t, BNode<T> node) {
        int compare = t.compareTo(node.getValue());
        if(compare < 0) {
            if(node.hasLeftLeaf()) {
                return innerInsert(t, node.getLeftLeaf());
            } else {
                node.setLeftLeaf(new BNode(t));
                return true;
            }
        } else if(compare > 0) {
            if(node.hasRightLeaf()) {
                return innerInsert(t, node.getRightLeaf());
            } else {
                node.setRightLeaf(new BNode(t));
                return true;
            }
        }

        // duplicate value
        return false;
    }

    public boolean insert(T t) {
        if(this.root == null) {
            this.root = new BNode<T>(t);
            return true;
        }

        return innerInsert(t, this.root);
    }
}

class BNode<T> {
    private T t;
    private BNode leftLeaf;
    private BNode rightLeaf;

    public BNode(T t) {
        this.t = t;
        this.leftLeaf = null;
        this.rightLeaf = null;
    }

    public T getValue() {
        return this.t;
    }

    public BNode getLeftLeaf() {
        return this.leftLeaf;
    }

    public BNode getRightLeaf() {
        return this.rightLeaf;
    }

    public void setLeftLeaf(BNode n) {
        this.leftLeaf = n;
    }

    public void setRightLeaf(BNode n) {
        this.rightLeaf = n;
    }

    public boolean hasLeftLeaf() {
        return this.leftLeaf != null;
    }

    public boolean hasRightLeaf() {
        return this.rightLeaf != null;
    }
}
