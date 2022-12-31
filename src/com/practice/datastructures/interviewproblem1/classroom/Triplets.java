package com.practice.datastructures.interviewproblem1.classroom;

// Given an array count the number of triplets i,j &k such that A[i] < A[j] < A[k]
public class Triplets {

    private static int countTripletsBruteForce(int[] A) {

        int N = A.length;
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (A[k] > A[j] && A[j] > A[i]) {
                        System.out.println("i=" + i + ",j=" + j + ",k=" + k);
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        return count;
    }

    private static int countTripletsOptimised(int[] A) {

        int N = A.length;

        int ans = 0;
        for (int i = 0; i < N; i++) {
            int countLeft = 0;
            int countRight = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (A[i] > A[j]) {
                    countLeft++;
                }
            }
            for (int j = i + 1; j < N; j++) {
                if (A[j] > A[i]) {
                    countRight++;
                }
            }
            ans = ans + countLeft * countRight;
        }
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {2, 6, 9, 4, 10};
        int[] A1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        countTripletsBruteForce(A1);
        // 1 2 3 4 5 6 7 8 9 10
        countTripletsOptimised(A1);

    }

}
