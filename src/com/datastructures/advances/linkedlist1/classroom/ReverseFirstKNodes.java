package com.datastructures.advances.linkedlist1.classroom;

public class ReverseFirstKNodes {

    Node reverseFirstKNodes(Node head, int K) {

        Node rh = null;
        Node newNode = head;
        while (K > 0 && newNode != null) {
            Node temp = newNode;
            newNode = newNode.next;
            temp.next = rh;
            rh = temp;
            K--;
        }
        head.next = newNode;
        return rh;
    }

    public static void main(String[] args) {
        Node head = new Node(3);
        LinkedListInsert linkedListInsert = new LinkedListInsert();
        head= linkedListInsert.insertAtEnd(head,8);
        head= linkedListInsert.insertAtEnd(head,14);
        head= linkedListInsert.insertAtEnd(head,20);
        head = linkedListInsert.insertAtEnd(head,24);
        head = linkedListInsert.insertAtEnd(head,29);

        ReverseFirstKNodes firstKNodes = new ReverseFirstKNodes();
        Node rh = firstKNodes.reverseFirstKNodes(head, 3);
        System.out.println(rh);
    }
}
