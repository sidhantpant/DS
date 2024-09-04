package com.revision.datastructures.contest1;

public class Solution {
    public int[] solve(String A, int[][] B) {
        
        int N = A.length();
        char[] ch = A.toCharArray();
        int[] PS = new int[N+1];
        PS[0] = 0;
        
        for(int i = 1 ; i < N+1 ;i++){
            if(ch[i-1] == 'a' || ch[i-1] == 'e' || ch[i-1] == 'i' || ch[i-1] == 'o' || ch[i-1] == 'u'
            || ch[i-1] == 'A' || ch[i-1] == 'E' || ch[i-1] == 'I' || ch[i-1] == 'O' || ch[i-1] == 'U'){
                PS[i] = PS[i-1] + 1; 
            }else{
                PS[i] = PS[i-1];
            }
        }
        int M = B.length;
        int[] Q = new int[M];
        for(int i= 0 ;i < M ;i++){
            int s = B[i][0];
            int e = B[i][1];
            int val = PS[e+1] - PS[s];
            Q[i] = val;
        }
        return Q;
    }

    public static void main(String[] args) {
        String A = "bgipsvukg";
        int[][] B ={{2,6},{4,7},{6,7}};
        Solution sol = new Solution();
        sol.solve(A,B);
    }
}
