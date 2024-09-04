package com.practice.datastructures.recursion2.assignment;

public class Solution4 {
    int ind = 0;
    int[][] ans;
    public int[][] towerOfHanoi(int A) {
        int M = (1<< A)-1;
        ans = new int[M][3];
        int S = 1;
        int T = 2;
        int D = 3;
        toh(A,S,T,D);
        return ans;
    }

    void toh(int A ,int S,int T,int D){

        if(A ==0 ){
            return;
        }

        toh(A-1 ,S ,D,T);
        ans[ind][0] = A;
        ans[ind][1] = S;
        ans[ind][2] = D;
        ind++;
        toh(A-1 ,T,S,D);
        return;
    }

    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        solution4.towerOfHanoi(2);
    }
}
