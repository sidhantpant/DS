package com.revision.datastructures.introarrays.assignment;

/*You are given a constant array A.You are required to return another array
which is the reversed form of the input array.*/
public class Solution4 {

    private static int[] reverseFormArray(int[] A) {
        int N = A.length;
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = A[N - 1 - i];
        }
        return B;
    }

    public static void main(String[] args) {
        int[]  A= {1,2,3,4,5};
        reverseFormArray(A);
    }
}
