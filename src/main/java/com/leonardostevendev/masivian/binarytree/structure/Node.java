package com.leonardostevendev.masivian.binarytree.structure;

public class Node {

    private long val;

    private Node parent;
    private Node left;
    private Node right;

    public Node(long val) {
        this.val = val;
    }

    public void setVal(long val) {
        this.val = val;
    }

    public long getVal() {
        return val;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

}
