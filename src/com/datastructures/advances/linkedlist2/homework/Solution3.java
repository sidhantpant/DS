package com.datastructures.advances.linkedlist2.homework;

import com.datastructures.advances.linkedlist1.classroom.LinkedListInsert;
import com.datastructures.advances.linkedlist1.classroom.Node;

public class Solution3 {

    Node addNumbers(Node h1 , Node h2){

        Node head =null;
        int carry = 0;
        while(h1 != null || h2 !=null || carry != 0){

            int a = (h1!=null ) ? h1.value : 0;
            int b = (h2!=null ) ? h2.value : 0;

            int c = a+b+carry;
            int num = c%10;
            carry = c/10;
            Node newNode = new Node(num);
            if(head == null){
                head = newNode;
            }else{
                Node curr = head;
                while (curr.next!=null){
                    curr = curr.next;
                }
                curr.next = newNode;
            }
            if(h1!=null){
                h1 = h1.next;
            }
            if(h2!=null){
                h2 = h2.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedListInsert linkedListInsert1 = new LinkedListInsert();
        Node head1 = new Node(9);
        head1 = linkedListInsert1.insertAtEnd(head1, 9);
//        head1 = linkedListInsert1.insertAtEnd(head1, 3);
//        head1 = linkedListInsert1.insertAtEnd(head1, 1);
        linkedListInsert1.printList(head1);
        System.out.println();
        LinkedListInsert linkedListInsert2 = new LinkedListInsert();
        Node head2 = new Node(1);
//        head2 = linkedListInsert2.insertAtEnd(head2, 6);
//        head2 = linkedListInsert2.insertAtEnd(head2, 4);
//        head2 = linkedListInsert2.insertAtEnd(head2, 11);
        linkedListInsert1.printList(head2);
        System.out.println();
        Solution3 solution3 = new Solution3();
        Node head3 = solution3.addNumbers(head1,head2);
        linkedListInsert1.printList(head3);
    }


}
