package com.datastructures.advances.permutations.classroom;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<int[]> l1 = new ArrayList<>();
    public int[][] permute(int[] A) {
        int N = A.length;
        boolean[] vist = new boolean[N];
        int[] ans = new int[N];
        permute(A,ans,vist,0);
        return l1.toArray(new int[0][]);

    }

    void permute(int[] A ,int[] ans ,boolean[] vist,int idx){
        int N = A.length;
        if(idx == N){
            l1.add(ans);
            return ;
        }

        for(int i=0 ; i< N ;i++){
            if(!vist[i]){
                vist[i] = true;
                ans[idx] = A[i];
                permute(A , ans, vist,idx+1);
                vist[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[] A = {1,2,3};
        Solution solution = new Solution();
       int[][] B = solution.permute(A);
        System.out.println(B);
    }
}
