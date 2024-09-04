package com.datastructures.advances.linkedlist1.homework;

import com.datastructures.advances.linkedlist1.classroom.LinkedListInsert;
import com.datastructures.advances.linkedlist1.classroom.Node;

public class Solution2 {



    public Node deleteDuplicates(Node A) {

        if (A == null || A.next == null) {
            return A;
        }

        Node currNode = A;
        Node head = A;
        Node head1 = A;
        while (currNode != null && currNode.next != null) {
            Node prevNode = currNode;
            currNode = currNode.next;

            if (currNode.value != prevNode.value) {
                head.next = currNode;
                head = head.next;
            }else{
                head.next = null;
            }
        }
        return head1;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        LinkedListInsert linkedListInsert = new LinkedListInsert();
        head = linkedListInsert.insertAtEnd(head, 1);
        head = linkedListInsert.insertAtEnd(head, 2);
        head = linkedListInsert.insertAtEnd(head, 2);
        head = linkedListInsert.insertAtEnd(head, 2);
        head = linkedListInsert.insertAtEnd(head, 3);
        head = linkedListInsert.insertAtEnd(head, 3);
        head = linkedListInsert.insertAtEnd(head,3);
//        head = linkedListInsert.insertAtEnd(head,4);
//        head = linkedListInsert.insertAtEnd(head,5);

        Solution2 solution2 = new Solution2();
        Node h = solution2.deleteDuplicates(head);
        System.out.println(h);
    }

}
