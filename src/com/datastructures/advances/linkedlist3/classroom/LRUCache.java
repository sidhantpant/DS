package com.datastructures.advances.linkedlist3.classroom;

import jdk.internal.org.objectweb.asm.util.CheckAnnotationAdapter;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    Node head;
    Node tail;
    Map<Integer, Integer> valueMap = new HashMap<>();
    Map<Integer, Node> hm = new HashMap<>();
    int capacity = 2;

    LRUCache() {
        this.head = new Node(-1);
        this.tail = new Node(-1);
        head.next = tail;
        tail.prev = head;
    }

    void set(int key, int value) {

        valueMap.put(key, value);

        if (hm.containsKey(key)) {
            Node temp = hm.get(key);
            deleteNode(temp);
            insertAtBack(temp,tail);
            hm.put(key, temp);
        } else {
            if (hm.size() == capacity) {
                Node temp = head.next;
                hm.remove(temp.data);
                deleteNode(temp);
            }
            Node temp = new Node(key);
            insertAtBack(temp, tail);
            hm.put(key, temp);
        }

    }

    int get(int key) {
        if (hm.containsKey(key)) {
            Node temp = hm.get(key);
            deleteNode(temp);
            insertAtBack(temp,tail);
            hm.put(key,temp);
            return valueMap.get(key);
        } else {
            return -1;
        }
    }

    void insertAtBack(Node nn, Node tail) {
//        Node nn = new Node(x);
        nn.next = tail;
        nn.prev = tail.prev;
        nn.prev.next = nn;
        tail.prev = nn;
    }

    void deleteNode(Node tmp) {

        Node t1 = tmp.prev;
        Node t2 = tmp.next;
        t1.next = t2;
        t2.prev = t1;
        tmp.prev = null;
        tmp.next = null;

    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache();
        lruCache.set(1,10);
        lruCache.set(5,12);
//        lruCache.set(3,10);
//        lruCache.set(4,10);
//        lruCache.set(5,10);
//        lruCache.set(1,11);
        System.out.println(lruCache.get(5));
        System.out.println(lruCache.get(1));
        System.out.println(lruCache.get(10));
        lruCache.set(6,14);
        System.out.println(lruCache.head);
        System.out.println(lruCache.get(5));
    }

}
