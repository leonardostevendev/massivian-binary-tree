package com.leonardostevendev.masivian.binarytree.api.dto;

import java.util.List;

public class RequestDTO {
    private List<Long> tree;
    private long node1;
    private long node2;

    public long getNode1() {
        return node1;
    }

    public void setNode1(long node1) {
        this.node1 = node1;
    }

    public long getNode2() {
        return node2;
    }

    public void setNode2(long node2) {
        this.node2 = node2;
    }

    public List<Long> getTree() {
        return tree;
    }

    public void setTree(List<Long> tree) {
        this.tree = tree;
    }
}
