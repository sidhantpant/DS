package com.datastructures.advances.linkedlist1.homework;


import com.datastructures.advances.linkedlist1.classroom.LinkedListInsert;
import com.datastructures.advances.linkedlist1.classroom.Node;

public class Solution4 {

    public Node reverseBetween(Node A, int B, int C) {
        if( A == null || A.next == null){
            return A;
        }
        Node temp = A;
        int count = 1 ;
        Node c = null;
        while(count != B && temp != null){
            c = temp;
            temp = temp.next;
            count++;
        }
        Node rh= null;
        Node newNode = temp;
        Node head1 = newNode;
        while(B <= C && newNode!=null){
            Node temp1 = newNode;
            newNode = newNode.next;
            temp1.next = rh;
            rh = temp1;
            B++;
        }
        System.out.println(c);
        System.out.println(rh);
        head1.next = newNode;
        if(c!=null){
            c.next = rh;
            return A;
        }
        return rh;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        LinkedListInsert linkedListInsert = new LinkedListInsert();
        head= linkedListInsert.insertAtEnd(head,2);
        head= linkedListInsert.insertAtEnd(head,3);
        head= linkedListInsert.insertAtEnd(head,4);
        head = linkedListInsert.insertAtEnd(head,5);
        head = linkedListInsert.insertAtEnd(head,6);
        head = linkedListInsert.insertAtEnd(head,7);
        head = linkedListInsert.insertAtEnd(head,8);
        Solution4 solution4 = new Solution4();
        solution4.reverseBetween(head,4,6);
    }
}
