package com.practice.datastructures.bitmanipulation.assignment;

public class ElementFrequency {

    private static int elementOddTimesBruteForce(int[] A) {
        int N = A.length;
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (A[i] == A[j]) {
                    count++;

                }
            }

            if (count == 1) {
                return A[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] A = {2, 8, 3, 1, 2, 1, 8, 1, 1};
        System.out.println(elementOddTimesBruteForce(A));
    }
}
