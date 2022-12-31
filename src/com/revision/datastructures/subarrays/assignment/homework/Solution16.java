package com.revision.datastructures.subarrays.assignment.homework;

public class Solution16 {

    private static long subarraySum(int[] A) {
        int N = A.length;
        int ans = 0;
        for(int i=0 ; i < N ; i++){
            for( int j= i ; j < N; j++){
//                for (int k = i; k <= j ; k++) {
                    ans = ans + A[j];
//                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] A = { 1, 2, 3 };
        System.out.println(subarraySum(A));
    }

}
