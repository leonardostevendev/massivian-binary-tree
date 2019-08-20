package com.leonardostevendev.masivian.binarytree.structure;

public class Node {

    private int val;

    private Node parent;
    private Node left;
    private Node right;

    public Node(int val) {
        this.val = val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public int getVal() {
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
