package com.datastructures.advances.linkedlist1.assignment;

import com.datastructures.advances.linkedlist1.classroom.Node;

public class Solution1 {

    public Node reverseList(Node A) {

        Node head = A;
        Node rh = null;
        while(head!= null){
            Node temp = head;
            temp.next = rh;
            rh = temp;
            head = head.next;
        }
        return rh;
    }

    public static void main(String[] args) {
        Node node = new Node(2);
        node.next = new Node(4);
        node.next.next = new Node(6);
        node.next.next.next = new Node(8);
        Solution1 sol = new Solution1();
        sol.reverseList(node);
    }
}