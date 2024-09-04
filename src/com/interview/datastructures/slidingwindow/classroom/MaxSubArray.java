package com.interview.datastructures.slidingwindow.classroom;

public class MaxSubArray {

    public int maxSubArray(int[] A, int K){

        int N = A.length;
        int maxSum = 0;
        for(int i = 0 ; i < K ; i++){
            maxSum = maxSum+A[i];
        }
        System.out.println(maxSum);

        int s = 1 ;
        int e = K;

        int sum = maxSum;
        while(e < N){
            sum = sum - A[s-1] + A[e];
            System.out.println(sum);
            maxSum = Math.max(sum,maxSum);
            s++;
            e++;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] A = {-3,4,-2,5,3 ,-2,8,2,-1,4};
        MaxSubArray sum = new MaxSubArray();
        System.out.println(sum.maxSubArray(A,5));
    }
}
