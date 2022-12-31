package com.practice.datastructures.arrays1;

public class Solution5 {

    private static int[] solve(int[] A, int B) {
        int N = A.length;
        if (B > 5) {
            B = B % N;
        }
        int start = 0;
        int end = B;
        while (start < end) {
            int last = A[N - 1];
            for (int i = N - 1; i > 0; i--) {
                A[i] = A[i - 1];
            }
            A[0] = last;
            start++;
        }
        return A;
    }

    private static int[] solve1(int[] A,int B){
        int N = A.length;
        for( int i=0 ;i < B%N ;i++){
            int last = A[N-1];
            for(int j = N-1 ; j>0 ;j--){
                A[j] = A[j-1];
            }
            A[0] = last;

        }
        return A;
    }

    public static void main(String[] args) {
        int[] arr = {7, 4, 2, 10, 5};
        int[] arr1 = solve1(arr, 1);
        for (int i : arr1) {
            System.out.print(i + ",");
        }



    }
}

