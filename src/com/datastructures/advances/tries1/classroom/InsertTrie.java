package com.datastructures.advances.tries1.classroom;

public class InsertTrie {

    Node insert(Node root,String word){

        Node temp = root;
        int N = word.length();
        for (int i = 0; i < N; i++) {
            char ch = word.charAt(i);
            int idx = ch-'a';
            if(temp.children[idx] == null){
                temp.children[idx] = new Node();
            }
            temp = temp.children[idx];
            temp.pf = temp.pf+1;
        }
        return root;
    }

    int search(Node root,String word){
        Node temp = root;
        int N = word.length();
        for (int i = 0; i < N; i++) {
            char ch = word.charAt(i);
            int idx = ch-'a';
            if(temp.children[idx] == null){
                return -1;
            }
            temp = temp.children[idx];
        }
        return temp.pf;
    }
}
