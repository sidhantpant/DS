package com.datastructures.advances.backtracking1.classroom;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

    public String[][] solveNQueens(int A) {
        char[][] ans = new char[A][A];
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < A; j++) {
                ans[i][j] = '.';
            }
        }
        List<List<String>> result = new ArrayList<>();
        queen(ans, A, 0, result);
        String[][] array = new String[result.size()][];
        int i = 0;
        for (List<String> nestedList : result) {
            array[i++] = nestedList.toArray(new String[0]);
        }
        return array;

    }

    void queen(char Q[][], int N, int i, List<List<String>> result) {
        if (i == N) {
            //convert Q[][] to a single list
            result.add(print(Q));

        }
        // At ith we need to place a Queen
        for (int j = 0; j < N; j++) {
            // try to place Q at i & j by checking ith row & jth col
            if (check(Q, i, j, N)) {
                Q[i][j] = 'Q';
                queen(Q, N, i + 1, result);
                Q[i][j] = '.';
            }
        }

    }

    List<String> print(char Q[][]) {
        int N = Q.length;
        List<String> res = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String row = new String(Q[i]);
            res.add(row);
        }
        return res;
    }

    boolean check(char Q[][], int i, int j, int N) {
        //step 1 : check column
        for (int r = 0; r < i; r++) {
            if (Q[r][j] == 'Q') {
                return false;
            }
        }

        // step 2 : left diagonal
        int r = i;
        int c = j;
        while (r >= 0 && c >= 0) {
            if (Q[i][j] == 'Q') {
                return false;
            }
            r--;
            c--;
        }

        r = i;
        c = j;
        while (r >= 0 && c < N) {
            if (Q[r][c] == 'Q') {
                return false;
            }
            r--;
            c++;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        sol.solveNQueens(3);
    }

}
