package com.datastructures.advances.linkedlist1.classroom;

import com.sun.org.apache.regexp.internal.RE;

public class ReverseLinkedList {

    Node reverseLinkedList(Node head){
        Node rh = null;
        Node nextNode = head;
        while(nextNode != null){
            Node temp = nextNode;
            nextNode = nextNode.next;
            //temp.next = null;
            temp.next = rh;
            rh = temp;
        }
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

        ReverseLinkedList rLL = new ReverseLinkedList();
        Node rh = rLL.reverseLinkedList(head);
        System.out.println(rh);
    }

}
