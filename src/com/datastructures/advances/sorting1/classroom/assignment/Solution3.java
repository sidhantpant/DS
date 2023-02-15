package com.datastructures.advances.sorting1.classroom.assignment;

import java.util.Arrays;

public class Solution3 {

    static int consecutive(int[] A){
        int N = A.length;
        Arrays.sort(A);
//        for (int i = 0; i < N-1; i++) {
//            if(A[i+1]!= A[i]+1){
//                return 0;
//            }
//        }

        int minn = A[0];
        // check if the elements are consecutive
        for (int i = 0; i < A.length; i++) {
            int x = A[i];
            if (x != minn)
                return 0;
            minn++;
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] A = {3,2,1,4,5};
        System.out.println(consecutive(A));
    }

}
