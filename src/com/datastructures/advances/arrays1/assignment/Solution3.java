package com.datastructures.advances.arrays1.assignment;

import com.datastructures.advances.permutations.classroom.Solution;

import java.util.ArrayList;

public class Solution3 {

    void plusOne(int[] A){
        int carry = 1;
        int num ;
        int N = A.length;
        for (int i = N-1; i >= 0; i--) {
            num = A[i];
            num = num + carry;
            carry = 0;
            if(num == 10){
                num = 0;
                carry = 1;
            }
            A[i] = num;
        }
        ArrayList<Integer> res = new ArrayList<>();
        if(carry == 1){
            res.add(1);
        }
        for (int x : A ) {
            res.add(x);
        }
    }

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        solution3.plusOne(new int[]{999});
    }
}
