package com.interview.datastructures.subarrays.assignment;

public class SpeciaSubsequence {

    public int solve(String A) {

        int N = A.length();
        int count_g = 0 ;
        int ans = 0 ;
        for(int i = N-1 ; i >= 0 ; i--){

            if(A.charAt(i) == 'G'){
                count_g++;
            }

            if(A.charAt(i) == 'A'){
                ans = ans + count_g;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        SpeciaSubsequence ss = new SpeciaSubsequence();
        ss.solve("AAEYETGGA");
    }
}
