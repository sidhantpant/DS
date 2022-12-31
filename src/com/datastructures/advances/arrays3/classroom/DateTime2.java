package com.datastructures.advances.arrays3.classroom;

public class DateTime2 {

    private static void overlappingTime(int[] S, int[] E, int SNew, int ENew) {

        int N = S.length;
        for (int i = 0; i < N; i++) {
            if (SNew <= E[i] && ENew >= S[i]) { //2<=9
                S[i] = Math.min(SNew, S[i]);
                E[i] = Math.max(ENew, E[i]);
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.println(S[i]+"="+E[i]);
        }
    }

    public static void main(String[] args) {
        int[] S = {1,6};
        int[] E = {3,9};
        overlappingTime(S, E, 2, 5);
    }
}
        // 1 2 3 4 5 6 7 8 9
        // ----
        //           -------
        //    ------
