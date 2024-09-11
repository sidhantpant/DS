package com.practice.datastructures.sorting.assignment;

import java.util.Arrays;

public class Solution2 {

    static int greaterThan(int[] A){
        int N= A.length;
        Arrays.sort(A);
        for (int i = 0; i < N/2; i++) {
            int temp = A[i];
            A[i] =  A[N-i-1];
            A[N-1-i] = temp;
        }
        int c = 0 ;
        int ans = 0 ;
        if(A[0] == 0 && N==1){
            ans=1;
        }
        for (int i = 1; i < N; i++) {
            if(A[i-1] != A[i]){
                c=i;
            }
            if(A[i] == c){
                ans++;
                return ans;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {6,5,2};
        System.out.println(greaterThan(A));
    }
}
