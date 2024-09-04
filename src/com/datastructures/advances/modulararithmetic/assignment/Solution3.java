package com.datastructures.advances.modulararithmetic.assignment;

public class Solution3 {
    int mod = 1000000007;
    public int solve(int A, int B) {
        int mod = 1000000007;
        int fact = factorial(A);
        return (power(A,fact))%mod;
    }

    public int power(int A ,int B){
        int ans = 1 ;
        for(int i=0 ;i< B ;i++){
            ans = ans * A;
        }
        return ans %mod;
    }

    public int factorial(int B){
        if(B == 1 || B==0){
            return 1;
        }
        return  B * factorial(B-1);
    }

    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        System.out.println(sol.solve(12,58));
    }
}
