package com.revision.datastructures.introarrays.homework;

/*You are given an integer array A. You have to find the second largest element/value in
the array or report that no such element exists.*/
public class Solution3 {

    private static int secondLargestElement(int[] A) { // 2 1 2

        int N = A.length;
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        if (N == 1) {
            return -1;
        }
        for (int i = 0; i < N; i++) {

            if (A[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = A[i];
            } else if (A[i] > secondLargest) {
                secondLargest = A[i];
            }

        }
        System.out.println(secondLargest);
        return secondLargest;
    }

    private static int secondLargest1(int[] A) {

        int max = A[0];
        int ind = 0;
        int N = A.length;
        if (N == 1) {
            return -1;
        }
        for (int i = 0; i < N; i++) {
            if (A[i] > max) {
                max = A[i];
                ind = i;
            }
        }
        swap(A, 0, ind);
        max = A[1];
        for (int i = 1; i < N; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        System.out.println(max);
        return max;
    }

    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void main(String[] args) {
        int[] A = {8, 5, 1, 2, 3, 6};
        int[] A1 = {2};
//        secondLargestElement(A1);
        secondLargest1(A);
    }
}
