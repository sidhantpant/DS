package com.practice.datastructures.interviewproblem2.classroom;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

    private static int[] evenIndexSum(int[] A, int[][] Q) {

        int N = A.length;

        int[] PS = new int[N + 1];// 2 3 1 6 4 5
        PS[0] = 0;
        for (int i = 1; i < N + 1; i++) {
            if (i % 2 == 0) {
                PS[i] = PS[i - 1];  // 0 2 2 3 3 7 7
            } else {
                PS[i] = PS[i - 1] + A[i - 1]; // 0+2 , 2+1 3+4
            }
        }
        int[] range = new int[Q.length];
        for (int i = 0; i < Q.length; i++) {
            int start = Q[i][0];
            int end = Q[i][1];
            range[i] = PS[end + 1] - PS[start];
        }
        return range;
    }

    // 4, 3, 2, 7, 6, -2
    private static void specialIndexBruteForceWrong(int[] A) {
        // this will be wrong approach as index are changes once element is removed .So removing an element from
        // sum will not give correct answer
        List<Integer> specialIndex = new ArrayList<>();
        int N = A.length;
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < N; i++) { // 4 3 2 7 6 -2
            if (i % 2 == 0) {
                sumEven = sumEven + A[i]; // 12
            } else {
                sumOdd = sumOdd + A[i];   // 8
            }
        }
        // In this approach
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                if (sumEven - A[i] == sumOdd) { //12 -4 = 8
                    specialIndex.add(i);
                }
            } else {
                if (sumOdd - A[i] == sumEven) {
                    specialIndex.add(i);
                }
            }
        }
        System.out.println(specialIndex);
    }

    // 4 3 2 7 6 -2
    private static int specialIndexPrefixSum(int[] A) {
    // correct approach
        int N = A.length;
        int[] PSE = new int[N + 1];
        PSE[0] = 0;
        //calculate even Prefix Sum
        for (int i = 1; i < N + 1; i++) {
            if (i % 2 == 0) {
                PSE[i] = PSE[i - 1];
            } else {
                PSE[i] = PSE[i - 1] + A[i - 1];
            }
        }

        // Calculate Odd Prefix Sum
        int[] PSO = new int[N + 1];
        PSO[0] = 0;
        for (int i = 1; i < N + 1; i++) {
            if (i % 2 == 0) {
                PSO[i] = PSO[i - 1] + A[i - 1];
            } else {
                PSO[i] = PSO[i - 1];
            }
        }


        List<Integer> specialIndex = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int sumEven1 = PSE[i] - PSE[0]; // SE[0,i-1]
            int sumOdd1 = PSO[i] - PSO[0];  // SO[0,i-1]
            int sumOdd2 = PSO[N-1+1] - PSO[i+1]; // SO[i+1,N-1]
            int sumEven2 = PSE[N-1+1] - PSE[i+1]; // SE[i+1,N-1]

            int sumEven = sumEven1 + sumOdd2;
            int sumOdd = sumOdd1 + sumEven2;

            if(sumEven == sumOdd){
                specialIndex.add(i);
            }

        }
        int[] specialIndexArray = new int[specialIndex.size()];
        for (int i = 0; i < specialIndexArray.length; i++) {
            specialIndexArray[i] = specialIndex.get(i);
        }
        return specialIndexArray.length;
    }

     List<Integer> specialIndex(int[] A){
        int N = A.length;

        int[] PSE = new int[N+1];
        int[] PSO = new int[N+1];

        PSO[0] = 0;
        for (int i = 1; i < N+1; i++) {
            if( i % 2 == 0){
                PSO[i] = PSO[i-1] + A[i-1];
            } else{
                PSO[i] = PSO[i-1];
            }
        }

        PSE[0] = 0;
        for (int i = 1; i < N+1; i++) {
            if( i % 2 == 0){
                PSE[i] = PSE[i-1];
            } else{
                PSE[i] = PSE[i-1] + A[i-1];
            }
        }
        List<Integer> sum = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int sumEven1 =  PSE[i] - PSE[0] ;   // [0,i-1]
            int sumOdd1 =  PSO[N] - PSO[i+1] ;   // [i+1,N-1]
            int sumOdd2 =  PSO[i] - PSO[0] ;   // [0,i-1]
            int sumEven2 = PSE[N] - PSE[i+1] ;   // [i+1,N-1]

            int leftSum = sumEven1+sumOdd1;
            int rightSum = sumOdd2 + sumEven2;
            if(leftSum == rightSum){
                sum.add(A[i]);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] B = {2,3,1,6,4,5};
        int[][] Q = new int[4][2];
        Q[0][0] = 1; Q[0][1] = 3;
        Q[1][0] = 2 ; Q[1][1] = 5;
        Q[2][0] = 0 ; Q[2][1] = 4;
        Q[3][0] = 3 ; Q[3][1] = 3;
        evenIndexSum(B,Q);

        int[] A = {4, 3, 2, 7, 6, -2};
//        specialIndexBruteForceWrong(A);
        Solution1 sol1 = new Solution1();
        sol1.specialIndex(A);

    }

}
