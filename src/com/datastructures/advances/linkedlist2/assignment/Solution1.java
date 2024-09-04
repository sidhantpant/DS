package com.datastructures.advances.linkedlist2.assignment;

import com.datastructures.advances.linkedlist1.classroom.Node;

public class Solution1 {

    public Node mergeTwoLists(Node A, Node B) {

        Node h1 = A;
        Node h2 = B;
        Node h;
        Node t;

        if (h1 == null) {
            return h2;
        }

        if (h2 == null) {
            return h1;
        }

        if (h1.value < h2.value) {
            h = h1;
            t = h1;
            h1 = h1.next;
        } else {
            h = h2;
            t = h2;
            h2 = h2.next;
        }

        while (h1.next != null && h2.next != null) {

            if (h1.value < h2.value) {
                t.next = h1;
                h1 = h1.next;
                t = t.next;
            } else {
                t.next = h2;
                h2 = h2.next;
                t = t.next;
            }
        }

        if (h1.next == null) {
            t.next = h2;
        }
        if (h2.next == null) {
            t.next = h1;
        }
        return h;
    }

    public Node insertAtEnd(Node head,int val){

        Node curr = head;
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return head;
        }

        while(curr.next!= null){
            curr = curr.next;
        }
        curr.next = newNode;
        return head;
    }

    public Node insertAtStart(Node head,int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return head;
        }
        Node curr = head;
        newNode.next = curr;
        head = newNode;
        return head;
    }

    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        Node head1 = new Node(2);
        sol.insertAtEnd(head1,5);
        sol.insertAtEnd(head1,6);
        sol.insertAtEnd(head1,9);
        sol.insertAtEnd(head1,11);

        Node head2 = new Node(3);
        sol.insertAtEnd(head2,4);
        sol.insertAtEnd(head2,8);

        sol.mergeTwoLists(head1,head2);

    }

}
