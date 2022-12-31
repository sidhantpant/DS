package com.datastructures.advances.primenumbers.assignment;

import java.util.ArrayList;
import java.util.List;

public class Solution4 {

    private static int solve(int A) {
        int N = A + 1;
        int[] spf = new int[N];
        // create the spf array
        for (int i = 0; i < N; i++) {
            spf[i] = i;
        }
        spf[0] = 0;
        spf[1] = 0;
        for (int i = 2; i * i < N; i++) {
            if (spf[i] == i) // check if its a prime number (if not striked)
                for (int j = i * i; j < N; j = j + i) {
                    spf[j] = Math.min(i, spf[j]);
                }
        }

        List<Integer> resp = new ArrayList<>();
        for (int i = 2; i <= A; i++) {
            List<Integer> l = new ArrayList<>();
            int num = i;
            while (num > 1) {
                int p = spf[num];
                l.add(p);
                num = num / p;
            }
            long count = l.stream().distinct().count();
            if (count == 2) {
                resp.add(num);
            }
        }
        return resp.size();
    }

    public static void main(String[] args) {
        System.out.println(solve(12));

    }
}
