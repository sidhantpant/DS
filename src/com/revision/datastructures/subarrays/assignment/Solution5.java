package com.revision.datastructures.subarrays.assignment;

public class Solution5 {

    private static int goodSubArrayBruteForce(int[] A, int B) {

        int count = 0;
        int N = A.length;
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = i; j < N; j++) {
                int size = j - i + 1;
                sum = sum + A[j];
                if (size % 2 == 0 && sum < B) {
                    count++;
                } else if (size % 2 == 1 && sum > B) {
                    count++;
                }
            }
        }
        return count;
    }

    private static int countGoodSubarraysOptimised(int[] A, int B) {

        int count = 0;
        int N = A.length;
        int[] PS = new int[N + 1];
        PS[0] = 0;

        for (int i = 1; i < N + 1; i++) {
            PS[i] = PS[i - 1] + A[i - 1];
        }

        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {

                int size = j - i + 1;
                int sum = PS[j + 1] - PS[i];
                if (size % 2 == 0 && sum < B) {
                    count++;
                } else if (size % 2 == 1 && sum > B) {
                    count++;
                }

            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] A = {13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9};
        System.out.println(goodSubArrayBruteForce(A, 65));
        System.out.println(countGoodSubarraysOptimised(A, 65));
    }

}


