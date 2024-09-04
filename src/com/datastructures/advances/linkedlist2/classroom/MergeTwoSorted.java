package com.datastructures.advances.linkedlist2.classroom;

import com.datastructures.advances.linkedlist1.classroom.LinkedListInsert;
import com.datastructures.advances.linkedlist1.classroom.Node;
import com.sun.scenario.effect.Merge;

public class MergeTwoSorted {

    Node mergeTwoSortedLinkedList(Node h1, Node h2) {

        if(h1 == null){
            return h2;
        }
        if(h2 == null){
            return h1;
        }
        Node h = null;
        Node t = null;
        if (h1.value < h2.value) {
            h = h1;
            t = h1;
            h1 = h1.next;
        } else {
            h = h2;
            t = h2;
            h2 = h2.next;
        }

        // start merging
        while (h1 != null && h2 != null) {
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

        // merge the remaining part
        if(h1 == null){
            t.next = h2;
        }
        if(h2 == null){
            t.next = h1;
        }
        return h;

    }

    public static void main(String[] args) {
        LinkedListInsert linkedListInsert1 = new LinkedListInsert();
        Node head1 = new Node(2);
        head1 = linkedListInsert1.insertAtEnd(head1, 6);
        head1 = linkedListInsert1.insertAtEnd(head1, 10);
        head1 = linkedListInsert1.insertAtEnd(head1, 14);
        head1 = linkedListInsert1.insertAtEnd(head1, 19);
        linkedListInsert1.printList(head1);
        System.out.println();
        LinkedListInsert linkedListInsert2 = new LinkedListInsert();
        Node head2 = new Node(1);
        head2 = linkedListInsert2.insertAtEnd(head2, 3);
        head2 = linkedListInsert2.insertAtEnd(head2, 5);
        head2 = linkedListInsert2.insertAtEnd(head2, 9);
        head2 = linkedListInsert2.insertAtEnd(head2, 11);
        linkedListInsert1.printList(head2);

        MergeTwoSorted merge = new MergeTwoSorted();
        Node h = merge.mergeTwoSortedLinkedList(head1,head2);
        System.out.println(h);
        linkedListInsert1.printList(h);
    }
}
