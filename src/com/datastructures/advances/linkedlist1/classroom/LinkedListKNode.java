package com.datastructures.advances.linkedlist1.classroom;

public class LinkedListKNode {

    int getKElement(Node head, int K) {
        Node temp = head;
        while (K > 0 && temp != null) {
            temp = temp.next;
            K--;
        }
        if (temp != null) {
            return temp.value;
        }
        return -1;// k not exist
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        LinkedListInsert linkedListInsert = new LinkedListInsert();
        head= linkedListInsert.insertAtStart(head,20);
        head= linkedListInsert.insertAtStart(head,30);
        head= linkedListInsert.insertAtStart(head,40);
        head = linkedListInsert.insertAtStart(head,50);
        LinkedListKNode ll = new LinkedListKNode();
        System.out.println(ll.getKElement(head,13));
    }
}
