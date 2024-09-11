package com.interview.datastructures.intermediate.modul1.contest;

public class ConstructBinaryNumber {

    public int solve(int A, int B) {
        int C = A+B;
        int ans = 0 ;
        for(int i = B; i < C ;i++){
            ans = ans + 1<< B ;  // N << x => N*2^x => (1*2^B)
        }
        return ans;
    }

    public static void main(String[] args) {
        ConstructBinaryNumber cn = new ConstructBinaryNumber();
        cn.solve(3,2);
    }
}
