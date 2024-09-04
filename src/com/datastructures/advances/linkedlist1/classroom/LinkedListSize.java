package com.datastructures.advances.linkedlist1.classroom;

public class LinkedListSize {

    int sizeOfLinkedList(Node head){
        Node temp = head;
        int count= 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Node node = new Node(10);
        node.next = new Node(20);
        node.next.next = new Node(30);
        LinkedListSize ll = new LinkedListSize();
        System.out.println(ll.sizeOfLinkedList(node));
    }

}
