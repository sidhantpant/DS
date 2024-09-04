package com.datastructures.advances.dynamicprogramming1.assignment;

public class Solution3 {

    int ans = 0;

    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        System.out.println(sol.countMinSquares(10, sol.ans));
    }

    int countMinSquares(int A, int ans) {

        if (A == 1) {
            return 1;
        }
        if (A == 2) {
            return 2;
        }
        if (A == 3) {
            return 3;
        }
        int N = (int) Math.sqrt(A);
        A = A - N * N;//13-9 =4
        if (A != 0) {
            ans = ans+1;
            ans = ans + countMinSquares(A, ans + 1);
        } else {
            ans = ans + 1;
        }
        return ans;
    }

    int perfectSquare(int A) {
        for (int i = 0; i * i < A; i++) {
            if (i * i == A) {
                return i;
            }
        }
        return -1;
    }


}
