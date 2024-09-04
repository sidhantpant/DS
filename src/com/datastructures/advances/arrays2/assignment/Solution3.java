package com.datastructures.advances.arrays2.assignment;

public class Solution3 {

    private static void sumAllSubmatrixBruteForce(int[][] A) {

        int M = A.length;
        int N = A[0].length;

        int ans = 0 ;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                // TL -> i,j  00 01  // start
                for (int p = i; p < M; p++) {
                    for (int q = j; q < N; q++) {
                        // BR -> p,q // end
                        int sum = 0;
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

    int solve(int[][] A){
        int N = A.length;
        int[][] suffix = new int[N][N];
        suffix[N-1][N-1] = A[N-1][N-1];

        int ans = suffix[N-1][N-1];
        for (int j = N-2; j >= 0  ; j--) {
            suffix[N-1][j] = suffix[N-1][j+1] + A[N-1][j];
            ans = Math.max(ans,suffix[N-1][j]);
        }
        for(int i = N - 2 ; i >= 0 ; i--){
            suffix[i][N - 1] = suffix[i + 1][N - 1] + A[i][N - 1];
            ans = Math.max(ans, suffix[i][N - 1]);
        }
        for(int i = N - 2 ; i >= 0 ; i--){
            for(int j = N - 2 ; j >= 0 ; j--){
                suffix[i][j] = A[i][j] + suffix[i + 1][j] + suffix[i][j + 1] - suffix[i + 1][j + 1];
                ans = Math.max(ans, suffix[i][j]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] A = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        Solution3 sol = new Solution3();
        sol.solve(A);
    }


}
