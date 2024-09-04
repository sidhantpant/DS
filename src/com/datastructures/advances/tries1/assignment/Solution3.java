package com.datastructures.advances.tries1.assignment;

public class Solution3 {
    Node root = new Node();
    public String[] prefix(String[] A) {
        int N = A.length;

        for(int i=0 ;i < N ;i++){
            insertWord(root,A[i]);
        }

        for(int i=0;i<A.length;i++) {
            A[i] = findUniquePrefix(root,A[i]);
        }
        return A;
    }

    void insertWord(Node root,String word){
        String[] ans = new String[word.length()];
        Node temp = root;
        for(int i = 0 ;i < word.length(); i++){
            char ch = word.charAt(i);
            int idx = ch - 'a';
            if(temp.children[idx] == null ){
                temp.children[idx] = new Node();

            }
            temp.pf = temp.pf+1;
            temp = temp.children[idx];

        }
    }

    String findUniquePrefix(Node root,String word){
        Node temp = root;
        StringBuilder ans = new StringBuilder();
        for(int i=0; i < word.length(); i++) {
            int idx = word.charAt(i)-'a';
            ans.append(word.charAt(i));
            temp = temp.children[idx];
            if(temp.pf == 1){
                break;
            }
           // temp = temp.children[idx];
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String[] A = {"zebra", "dog", "duck", "dove"};
        Solution3 solution3 = new Solution3();
        solution3.prefix(A);
    }
}

class Node{

    Node[] children;
    int pf ;

    public Node(){
        this.children = new Node[26];
        this.pf = 0;
    }
}