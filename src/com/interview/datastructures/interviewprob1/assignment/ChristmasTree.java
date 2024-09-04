package com.interview.datastructures.interviewprob1.assignment;

public class ChristmasTree {

    public int minCost(int[] A, int[] B) {

        int N = A.length;
        int total_min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int min_left = Integer.MAX_VALUE;
            int min_right = Integer.MAX_VALUE;

            for (int j = i - 1; j >= 0; j--) {
                if (A[j] < A[i]) {
                    min_left = Math.min(min_left, B[j]);
                }
            }

            for (int j = i + 1; j < N; j++) {
                if (A[j] > A[i]) {
                    min_right = Math.min(min_right, B[j]);
                }
            }
            if(min_left != Integer.MAX_VALUE && min_right != Integer.MAX_VALUE){
                int sum = min_left + min_right + B[i];
                total_min = Math.min(total_min, sum);
            }
        }
        if(total_min == Integer.MAX_VALUE){
            return -1;
        }
        return total_min;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 5};
        int[] B = {1, 2, 3};

        ChristmasTree cs = new ChristmasTree();
        System.out.println(cs.minCost(A, B));
    }
}
