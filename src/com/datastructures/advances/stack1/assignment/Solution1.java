package com.datastructures.advances.stack1.assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution1 {

    public int solve(String A) {
        char[] ch = A.toCharArray();
        int N = ch.length;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            char c = ch[i];
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                }
                 else if (c == '}' && stack.peek() == '{') {
                    stack.pop();
                }
                else if (c == ']' && stack.peek() == '[') {
                    stack.pop();
                }

            } else {
                return 0;
            }
        }
        if (stack.isEmpty()) {
            return 0;
        }
        return 1;
    }

    public int solve1(String A){
        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        Stack<Character> stack = new Stack<>();
        for(int i= 0 ;i < A.length(); i++){
            char c = A.charAt(i);
            if(c == '(' || c == '{' || c == '{'){
                stack.push(c);
            }else if(!stack.empty() && stack.peek() == map.get(c)){
                stack.pop();
            }else{
                return 0;
            }
        }
        if(stack.empty()){
            return 1;
        }
        return 0;

    }

    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        sol.solve("({)}");
    }
}
