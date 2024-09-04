package com.datastructures.advances.tries1.classroom;

public class SearchTrie {

    boolean search(Node root , String word){

        Node temp = root;
        int N = word.length();

        for (int i = 0; i < N; i++) {
            char ch = word.charAt(i);
            int idx = ch-'a';
            if(temp.children[idx] == null){
                return false;
            }
            temp = temp.children[idx];
        }
        return temp.isEnd;

    }

    Node insert(Node root , String word){
        Node temp = root;
        int N = word.length();
        for (int i = 0; i < N; i++) {
            char ch = word.charAt(i);
            int idx = ch-'a';
            if(temp.children[idx] == null){
                temp.children[idx] = new Node();
            }
            temp = temp.children[idx];
        }
        temp.isEnd = true;
        return root;
    }

    public static void main(String[] args) {
        SearchTrie searchTrie = new SearchTrie();
        Node trie = searchTrie.insert(new Node(),"adi");
        trie = searchTrie.insert(trie,"amar");
        trie = searchTrie.insert(trie,"damp");
        trie = searchTrie.insert(trie,"damper");

        System.out.println(searchTrie.search(trie,"damper"));

    }
}
