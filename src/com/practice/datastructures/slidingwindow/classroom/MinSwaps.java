package com.practice.datastructures.slidingwindow.classroom;

public class MinSwaps {

    private static void minSwapsBruteForce(int[] A, int B) {
        int N = A.length;
        int count = 0;
        //count numbers less than B
        for (int i = 0; i < N; i++) {
            if (A[i] < B) {
                count++;
            }
        }
        // start swapping ones greater than B
        int minSwap = Integer.MAX_VALUE;
        for (int i = 0; i < N - count + 1; i++) {
            int countGreaterThanB = 0;
            for (int j = i; j < count + i; j++) {
                if (A[j] > B) {
                    countGreaterThanB++;
                }
            }
            System.out.print(countGreaterThanB + " ");
            minSwap = Math.min(minSwap, countGreaterThanB);
        }
        System.out.println("minswap " + minSwap);
    }

    private static void minSwapsBruteForceWhile(int[] A, int B) {
        int N = A.length;
        int count = 0;
        //count numbers less than B
        for (int i = 0; i < N; i++) {
            if (A[i] < B) {
                count++;
            }
        }
        // start swapping ones greater than B
        int start = 0;
        int end = count - 1;
        int minSwap = Integer.MAX_VALUE;
        while (end < N) {
            int countGreaterThan = 0;
            for (int i = start; i < count + start; i++) {
                if (A[i] > B) {
                    countGreaterThan++;
                }
            }
            minSwap = Math.min(minSwap, countGreaterThan);
            System.out.print(countGreaterThan + " ");
            start++;
            end++;
        }
        System.out.println(minSwap);
    }


    private static int minSwapsSlidingWindow(int[] A, int B) {

        int N = A.length;
        int K = 0;
        if(N == 0){
            return 0;
        }

        for (int i = 0; i < N; i++) {
            if (A[i] <= B) {
                K++;
            }
        }

        int countMax = 0;
        for (int i = 0; i < K; i++) {
            if (A[i] > B) {
                countMax++;
            }
        }
        System.out.print(countMax + " ");
        int start = 1;
        int min = Integer.MAX_VALUE;
        int end = K;
        while (end < N) {
            if (A[start - 1] > B) {
                countMax--;
            }
            if (A[end] > B) {
                countMax++;
            }
            System.out.print(countMax + " ");
            min = Math.min(min, countMax);
            start++;
            end++;
        }
        System.out.print("minswap =" + min);
        return min;
    }

    public static void main(String[] args) {
        int[] A = {2, 7, 9, 5, 8, 7, 10, 4}; //
//        minSwapsBruteForce(A, 6);
//        minSwapsBruteForceWhile(A, 6);
        int[] A1 = {52, 7, 93, 47, 68, 26, 51, 44, 5, 41, 88, 19, 78, 38, 17, 13, 24, 74, 92, 5, 84, 27, 48, 49, 37, 59, 3, 56, 79, 26, 55, 60, 16, 83, 63, 40, 55, 9, 96, 29, 7, 22, 27, 74, 78, 38, 11, 65, 29, 52, 36, 21, 94, 46, 52, 47, 87, 33, 87, 70};
        int[] A2 = {0};
        System.out.println(minSwapsSlidingWindow(A2, 0));
    }
}
