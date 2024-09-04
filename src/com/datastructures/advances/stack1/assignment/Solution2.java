package com.datastructures.advances.stack1.assignment;

import java.util.Stack;

public class Solution2 {


    public String solve(String A) {
        int N = A.length();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            char c = A.charAt(i);
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        String ans="";
        while(!stack.isEmpty()){
            ans=stack.peek()+ans;// reverse part
            stack.pop();

        }
        return ans;
    }

    public static void main(String[] args) {
        Solution2 sol = new Solution2();
       // sol.solve("abccbc");
        String s = "abccbc";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        //  6 5 4

    }
}
