package com.datastructures.advances.arrays2.assignment;

public class Solution {
    public long solve(int[][] A) {
        
        int r = A.length;
        int c = A[0].length;
        long[][] ps = new long[r+1][c+1];

        for(int i = 1 ;i <= r ; i++){
            for(int j = 1; j<= c ; j++){
                ps[i][j] = ps[i-1][j] + ps[i][j-1] - ps[i-1][j-1] + A[i-1][j-1];
            }
        }
        long ans = Long.MIN_VALUE;

        for(int i = 1 ; i <= r ; i++){
            for(int j = 1 ; j<=c ; j++){
                long temp = ps[r][c] - ps[r][j-1] - ps[i-1][c] + ps[i-1][j-1];
                ans = Math.max(ans , temp);
            }
        }
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[][] A = {{-5,-4,-3},{-1,2,3} ,{2,2,4}};
        Solution sol = new Solution();
        sol.solve(A);
    }
}
