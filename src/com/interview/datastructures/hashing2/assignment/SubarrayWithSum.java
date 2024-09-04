package com.interview.datastructures.hashing2.assignment;

import java.util.HashMap;
import java.util.Map;

public class SubarrayWithSum {

    public static void main(String[] args) {
        int[] A = {1};
        SubarrayWithSum ss = new SubarrayWithSum();
//        int[] ans = ss.subarraySumWithPS(A, 5);
        int[] ans1 = ss.subarraySumWithPSLinearly(A, 1);
        System.out.println(ans1);
    }

    public int[] subarraySum(int[] A, int B) {
        int N = A.length;
        int start = 0;
        int end = 0;
        boolean flag = false;
        for (int i = 0; i < N && !flag; i++) {
            int sum = 0;
            for (int j = i; j < N; j++) {
                sum = sum + A[j];
                if (sum == B) {
                    start = i;
                    end = j;
                    flag = true;
                    break;
                }
            }
        }
        int[] ans = new int[end - start + 1];
        if (start == 0 && end == 0) {
            return new int[]{-1};
        } else {
            int k = 0;
            while (start <= end) {
                ans[k++] = A[start];
                start++;
            }
        }
        return ans;
    }

    public int[] subarraySumWithPS(int[] A, int B) { // 12
        int N = A.length;
        int[] PS = new int[N + 1];
        PS[0] = 0;
        // 1 2 3 4 5
        // 0 1 3 6 10 15
        // s[s,e]=PS[e+1]-PS[s]; PS[5] - PS[2]
        for (int i = 1; i < N + 1; i++) {
            PS[i] = PS[i - 1] + A[i - 1];
        }
        int start = 0, end = -1;
        boolean flag = false;
        for (int i = 0; i < N && !flag; i++) {
            for (int j = i; j < N; j++) {
                int sum = PS[j + 1] - PS[i];
                if (sum == B) {
                    start = i;
                    end = j;
                    flag = true;
                    break;
                }
            }
        }

        int[] ans = new int[end - start + 1];
        if (end == -1) {
            return new int[]{-1};
        } else {
            int k = 0;
            while (start <= end) {
                ans[k++] = A[start++];
            }
        }
        return ans;
    }

    public int[] subarraySumWithPSLinearly(int[] A, int B) { // 12
        int N = A.length;
        long[] PS = new long[N + 1];
        PS[0] = 0;
        // 1 2 3 4 5
        // 0 1 3 6 10 15
        // s[s,e]=PS[e+1]-PS[s]; PS[5] - PS[2]
        for (int i = 1; i < N + 1; i++) {
            PS[i] = PS[i - 1] + A[i - 1];
        }
        int start = 0, end = -1;
        Map<Long, Integer> map = new HashMap<>();
        // need to optimise the PS method with find then pair which is having A[j] - A[i] = K
        for (int i = N; i >= 0; i--) {
            if (map.containsKey(B + PS[i])) {
                start = i;
                end = map.get(B + PS[i]) - 1;
                break;
            } else {
                map.put(PS[i], i);
            }
        }


        int[] ans = new int[end - start + 1];
        if (end == -1) {
            return new int[]{-1};
        } else {
            int k = 0;
            while (start <= end) {
                ans[k++] = A[start++];
            }
        }
        return ans;
    }
}
