package com.practice.datastructures.carryforward.classroom;

public class MinLength {

    private static int minSubArrayBruteForce(int[] A) {
        int N = A.length;
        int MAX = Integer.MIN_VALUE;
        int MIN = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            MAX = Math.max(A[i], MAX);
            MIN = Math.min(A[i], MIN);
        }
        int length = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            if (A[i] == MAX) {
                for (int j = i + 1; j < N; j++) {
                    if (A[j] == MIN) {
                        length = Math.min(length, (j - i + 1));
                    }
                }
            }
            if (A[i] == MIN) {
                for (int j = i + 1; j < N; j++) {
                    if (A[j] == MAX) {
                        length = Math.min(length, (j - i + 1));
                    }
                }
            }
        }
        System.out.println(length);
        return length;
    }

    private static int minLengthCarry(int[] A) {
        int N = A.length;
        int MAX = Integer.MIN_VALUE;
        int MIN = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            MAX = Math.max(A[i], MAX);
            MIN = Math.min(A[i], MIN);
        }
        int lastMinIndex = -1;
        int lastMaxIndex = -1;
        int ans = N;
        for (int i = 0; i < N; i++) {

            if (A[i] == MIN) {
                lastMinIndex = i ;
                if(lastMaxIndex >= 0){
                    ans = Math.min(ans , i-lastMaxIndex+1);
                }
            }
            if(A[i] == MAX){
                lastMaxIndex = i;
                if(lastMinIndex>=0){
                    ans = Math.min(ans , i-lastMinIndex+1);
                }
            }
        }
        System.out.println(ans);
        return ans;

    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 1, 3, 4, 6, 4, 6, 3};
        int[] A1 = {2, 1, 3, 1, 5, 6, 5, 1, 6, 4, 1};
        minSubArrayBruteForce(A);
        minLengthCarry(A1);
    }

}
