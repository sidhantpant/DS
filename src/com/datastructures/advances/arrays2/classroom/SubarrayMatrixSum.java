package com.datastructures.advances.arrays2.classroom;

import com.datastructures.advances.tries1.classroom.Node;

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

    private static void sumAllSubmatrixBruteForce(int[][] A) {

        int M = A.length;
        int N = A[0].length;

        int sum = 0 ;
        int ans = 0 ;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                // TL -> i,j  00 01  // start
                for (int p = i; p < M; p++) {
                    for (int q = j; q < N; q++) {
                        // BR -> p,q // end
                        for (int row = i; row <= p; row++) {
                            for (int col = j; col <= q; col++) {
                                sum +=  A[row][col];
                                System.out.println("sum" +sum);
                                ans = Math.max(ans , sum);
//                                System.out.print("[" + row + " " + col + "]");
                            }
                        }
                        System.out.println();
                    }
                }
                System.out.println("==="+ans);
            }
        }
    }

    int sumContributionTechnique(int[][] A){
        //no of submatrix containing (x,y) = count of possible TL * count of possible BR
        // count of possible TL = (x+1)*(y+1) => in [3][3] matrix that would be (2+1)*(2+1)
        //count of possible BR from (x,y) to (n-1,n-1) = (N-1-x+1)(N-1-y+1) = (N-x)*(N-y)
        int sum = 0;
        int N = A.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sum += A[i][j] * ((i+1)*(j+1) * (N-i)*(N-j));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        SubarrayMatrixSum sum = new SubarrayMatrixSum();
        sum.sumAllSubmatrixBruteForce(A);
//        System.out.println(sum.sumContributionTechnique(A));
    }



}
