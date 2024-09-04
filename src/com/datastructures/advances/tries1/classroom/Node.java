package com.datastructures.advances.tries1.classroom;

public class Node {

    Node[] children;
    boolean isEnd;
    int pf;
    public Node() {
        this.children = new Node[26];
        this.isEnd = false;
        this.pf = 0;
    }
}
