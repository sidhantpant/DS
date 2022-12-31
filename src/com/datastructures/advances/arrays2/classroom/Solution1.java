package com.datastructures.advances.arrays2.classroom;

public class Solution1 {

    private static int[] sumAllSubMatrix(int[][] A, int[] B, int[] C, int[] D, int[] E) {
        int M = A.length;
        int N = A[0].length;
        int sum = 0;
        int[][] PSR = new int[M][N];

        for (int i = 0; i < M; i++) {
            PSR[i][0] = A[i][0];
        }

        for (int i = 0; i < M; i++) {
            for (int j = 1; j < N; j++) {
                PSR[i][j] = PSR[i][j - 1] + A[i][j];
            }
        }

        int RL = PSR.length;
        int CL = PSR[0].length;
        int[][] PSC = new int[RL][CL];

        // 1 3 6 // 4 9 15 // 7 15 22
        System.arraycopy(PSR[0], 0, PSC[0], 0, N);
        // 00 01 02 03
        // 10 11 12 13
        for (int i = 0; i < CL; i++) {
            for (int j = 1; j < RL; j++) {
                PSC[j][i] = PSC[j - 1][i] + PSR[j][i]; //PSC[2][0] = PSC[1][0] + PSR[2][0]= 5+7 =12
            }
        }

        int[] Z = new int[B.length];
        for (int k = 0; k < B.length; k++) {
            int i = B[k] - 1;
            int j = C[k] - 1;

            int p = D[k] - 1;
            int q = E[k] - 1;

            if ((i == 0 && j == 0) || (p == 0 & q == 0)) {
                sum = PSC[p][q];
            } else if (i == 0 || p == 0) {
                sum = PSC[p][q] - PSC[p][j - 1];
            } else if (j == 0 || q == 0) {
                sum = PSC[p][q] - PSC[i - 1][q];
            } else {
                sum = PSC[p][q] - PSC[p][j - 1] - PSC[i - 1][q] + PSC[i - 1][j - 1];
            }
            Z[k] = sum;

            // m i n j
        }
        return Z;
        //    0,0  0,1  0,2 = PSC[1][0] = PSC[0][0]+PSR[1][0]
        //    1,0  1,1  1,2
        //    2,0  2,1  2,2

    }

    private static void sumAllSubmatrixBruteForce(int[][] A) {

        int M = A.length;
        int N = A[0].length;

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                // TL -> i,j  00 01  // start
                for (int p = i; p < M; p++) {
                    for (int q = j; q < N; q++) {
                        // BR -> p,q // end
                        for (int row = i; row <= p; row++) {
                            for (int col = j; col <= q; col++) {
                                System.out.print("[" + row + " " + col + "]");
                            }
                        }
                        System.out.println();
                    }
                }
                System.out.println("===");
            }
        }
    }

    private static int printSum(int[] A, int s, int e) {
        int sum = 0;
        for (int i = s; i <= e; i++) {
            sum = sum + A[i];
        }
        return sum;
    }



    public static void main(String[] args) {
        int[][] Q = {{5, 17, 100, 11}, {0, 0, 2, 8}};
//        sumAllSubMatrix(Q);
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] B = {1, 1};
        int[] C = {1, 4};
        int[] D = {2, 2};
        int[] E = {2, 4};

        System.out.println(sumAllSubMatrix(Q, B, C, D, E));
    }


}
