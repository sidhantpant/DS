package com.datastructures.advances.stack1.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution3 {

    public int braces(String A) {

        char[] ch = A.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            if (c == '(' || c == '+' || c == '-' || c == '*' || c == '/') {
                stack.push(ch[i]);
            } else if (c == ')') {
                char check = stack.peek();
                if (check == '(') {
                    return 1;
                } else {
                    if (check == '*' || check == '/' || check == '+' || check == '-'){
                        stack.pop(); // ((++
                    }
                    stack.pop();
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String A = "((a+b*c+d))";
        Solution3 sol = new Solution3();
        sol.braces(A);
        List<Integer> list = new ArrayList<>();
    }


}
