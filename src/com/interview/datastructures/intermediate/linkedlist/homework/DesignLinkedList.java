package com.interview.datastructures.intermediate.linkedlist.homework;

public class DesignLinkedList {

    int size = 0;

    public static void main(String[] args) {
        int[][] A = {{3, 1, -1}, {3, 1, -1}, {1, 18, -1}, {2, 12, 1}, {1, 17, -1},
                {2, 11, 3}, {1, 19, -1}, {3, 0, -1}, {0, 12, -1}};
        DesignLinkedList dll = new DesignLinkedList();
        dll.solve(A);
    }

    public ListNode solve(int[][] A) {
        int N = A.length;
        ListNode head = null;
        for (int i = 0; i < N; i++) {
            int op = A[i][0];
            int val = A[i][1];
            int pos = A[i][2];

            if (op == 0) {
                head = insertAtStart(head, val);
            } else if (op == 1) {
                head = insertAtLast(head, val);
            } else if (op == 2) {
                head = insertAtKPosition(head, val, pos);
            } else if (op == 3) {
                head = deleteNode(head, pos);
            }
        }
        return head;
    }

    public ListNode insertAtStart(ListNode head, int data) {

        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
        size++;
        return head;
    }

    public ListNode insertAtLast(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = insertAtStart(head, data);
        } else {
            ListNode curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
        size++;
        return head;
    }

    public ListNode insertAtKPosition(ListNode head, int data, int pos) {
        ListNode newNode = new ListNode(data);
        if (pos < 1 || pos > size + 1) {
            return head;
        }

        if (pos == 1) {
            return insertAtStart(head, data);
        }

        ListNode curr = head;
        while (pos > 1) {
            curr = curr.next;
            pos = pos - 1;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        size++;
        return head;
    }

    public ListNode deleteNode(ListNode head, int pos) {
        if (pos < 1 || size < 1 || pos > size) {
            return head;
        }

        ListNode curr = head;
        ListNode prev = head;
        if (pos == 1) {
            head = head.next;
        } else {
            while (pos > 1 && curr.next != null) {
                prev = curr;
                curr = curr.next;
                pos--;
            }
            prev.next = curr.next;

        }
        size--;
        return head;
    }


}
