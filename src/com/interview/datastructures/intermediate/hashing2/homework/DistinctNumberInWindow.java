package com.interview.datastructures.intermediate.hashing2.homework;

import java.util.HashMap;
import java.util.Map;

public class DistinctNumberInWindow {


    public static void main(String[] args) {
        int[] A = {1, 2, 1, 3, 4, 3};
        DistinctNumberInWindow ds = new DistinctNumberInWindow();
        ds.distinctNumbers(A,3);
    }

    public int[] distinctNumbers(int[] A, int B) {

        int N = A.length;
        int[] ans = new int[N - B + 1];
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < B; i++) {
            hm.put(A[i], hm.getOrDefault(A[i], 0) + 1);
        }

        ans[0] = hm.size();
        int s = 1;
        int e = B;
        while (e < N) {
            int elem = A[s - 1];
            hm.put(elem, hm.get(elem) - 1);

//            if (hm.get(elem) == 0) {
//                hm.remove(elem);
//            }

            // add the e elem to hm
            hm.put(A[e], hm.getOrDefault(A[e], 0) + 1);

            ans[s] = hm.size();
            s++;
            e++;
        }
        return ans;
    }

}
