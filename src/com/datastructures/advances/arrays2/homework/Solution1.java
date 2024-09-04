package com.datastructures.advances.arrays2.homework;

public class Solution1 {

    int bringElementsTogether(int[] A , int B){
        int N = A.length;
        int count = 0 ;
        for (int i = 0; i < N; i++) {
            //window size of count less than B
            if(A[i] <= B){
                count++;
            }
        }

        //sliding window
        //calculate for the first window
        int swap = 0 ;

        for (int i = 0; i < count; i++) {
            if(A[i] > B){
                swap++;
            }
        }
        int start = 1 ;
        int end = count;
        int minSwap = Integer.MAX_VALUE;
        while(end < N){

            if(A[start-1] > B){
                swap--;
            }
            if(A[end] > B ){
                swap++;
            }
            start++;
            end++;
            minSwap = Math.min(minSwap,swap);
        }

        return minSwap;

    }

    public static void main(String[] args) {
        int[] A = {1, 12, 10, 3, 14, 10, 5};
        Solution1 sol = new Solution1();
        System.out.println(sol.bringElementsTogether(A,8));
    }
}
