package com.datastructures.advances.arrays3.classroom;

public class DateTime1 {

    private static void overlappingTime(int[] S, int[] E) {

        int N = S.length;
        int SCurr = S[0];
        int ECurr = E[0];
        for (int i = 1; i < N; i++) {
            if (S[i] <= ECurr) {
                ECurr = Math.max(ECurr, E[i]);
            } else {
                System.out.println(SCurr + "-" + ECurr);
                SCurr = S[i];
                ECurr = E[i];
            }
        }
        System.out.println(SCurr + "-" + ECurr);
    }


    public static void main(String[] args) {
        int[] S = {0, 1, 5, 6, 7, 8, 12};
        int[] E = {2, 4, 6, 8, 10, 9, 14};
        overlappingTime(S, E);
    }


}
