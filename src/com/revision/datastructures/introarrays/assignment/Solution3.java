package com.revision.datastructures.introarrays.assignment;

/*Given an array A of N integers. Also given are two integers B and C.
Reverse the array A in the given range [B, C]*/
public class Solution3 {

    private static int[] reverseArray1(int[] A) {
        int N = A.length;
        for (int i = 0; i < N / 2; i++) {
            swap(A, i, N - 1 - i);
        }
        return A;
    }

    private static int[] reverseArray2(int[] A) {
        int N = A.length;
        int start = 0;
        int end = N - 1;
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

        int[] A = {1, 2, 3, 4, 5, 6, 7, 8};
//        reverseArray1(A);
        reverseArray2(A);

    }

}
