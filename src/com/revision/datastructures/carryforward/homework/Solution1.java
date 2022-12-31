package com.revision.datastructures.carryforward.homework;

public class Solution1 {

    private int maxProfit(int[] A){
        int N = A.length;
        if(A.length == 0 || A.length == 1){
            return 0;
        }
        int max = A[N-1];
        int profit = 0;
        for (int i = N-2; i >=0 ; i--) {
            if(A[i]> max){
                max = A[i];
            }
            profit = Math.max(profit,max - A[i]);
        }
        return profit;
    }

}
