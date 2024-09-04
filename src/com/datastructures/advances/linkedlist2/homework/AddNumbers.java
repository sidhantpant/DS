package com.datastructures.advances.linkedlist2.homework;

import com.datastructures.advances.linkedlist1.classroom.LinkedListInsert;
import com.datastructures.advances.linkedlist1.classroom.Node;

public class AddNumbers {
    
    public Node addTwoNumbers(Node A, Node B) {

        Node h1 = A;
        Node h2 = B;
        Node h = null;
        Node t = null;
        int carry = 0;
        while(h1 != null || h2 != null || carry != 0){
            int a = (h1 != null ) ? h1.value : 0;
            int b = (h2 != null ) ? h2.value : 0;
            int sum = a+b+carry;

            carry = sum/10;
            sum = sum % 10;

            h = insertAtEnds(h,sum);
            if(h1!=null){
                h1 = h1.next;
            }
            if(h2 != null){
                h2 = h2.next;
            }

        }
        return h;

    }

    Node insertAtEnds(Node head,int val){
        Node nn = new Node(val);
        if(head == null){
            head = nn;
            return head;
        }
        Node t = head;
        while(t.next!= null){
            t = t.next;
        }
        t.next = nn;
        return head;
    }

    public static void main(String[] args) {
        LinkedListInsert linkedListInsert1 = new LinkedListInsert();
        Node head1 = new Node(9);
        head1 = linkedListInsert1.insertAtEnd(head1, 9);
        head1 = linkedListInsert1.insertAtEnd(head1, 9);
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
        AddNumbers solution3 = new AddNumbers();
        Node head3 = solution3.addTwoNumbers(head1, head2);
        linkedListInsert1.printList(head3);
    }


}
