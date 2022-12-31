package com.revision.datastructures.carryforward.assignments;

public class Solution2 {

    private static int pairIndices(String A) {

        int N = A.length();
        int count_a = 0;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (A.charAt(i) == 'a' || A.charAt(i) == 'A') {
                count_a = count_a + 1;
            }
            if (A.charAt(i) == 'g' || A.charAt(i) == 'G') {
                ans = ans + count_a;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s1 = "acbagkagg";
        System.out.println(pairIndices(s1));
    }
}

