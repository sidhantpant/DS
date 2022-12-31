package com.revision.datastructures.introarrays.assignment;

public class Solution5 {

    private static int[] rotateArrayRightToLeftClockwiseBF(int[] A, int B) {
        int N = A.length;
        for (int i = 0; i < B % N; i++) {
            int last = A[N - 1];
            for (int j = N - 1; j > 0; j--) {
                A[j] = A[j - 1];
            }
            A[0] = last;
        }
        return A;
    }

    private static int[] rotateArrayRightToLeftClockwiseOptimised(int[] A, int K) {
        int N = A.length;
        K = K % N;
        reverseArray(A, 0, N - 1);
        reverseArray(A, 0, K - 1);
        reverseArray(A, K, N - 1);
        return A;
    }

    public static int[] rotateArrayLeftToRightAntiClockwise(int[] A, int B) {
        int N = A.length;
        for (int i = 0; i < B % N; i++) {
            int first = A[0];
            for (int j = 1; j < N; j++) {
                A[j - 1] = A[j];
            }
            A[N - 1] = first;
        }
        return A;
    }

    private static int[] rotateArrayLeftToRightAntiClockwiseOptimised(int[] A, int K) {
        int N = A.length;
        reverseArray(A, 0, N - 1);
        reverseArray(A, 0, N - K - 1);
        reverseArray(A, N - K, N - 1);
        return A;
    }


    private static int[] reverseArray(int[] A, int start, int end) {
        while (start < end) {
            swap(A, start, end);
            start++;
            end--;
        }
        return A;
    }

    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
//        rotateArrayRightToLeftClockwiseBF(A, 3);
//        rotateArrayLeftToLeftAntiClockwiseBF(A,3);
//        rotateArrayRightToLeftClockwiseOptimised(A, 3);
        rotateArrayLeftToRightAntiClockwiseOptimised(A, 3);
    }


}
