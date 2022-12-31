package com.datastructures.advances.arrays2.classroom;

public class SubarrayMatrixSum {

    int modNum = 1000000007;
    /*  Returns prefix-sum matrix array.
        TC -> O(N * M), SC -> O(N * M) /
    private long[][] getPrefixSumMatrix(int[][] A)
    {
        /*  Create N * M size prefix-sum matrix array as same as orginal matrix array.
            Data type of prefix-sum matrix array is long to avoid the overflow */


    private long[][] getPrefixSumMatrix(int[][] A) {
        /*  Row-wise prefix-sum of orginal matrix array */
        long[][] pf = new long[A.length][A[0].length];
        for (int r = 0; r < A.length; r++) {
            long sum = 0;
            for (int c = 0; c < A[0].length; c++) {
                sum = sum + A[r][c];
                pf[r][c] = sum;
            }
        }

        /*  Column-wise prefix sum of row-wise prefixed-sum matrix array */
        for (int c = 0; c < pf[0].length; c++) {
            long sum = 0;
            for (int r = 0; r < pf.length; r++) {
                sum = sum + pf[r][c];
                pf[r][c] = sum;
            }
        }

        return pf;
    }

    /*  Outputs the prefix-sum matrix array on console */
    private void displayPrefixSumMatrix(long[][] A) {
        for (int r = 0; r < A.length; r++) {
            for (int c = 0; c < A[0].length; c++)
                System.out.print(A[r][c] + " ");

            System.out.println();
        }
    }

    public int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {
        /*  Get the prefix-sum matrix array */
        long[][] pf = getPrefixSumMatrix(A);

        /*  Single dimension array for returning the output */
        int[] subMatSum = new int[B.length];

        for (int i = 0; i < B.length; i++) {
            /*  Top-Left index */
            int r1 = B[i] - 1;
            int c1 = C[i] - 1;

            /*  Bottom-Right index */
            int r2 = D[i] - 1;
            int c2 = E[i] - 1;

            long sum = pf[r2][c2];  /*  Sum of all matrix from [0, 0] to [N-1, M-1] */

            if (c1 > 0) sum = sum - pf[r2][c1 - 1];
            /*  Remove sum of [(bottom-left) - 1] from sum.
              i.e [0, 0] to [r2, c1-1] */

            if (r1 > 0) {
                sum = sum - pf[r1 - 1][c2];
                /*  Remove sum of [(top-right) - 1] from sum.
              i.e [0, 0] to [r1-1, c2] */
            }

            if (r1 > 0 && c1 > 0) {
                sum = sum + pf[r1 - 1][c1 - 1];
                /*  Add sum of [0, 0] to [r1-1, c1-1] to sum
                as this particular sum is removed twice
                from initial sum as mentioned in bottom-left and top-right */
            }

            /*  Finally convert into int and mod sum with (10 ^ 9 + 7) as mentioned in problem constraint */
            subMatSum[i] = (int) (((sum % modNum) + modNum) % modNum);
        }

        return subMatSum;
    }


}
