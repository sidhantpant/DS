package com.practice.datastructures.subarrays.assignment;

public class Solution7 {

    private static int solve(int[] A, int B) {
        int n = A.length;
        int pref[] = new int[n];
        pref[0] = A[0];
        int ans = 0;
        for(int i = 1 ; i < n ; i++){
            pref[i] = pref[i - 1] + A[i];
        }
        for(int i = 0 ; i < n ; i++){
            for (int j = i ; j < n ; j++){
                int sz = j - i + 1;
                int sum;
                if(i == 0){
                    sum = pref[j];
                }
                else{
                    sum = pref[j] - pref[i - 1];
                }
                if(sz % 2 == 0 && sum < B){
                    ans++;
                }
                if(sz % 2 == 1 && sum > B){
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        solve(A,4);
    }


}
