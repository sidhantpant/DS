package com.datastructures.advances.arrays1.classroom;

public class Solution3 {
    private static int[] sumKadanesIndexOptimised(int[] A) {
        //-10, 4, 5, -10, 2, 100
        int max_sum = A[0];
        int curr_sum = A[0];
        int[] pair = new int[2];
        int N = A.length;
        int first_index = 0;
        int last_index = 0;
        int idx = 0;
        for (int i = 0; i < N; i++) { // unintentionally i=0 gives correct ans but it should run from i=1
            if (curr_sum < 0) {
                curr_sum = 0;
                idx = idx+1;
                continue;
            }
            curr_sum = curr_sum + A[i];
            if (curr_sum > max_sum) {
                first_index = idx;
                last_index = i;
                max_sum = curr_sum;
            }
        }
        pair[0] = first_index;
        pair[1] = last_index;
        return pair;
    }

    public static void main(String[] args) {
        int[] A = {-10, 4, 5, -10, 2, 100};
//        System.out.println(sum(A));
        System.out.println(sumKadanesIndexOptimised(A));

    }
}
