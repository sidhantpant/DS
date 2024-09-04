package com.datastructures.advances.linkedlist2.homework;

import com.datastructures.advances.linkedlist1.classroom.LinkedListInsert;
import com.datastructures.advances.linkedlist1.classroom.Node;

public class Solution1 {

    Node head ;
    public Node swapPairs(Node A) {
        if( A == null || A.next== null){
            return A;
        }
        Node newNode = A;
        Node rh = null;
        int c = 0;
        while(c < 2 && newNode!=null){
            Node temp = newNode;
            newNode = newNode.next;
            temp.next = rh;
            rh = temp;
            c++;
        }
        A.next = swapPairs(newNode);
        return rh;
    }


    public Node swapPairs1(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node nextNode = head.next;
        head.next = swapPairs1(nextNode.next);
        nextNode.next = head;
        return nextNode;
    }

    Node swap(Node currNode,Node nextNode){
        currNode.next = nextNode.next;
        nextNode.next = currNode;
        return nextNode;
    }


    public static void main(String[] args) {
        LinkedListInsert linkedListInsert = new LinkedListInsert();
        Node head = new Node(67);
        head= linkedListInsert.insertAtEnd(head,27);
        head= linkedListInsert.insertAtEnd(head,64);
        head= linkedListInsert.insertAtEnd(head,10);
        head = linkedListInsert.insertAtEnd(head,4);
        head = linkedListInsert.insertAtEnd(head,85);

        Solution1 solution1 = new Solution1();
        Node h = solution1.swapPairs1(head);
        System.out.println(h);
    }
}
