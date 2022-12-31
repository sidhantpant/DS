package com.datastructures.advances.arrays1.homework;

public class Solution3 {

    private static int[] flipKadanes(String A) {
        int N = A.length();
        int[] M = new int[N];
        int[] pair = new int[2];
        for (int i = 0; i < N; i++) {
            if (A.charAt(i) == '0') {
                M[i] = 1;
            } else {
                M[i] = 0;
            }
        }
        int curr_sum = 0;
        int max_sum = 0;
        int first_index = 0;
        int last_index = 0;
        int idx = 0;
        for (int i = 0; i < N; i++) {
            curr_sum = curr_sum + M[i];
            if (curr_sum < 0) {
                curr_sum = 0;
                idx = i + 1;
                continue;
            } else if (curr_sum > max_sum) {
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
        System.out.println(flipKadanes("010"));
    }

}
