package com.interview.datastructures.intermediate.linkedlist.assignment;

import com.datastructures.advances.linkedlist1.classroom.Node;

public class LinkedList {

    public static void main(String[] args) {
        Node head = null;
        LinkedList ll = new LinkedList();
        head = ll.insertAtStart(head, 2);
        ll.printll(head);
        head = ll.insertAtEnd(head, 6);
        ll.printll(head);
        head = ll.insertAtKthPosition(head, 4, 2);
        head = ll.insertAtEnd(head, 8);
        head = ll.insertAtEnd(head, 10);
        head = ll.insertAtEnd(head, 12);
        head = ll.insertAtStart(head, 1);
        ll.printll(head);
        head = ll.deleteNode(head, 7);
        ll.printll(head);

        Node head1 = null;
        head1 = ll.deleteNode(null, 1);
        ll.printll(head1);
    }

    public Node insertAtStart(Node head, int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        return head;
    }

    public Node insertAtEnd(Node head, int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
        return head;
    }

    public Node insertAtKthPosition(Node head, int val, int pos) {
        Node curr = head;
        if (pos == 0) {
            insertAtStart(head, val);
        }
        while (curr != null && pos > 1) {
            curr = curr.next;
            pos = pos - 1;
        }
        Node newNode = new Node(val);
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }

    public Node deleteNode(Node head, int pos) {
        Node curr = head;
        Node prev = curr;
        if (curr == null) {
            return head;
        }

        if (pos == 1 ) {
            head = head.next;
            return head;
        }

        while (curr.next != null && pos > 1) {
            prev = curr;
            curr = curr.next;
            pos = pos - 1;
        }
        prev.next = curr.next;
        return head;
    }

    public void printll(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.value + "->");
            curr = curr.next;
        }
        System.out.println(" ");
    }
}
