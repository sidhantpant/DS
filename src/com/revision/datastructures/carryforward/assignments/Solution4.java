package com.revision.datastructures.carryforward.assignments;

public class Solution4 {

    private static int countMinMax(int[] A) {

        int N = A.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int length = N;
        for (int i = 0; i < N; i++) {
            min = Math.min(min, A[i]);
            max = Math.max(max, A[i]);
        }

        for (int i = 0; i < N; i++) {
            if (A[i] == max) {
                for (int j = i + 1; j < N; j++) {
                    if (A[j] == min) {
                        length = Math.min(length, j - i + 1);
                    }
                }
            }
        }
        for (int i = 0; i < N; i++) {
            if (A[i] == min) {
                for (int j = i + 1; j < N; j++) {
                    if (A[j] == max) {
                        length = Math.min(length, j - i + 1);
                    }
                }
            }
        }
        return length;
    }

    private static int minMaxCount(int[] A) {

        int N = A.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            min = Math.min(min, A[i]);
            max = Math.max(max, A[i]);
        }

        int lastMinIndex = -1;
        int lastMaxIndex = -1;
        int length = N;
        for (int i = 0; i < N; i++) {
            if (A[i] == min) {
                lastMinIndex = i;
                if (lastMaxIndex >= 0) {
                    length = Math.min(length, i - lastMaxIndex + 1);
                }

            }
            if (A[i] == max) {
                lastMaxIndex = i;
                if (lastMinIndex >= 0) {
                    length = Math.min(length, i - lastMinIndex + 1);
                }
            }
        }
        return length;
    }

    private static int minMaxElement(int[] A) {
        int N = A.length;
        int MIN = Integer.MAX_VALUE;
        int MAX = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            MIN = Math.min(MIN, A[i]);
            MAX = Math.max(MAX, A[i]);
        }
        int lastMinIndex = -1;
        int lastMaxIndex = -1;
        int length = N;
        for (int i = 0; i < N; i++) {
            if (A[i] == MIN) {
                lastMinIndex = i;
                if (lastMaxIndex > 0) {
                    length = Math.min(length, i - lastMaxIndex + 1);
                }
            } else if (A[i] == MAX) {
                lastMaxIndex = i;
                if (lastMinIndex > 0) {
                    length = Math.min(length, i - lastMinIndex + 1);
                }
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 4, 1, 2, 4, 6, 5, 4, 1};
        System.out.println(countMinMax(A));
    }

}
