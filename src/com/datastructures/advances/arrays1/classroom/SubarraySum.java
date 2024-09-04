package com.datastructures.advances.arrays1.classroom;

public class SubarraySum {

    int[] sumSubarray(int[][] Q){
        int[] A = new int[7];
        int N = A.length;
        for (int i = 0; i < N; i++) {
            A[i] = 0;
        }
        int M = Q.length;
        for (int i = 0; i < M; i++) {
            int index = Q[i][0];
            int value = Q[i][1];
            A[index] = value;
        }

        // Create a Prefix Sum from A[]
        for (int i = 1; i < N; i++) {
            A[i] = A[i-1]+A[i];
        }
        return A;
    }

    int[] sumStartEnd(int[][] Q ){
        int[] A = new int[7];
        int N = A.length;
        for (int i = 0; i < N ; i++) {
            A[i] = 0;
        }

        for (int i = 0; i < Q.length; i++) {
            int start = Q[i][0];
            int end = Q[i][1];
            int val = Q[i][2];
            A[start] = A[start] + val;
            if(end+1 < N){
                A[end+1] = A[end+1] - val;
            }
        }

        // create a PS on a given array itself
        for (int i = 1; i < N; i++) {
            A[i] = A[i] + A[i-1];
        }
        return A;
    }

    public int[] solve(int A, int[][] B) {
        int[] M = new int[A];
        for (int i = 0; i < B.length; i++) {
            int startIndex = B[i][0];
            int endIndex = B[i][1];
            int value = B[i][2];
            startIndex = startIndex - 1;
            endIndex = endIndex - 1;
            M[startIndex] = M[startIndex] + value;
            if ( endIndex + 1 < A ) {
                M[endIndex + 1] = M[endIndex + 1] - value;
            }
        }
        int N = M.length;
        for (int i = 1; i < N; i++) {
            M[i] = M[i - 1] + M[i];
        }

        return M;
        //  10 10 -10 -10 -10
        //  10 30  10 -30 -30
        //  10 55  35 -55 -55
    }

    public static void main(String[] args) {
        SubarraySum sum = new SubarraySum();
        int[][] Q = {{1, 3}, {4, 2}, {2, 1}};
        sum.sumSubarray(Q);

        int[][] Q1 = {{2,5,1},{1,3,3},{4,6,5},{0,3,4}};
        sum.sumStartEnd(Q1);

        int[][] Q3 ={{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
        sum.solve(5,Q3);
        //
    }
}
