package com.interview.datastructures.interviewprob2.classroom;

import java.util.ArrayList;
import java.util.List;

public class SpecialIndex {

    public int countSpecialIndex(int[] A) {

        int N = A.length;
        int[] PSE = new int[N + 1];
        PSE[0] = 0;
        for (int i = 1; i < N + 1; i++) { // 1 3 2 4
            if (i % 2 != 0) {             // 0 0 3 3 7
                PSE[i] = PSE[i - 1] + A[i - 1];
            } else {
                PSE[i] = PSE[i - 1];
            }
        }

        int[] PSO = new int[N + 1];   // 1 3 2 4
        PSO[0] = 0;                   // 0 1 1 3 3
        for (int i = 1; i < N + 1; i++) {
            if (i % 2 == 0) {
                PSO[i] = PSO[i - 1] + A[i - 1];
            } else {
                PSO[i] = PSO[i - 1];
            }
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            int SE = PSE[i] - PSE[0] + PSO[N] - PSO[i+1];
            int SO = PSO[i] - PSO[0] + PSE[N] - PSE[i+1];

            if(SE == SO){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int[] A = {1,1,1};
        SpecialIndex si = new SpecialIndex();
        System.out.println(si.countSpecialIndex(A));
    }

}
