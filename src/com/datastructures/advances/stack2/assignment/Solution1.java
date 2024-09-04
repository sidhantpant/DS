package com.datastructures.advances.stack2.assignment;

import java.util.Stack;

public class Solution1 {

    public int[] prevSmaller(int[] A) {

        Stack<Integer> stack = new Stack<>();
        int N = A.length;
        int[] ans= new int[N];
        ans[0] = -1;
        stack.push(A[0]);// 4
        for(int i = 1 ; i< N ;i++){

            while(!stack.isEmpty() && stack.peek() >= A[i]){ // 4>=5
                stack.pop();//
            }

            if(stack.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = stack.peek(); // 4
            }
            stack.push(A[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {4,5,2,10,8,2};
        Solution1 sol = new Solution1();
        sol.prevSmaller(A);
    }


}
