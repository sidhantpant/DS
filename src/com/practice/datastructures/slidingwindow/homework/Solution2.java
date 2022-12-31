package com.practice.datastructures.slidingwindow.homework;

public class Solution2 {

    private static int solve(int[] A, int B) {

        int N = A.length;
        //calculate for first subarray
        float sum = 0;
        float minAvg = Integer.MAX_VALUE;
        int idx = 0;
        int min = Integer.MAX_VALUE;
        if (B == 1) {
            for (int i = 0; i < N; i++) {
                if (A[i] < min) {
                    min = A[i];
                    idx = i;
                }
            }

        } else {
            for (int i = 0; i < B; i++) {
                sum = sum + A[i];
            }
            float avg = sum / N;
            minAvg = Math.min(minAvg, avg);
            int start = 1;
            int end = B;

            while (end < N) {
                sum = sum - A[start - 1] + A[end];
                avg = sum / N;
                if (avg <= minAvg) {
                    minAvg = avg;
                    idx = start;
                }
                start++;
                end++;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] A = {3, 7, 90, 20, 10, 50, 40};
        int[] B = {3, 7, 5, 20, -10, 0, 12};
        int[] C = {18, 11, 16, 19, 11, 9, 8, 15, 3, 10, 9, 20, 1, 19};
        int[] D = {15, 3, 15, 6, 9, 14, 8, 10, 9, 17};
        int[] E = {13, 9, 1, 11, 13, 20, 8, 20, 16, 6, 20, 7, 11, 2, 3, 8, 15, 11 };
        System.out.println(solve(E, 14));
    }
}
