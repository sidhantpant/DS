package com.datastructures.advances.hashing2.classroom;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestCommonSubsequence {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int longestConsecutive(final int[] A) {

        int N = A.length;
        int count = 1;
        int ans = 1;
        Arrays.sort(A);
        for (int i = 0; i < N - 1; i++) {
            if (A[i] + 1 == A[i + 1]) {
                count++;
                ans = Math.max(ans, count);
            } else if (A[i] == A[i + 1]) {
                continue;
            } else {
                ans = Math.max(ans, count);
                count = 1;
            }
        }
        if (count == N) {
            ans = count;
        }
        return ans;
    }

    public int longestSubsequenceOptimised(int[] A) {
        int N = A.length;
        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i < N; i++) {
            hs.add(A[i]);
        }
        int count = 1;
        int ans = 0;
        // here elements are touched max two or three times
        for (Integer elem : hs) {
            if (!(hs.contains(elem - 1))) {
                int y = elem + 1;
                // continue the count process .
                while (hs.contains(y)) {
                    y++;
                    count++;
                }
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] A = { 1,1,2,2,3,3,4,4,5,5};
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        lcs.longestConsecutive(A);
        lcs.longestSubsequenceOptimised(A);
    }

}
