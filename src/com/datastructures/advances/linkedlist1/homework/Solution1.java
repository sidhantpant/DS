package com.datastructures.advances.linkedlist1.homework;

import com.datastructures.advances.linkedlist1.classroom.LinkedListInsert;
import com.datastructures.advances.linkedlist1.classroom.Node;

public class Solution1 {

    public Node removeNthFromEnd(Node A, int B) {
        if (A == null || A.next == null) {
            return A;
        }

        Node head = A;
        Node head1 = A;
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        int pos = count - B;
        int i = 0;
        Node prev = null;
        if (B >= count) {
            A = A.next;
            return A;
        }
        while (i != pos && head1 != null) {
            prev = head1;
            head1 = head1.next;
            i++;
        }
        if (prev != null) {
            prev.next = head1.next;
        }

        return A;
    }

    public Node removeNthFromEnd1(Node A, int B) {
        int N = getSize(A);
        int K = N-B;
        Node temp = A;
        if (B == 1 && N ==1) {
            return null;
        }
        if (B > N) {
            temp = temp.next;
            return temp;
        }
        K = K - 1;
        while (K > 0) {
            temp = temp.next;
            K--;
        }
        temp.next = temp.next.next;
        return A;
    }

    int getSize(Node A) {
        Node temp = A;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count = count + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        LinkedListInsert linkedListInsert = new LinkedListInsert();
        Node head = new Node(1);
//        head = linkedListInsert.insertAtEnd(head, 1);
        head = linkedListInsert.insertAtEnd(head, 2);
        head = linkedListInsert.insertAtEnd(head, 3);
        head = linkedListInsert.insertAtEnd(head, 4);
        head = linkedListInsert.insertAtEnd(head, 5);

        Solution1 solution1 = new Solution1();
        Node h = solution1.removeNthFromEnd1(head, 5);
        System.out.println(h);
    }

}