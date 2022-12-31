package com.revision.datastructures.slidingwindow.classroom;

//Given an array  of size N & number B. Return minimum number of swaps required to bring
//all elements less than equal to B together
public class Solution1 {

    private static void bringElementsTogether(int[] A, int B) {
        int N = A.length;
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] <= B) {
                count++;
            }
        }
        int minSwaps = Integer.MAX_VALUE;
        for (int i = 0; i < N-count; i++) {
            int swapCount = 0;
            for (int j = i; j < count+i; j++) {
                if (A[j] > B) {
                    swapCount++;
                }
            }
            minSwaps = Math.min(minSwaps, swapCount);
        }
        System.out.println(minSwaps);
    }

    public static void main(String[] args) {
        int[] A = {1, 12, 10, 3, 14, 10, 5};
        bringElementsTogether(A, 8);
    }

}
