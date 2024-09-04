package com.datastructures.advances.tries1.classroom;

import java.util.Stack;

public class DeleteNode {

    void delete(Node root, String word) {

        Node temp = root;
        int N = word.length();
        Stack<Node> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            char ch = word.charAt(i);

            int idx = ch - 'a';
            if (temp.children[idx] == null) {
                return;
            }
            temp = temp.children[idx];
            stack.add(temp);
        }
        temp.isEnd = false;

        Node curr = stack.pop();
        while (!stack.isEmpty()){
           Node temp2 = stack.peek();

        }

    }

    boolean isLeaf(Node root) {
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                return false;
            }
        }
        return true;
    }

    Node insert(Node root, String word) {
        Node temp = root;
        int N = word.length();
        for (int i = 0; i < N; i++) {
            char ch = word.charAt(i);
            int idx = ch - 'a';
            if (temp.children[idx] == null) {
                temp.children[idx] = new Node();
            }
            temp = temp.children[idx];
        }
        temp.isEnd = true;
        return root;
    }

    public static void main(String[] args) {
        DeleteNode deleteNode = new DeleteNode();
        Node trie = deleteNode.insert(new Node(),"art");
//        trie = deleteNode.insert(trie,"play");
//        trie = deleteNode.insert(trie,"player");
        trie = deleteNode.insert(trie,"try");

        deleteNode.delete(trie,"try");

    }

}
