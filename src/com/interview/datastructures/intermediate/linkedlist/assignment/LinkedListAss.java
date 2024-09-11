package com.interview.datastructures.intermediate.linkedlist.assignment;

public class LinkedListAss {

    public static Node head = null;
    public static int size = 0;

    public static Node insertAtStart(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static void insert_node(int position, int value) {
        // @params position, integer
        // @params value, integer
        if (position >= 1 && position <= size + 1) {
            Node newNode = new Node(value);
            if (position == 1) {
                head = insertAtStart(value);
            } else {
                Node curr = head;
                while (curr.next != null && position > 1) {
                    curr = curr.next;
                    position = position - 1;
                }
                newNode.next = curr.next;
                curr.next = newNode;
            }
            size++;
        }

    }

    public static void delete_node(int position) {
        // @params position, integer

        if (position < 1 || position > size) {
            return;
        }

        if (position == 1) {
            head = head.next;
        } else {
            Node curr = head;
            Node prev = head;
            while (position > 1) {
                prev = curr;
                curr = curr.next;
                position = position - 1;
            }
            prev.next = curr.next;
        }
    }

    public static void print_ll() {
        // Output each element followed by a space
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Node node = new Node(3);
        LinkedListAss ll = new LinkedListAss();
        LinkedListAss.insert_node(1, 2);
        LinkedListAss.insert_node(2, 4);
        LinkedListAss.insert_node(3, 6);
        LinkedListAss.insert_node(4, 8);
        LinkedListAss.insert_node(5, 10);
        LinkedListAss.print_ll();
        LinkedListAss.delete_node(3);
        LinkedListAss.print_ll();
    }

    static class Node {

        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

}
