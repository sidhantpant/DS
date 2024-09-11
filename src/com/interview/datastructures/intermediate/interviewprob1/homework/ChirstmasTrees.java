package com.interview.datastructures.intermediate.interviewprob1.homework;

public class ChirstmasTrees {

    public void chirstmasTreesPrefixSum(int[] A,int[] B){

        int N = A.length;
        int[] PSL = new int[N+1];
        PSL[0] = A[0];
        int totalSum = 0 ;
        for (int i = 1; i < N+1; i++) {
            PSL[i] = B[Math.min(A[i-1],PSL[i-1])];
        }

        int[] PSR = new int[N+1];
        PSR[0] = A[N-1];
        for (int i = 1; i < N+1; i++) {
            PSR[i] = B[Math.min(A[N-i],PSR[i-1])];
        }

        for (int i = 1; i < N-1; i++) {
            int sum = B[PSL[i]]+B[i]+B[PSR[i]];
            totalSum = Math.min(totalSum,sum);
        }
        
    }

    public static void main(String[] args) {
        int[] A = {1,6,4,2,6,9};
        int[] B = {2,5,7,3,2,7};
        ChirstmasTrees cst = new ChirstmasTrees();
        cst.chirstmasTreesPrefixSum(A,B);
    }

}
