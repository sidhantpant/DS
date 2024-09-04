package com.datastructures.advances.linkedlist2.homework;

import com.datastructures.advances.linkedlist1.classroom.LinkedListInsert;
import com.datastructures.advances.linkedlist1.classroom.Node;

public class Solution2 {

    Node reverse(Node head) {

        Node nextNode = head;
        Node rh = null;
        while (nextNode != null) {
            Node temp = nextNode;
            nextNode = nextNode.next;
            temp.next = rh;
            rh = temp;
        }
        return rh;
    }

    Node mid(Node head) {
        if (head == null) {
            return head;
        }
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    Node merge(Node h1, Node h2) {
        Node h = h1;
        Node t = h1;

        while (h1 != null && h2 != null) {
            h1 = h1.next;
            t.next = h2;
            t = t.next;

            h2 = h2.next;
            t.next = h1;
            t = t.next;
        }
        return h;
    }

    Node reorderList(Node A) {
        Node h1 = A;
        Node m = mid(h1);
        Node h2 = m.next;
        m.next = null;

        Node rev = reverse(h2);
        Node rL = merge(h1, rev);
        return rL;
    }

    public static void main(String[] args) {
        LinkedListInsert linkedListInsert = new LinkedListInsert();
        Node head = new Node(1);
        head= linkedListInsert.insertAtEnd(head,2);
        head= linkedListInsert.insertAtEnd(head,3);
        head= linkedListInsert.insertAtEnd(head,4);
        Solution2 solution2 = new Solution2();
        Node rL = solution2.reorderList(head);
        System.out.println(rL);
    }
}
