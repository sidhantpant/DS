package com.datastructures.advances.linkedlist1.classroom;

import javax.xml.stream.events.NotationDeclaration;

public class InsertSortingElement {

    Node insertInSortedList(Node head ,int K){
        Node newNode = new Node(K);
        Node temp = head;

        if(head == null){
            return newNode;
        }

        if( temp.next.value >= K){
            newNode.next = temp;
            temp = newNode;
            head = temp;
            return head;
        }
        while(temp.next != null && temp.next.value < K){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;

    }

    public static void main(String[] args) {
        Node head = new Node(3);
        LinkedListInsert linkedListInsert = new LinkedListInsert();
        head= linkedListInsert.insertAtEnd(head,8);
        head= linkedListInsert.insertAtEnd(head,14);
        head= linkedListInsert.insertAtEnd(head,20);
        head = linkedListInsert.insertAtEnd(head,24);
        head = linkedListInsert.insertAtEnd(head,29);
        head = linkedListInsert.insertAtEnd(head,33);
        head = linkedListInsert.insertAtEnd(head,40);

        InsertSortingElement ins = new InsertSortingElement();
        head = ins.insertInSortedList(head,50);
        System.out.println(head);
    }

}
