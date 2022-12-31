package com.practice.datastructures.prefix.classrooom;

import java.util.Scanner;

public class RangeEven {

    private static void evenRange(int[] A, int Q) {
        int N = A.length;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Q; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            int count = 0;
            for (int j = start; j <= end; j++) {
                if (A[j] % 2 == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    private static void evenRangePrefix(int[] A, int Q) {
        int N = A.length;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            if (A[i] % 2 == 0) {
                A[i] = 1;
            } else {
                A[i] = 0;
            }
        }
        int[] PS = new int[N];
        if (A[0] == 1) {
            PS[0] = 1;
        } else {
            PS[0] = 0;
        }
        for (int i = 1; i < N; i++) {
            if (A[i] == 1) {
                PS[i] = PS[i - 1] + A[i];
            } else {
                PS[i] = PS[i - 1];
            }
        }

        for (int i = 1; i <= Q; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            int range;
            if (start - 1 <= 0) {
                range = PS[end - 1];
            } else {
                range = PS[end - 1] - PS[start - 2];
            }
            System.out.println(range);
        }

    }


    public static void main(String[] args) {
        int[] A = {-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};
//        evenRange(A, 4);
        evenRangePrefix(A, 4);
    }
}
