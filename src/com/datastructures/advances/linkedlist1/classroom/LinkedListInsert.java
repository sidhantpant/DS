package com.datastructures.advances.linkedlist1.classroom;

public class LinkedListInsert {

    public static void main(String[] args) {
        LinkedListInsert ll = new LinkedListInsert();
        Node node1 = null;
        Node head = ll.insertAtStart(node1, 6);
        head = ll.insertAtStart(head, 8);
        head = ll.insertAtStart(head, 10);
        System.out.println(head);

        head = ll.insertAtEnd(head, 15);
        head = ll.insertAtEnd(head, 18);
        System.out.println(head);
    }

    Node insertAtStart(Node head, int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        return head;
    }

    public Node insertAtEnd(Node head, int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return head;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;

        return head;
    }

    Node insertAtKthPosition(Node head, int value, int k) {
        Node newNode = new Node(value);
        if (k == 0) {
            head = insertAtStart(head, value);
        } else {
            int count = 0;
            Node curr = head;
            while (count < k - 1) {
                curr = curr.next;
                count++;
            }
        }
        return head;
    }

    public void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.value + "->");
            curr = curr.next;
        }
    }


}
