package com.datastructures.advances.linkedlist1.classroom;

import com.sun.org.apache.regexp.internal.RE;

public class ReverseKGroups {

    Node reverseFirstKNodes(Node head,int K){
        Node newNode2 = head;
        Node rh = null;
        while(K > 0 && newNode2 !=null){
            Node temp = newNode2;
            newNode2 = newNode2.next;
            temp.next = rh;
            rh = temp;
            K--;
        }
        return rh;

    }
    Node reverseAllKGroups(Node head,int K){
        if(head == null || K == 0){
            return head;
        }
        Node newNode = head;
        Node rh = null;
        int c = K;
        while(c > 0 && newNode !=null){
            Node temp = newNode;
            newNode = newNode.next;
            temp.next = rh;
            rh = temp;
            c--;
        }
        head.next = reverseAllKGroups(newNode, K);
        return rh;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        LinkedListInsert linkedListInsert = new LinkedListInsert();
        head= linkedListInsert.insertAtEnd(head,2);
        head= linkedListInsert.insertAtEnd(head,3);
        head= linkedListInsert.insertAtEnd(head,4);
        head = linkedListInsert.insertAtEnd(head,5);
        head = linkedListInsert.insertAtEnd(head,6);
        head = linkedListInsert.insertAtEnd(head,7);
        head = linkedListInsert.insertAtEnd(head,8);
        head = linkedListInsert.insertAtEnd(head,9);
        head = linkedListInsert.insertAtEnd(head,10);

        ReverseKGroups reverseKGroups = new ReverseKGroups();
        Node rh =reverseKGroups.reverseAllKGroups(head,4);
        System.out.println(rh);
    }
}
