package com.datastructures.advances.linkedlist2.classroom;

import com.datastructures.advances.linkedlist1.classroom.LinkedListInsert;
import com.datastructures.advances.linkedlist1.classroom.Node;

public class MiddleElement {


    Node middleElementInLinkedList(Node head) {

        Node slow = head;
        Node fast = head;

        while ((fast != null && fast.next != null) || (fast.next != null && fast.next.next != null)) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        LinkedListInsert linkedListInsert = new LinkedListInsert();
        Node head = new Node(1);
        head= linkedListInsert.insertAtEnd(head,2);
        head= linkedListInsert.insertAtEnd(head,3);
        head= linkedListInsert.insertAtEnd(head,4);
        head = linkedListInsert.insertAtEnd(head,5);
        head = linkedListInsert.insertAtEnd(head,6);

        MiddleElement middleElement= new MiddleElement();
        Node middle = middleElement.middleElementInLinkedList(head);
        System.out.println(middle);
    }

}
