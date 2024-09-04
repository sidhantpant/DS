package com.datastructures.advances.dynamicprogramming1.assignment;

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxProduct(final int[] A) {
        int currProduct = 1;
        int N = A.length;
        int maxProduct = Integer.MIN_VALUE;
        for(int i =0 ;i < N ;i++){
            currProduct = currProduct*A[i];
            if(currProduct > maxProduct){
                maxProduct = currProduct;
            }
            if(currProduct == 0){
                currProduct = 1;
            }
        }
        return maxProduct;

    }

    public static void main(String[] args) {
        int[] A = {0, -3, -2, 0, 1, 0, 0,3,3};
        Solution sol = new Solution();
        System.out.println(sol.maxProduct(A));
    }
}
