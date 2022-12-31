package com.datastructures.advances.primenumbers.assignment;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    private static int[] solve(int[] A) {

        int N = A.length;
        int[] spf = new int[N];
        for (int i = 0; i < N; i++) {
            int x = 2;
            while (A[i] % x == 0) {
                x = x + 1;
            }
            spf[i] = x;
        }

        List<Integer> divisors = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int totalCount = 1;
            int P = spf[i];
            int X = A[i];
            while (X > 1) {
                int count = 0;
                while (X % P == 0) {
                    count++;
                    X = X / P;
                }
                totalCount = totalCount * (count + 1);
            }
            divisors.add(totalCount);
        }
        int[] res = new int[divisors.size()];
        for (int i = 0; i < N; i++) {
            res[i] = divisors.get(i);
        }
        return res;
    }

    private static int[] countFactor2(int[] A) {
        int N = A.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            max = Math.max(A[i], max);
        }
        int M = max + 1;
        int[] spf = new int[M];
        spf[0] = 0;
        spf[1] = 1;
        for (int i = 2; i < M; i++) {
            spf[i] = i;
        }
        for (int i = 2; i * i < M; i++) {
            if (spf[i] == i) {
                for (int j = i * i; j < M; j = j + i) {
                    if (spf[j] == j) {
                        spf[j] = i;
                    }
                }
            }
        }
        List<Integer> divisors = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int total = 1;
            int num = A[i];
            while (num > 1) {
                int count = 0;
                int P = spf[num];
                while (num % P == 0) {
                    count = count + 1;
                    num = num / P;
                }
                total = total * (count + 1);
            }
            divisors.add(total);
        }
        int[] res = new int[divisors.size()];
        for (int i = 0; i < N; i++) {
            res[i] = divisors.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] A = {10, 20};
//        solve(A);
        countFactor2(A);
    }
}