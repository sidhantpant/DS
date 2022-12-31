package com.revision.datastructures.subarrays.assignment;

public class Solution4 {

    private static int minMaxOccurrenceBruteFor(int[] A) {

        int N = A.length;
        int MIN = Integer.MAX_VALUE;
        int MAX = Integer.MIN_VALUE;
        int length = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            MIN = Math.min(MIN, A[i]);
            MAX = Math.max(MAX, A[i]);
        }

        for (int i = 0; i < N; i++) {
            if (A[i] == MIN) {
                for (int j = i + 1; j < N; j++) {
                    if (A[j] == MAX) {
                        length = Math.min(length, j - i + 1);
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) {
            if (A[i] == MAX) {
                for (int j = i + 1; j < N; j++) {
                    if (A[j] == MIN) {
                        length = Math.min(length, j - i + 1);
                        break;
                    }
                }
            }
        }

        return length;

    }

    private static int minMaxOccurrenceOptimised(int[] A) {

        int N = A.length;
        int MIN = Integer.MAX_VALUE;
        int MAX = Integer.MIN_VALUE;
        int length = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            MIN = Math.min(MIN, A[i]);
            MAX = Math.max(MAX, A[i]);
        }

        int largestMinIndex = -1;
        int largestMaxIndex = -1;

        for (int i = 0; i < N; i++) {

            if (A[i] == MIN) {
                largestMinIndex = i;  // 1
                if (largestMaxIndex >= 0) {
                    length = Math.min(length, i - largestMaxIndex + 1);
                }
            }

            if(A[i] == MAX){
                largestMaxIndex = i; // 6
                if(largestMinIndex>=0) {
                    length = Math.min(length, i - largestMinIndex + 1);
                }
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int[] A = {3, 1, 4, 1, 2, 4, 6, 5, 1};
        System.out.println(minMaxOccurrenceBruteFor(A));
        System.out.println(minMaxOccurrenceOptimised(A));
    }
}
