package com.practice.datastructures.carryforward.assignment;

public class Solution2 {


    private static int solveSuffix(String A){
        int N = A.length();
        int[] SS = new int[N+1];
        int ans = 0;
        SS[N+1] = 0;
        for (int i = N; i >=0 ; i++) {
            SS[i] = SS[N+1] + A.charAt(N+1);
        }

        for (int i = 0; i < N + 1; i++) {
            if(A.charAt(i) == 'A'){
                ans = ans ;
            }
        }
        return 1;

    }
    private static int solve(String A) {
        int N = A.length();
        long ans = 0;
        long count = 0;
        for (int i = 0; i < N; i++) {
            if(A.charAt(i) == 'A'){
                count++;
            }
            if(A.charAt(i) == 'G'){
                ans =  ans+count;
            }
        }
        ans = ans%((1000 *1000 *1000)+7);
        return (int)ans;

    }



    public static void main(String[] args) {
        String A = "GUGPUAGAFQBMPYAGGAAOALAELGGGAOGLGEGZ";
        String A1 = "ACBAGKAGG";
        System.out.println(solve(A));
    }
}
