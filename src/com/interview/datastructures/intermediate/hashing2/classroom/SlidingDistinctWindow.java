package com.interview.datastructures.intermediate.hashing2.classroom;

import java.util.HashMap;
import java.util.Map;

public class SlidingDistinctWindow {


    public static void main(String[] args) {
        int[] A = {2, 4, 3, 8, 3, 9, 4, 9, 4, 10};
        SlidingDistinctWindow ss = new SlidingDistinctWindow();
        ss.slidingSum(A, 4);
    }

    public void slidingSum(int[] A, int K) {
        int N = A.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < K; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }
        System.out.println(map.size());
        int s = 1;
        int e = K;
        while (e < N) {
            // remove A[e] and add A[s]

            //reduce the frequecy to remove A[s-1] and if 0 completey remove
            //update the freq by subtracting 1
            map.put(A[s - 1], map.get(A[s - 1]) - 1);
            //completely rempve from the map if freq is 0
            if (map.get(A[s - 1]) == 0) {
                map.remove(A[s - 1]);
            }

            // add the A[e] to the hashmap if present in the sliding window
            if (map.containsKey(A[e])) {
                map.put(A[e], map.get(A[e]) + 1);
            } else {
                // add to map if not present in the window
                map.put(A[e], 1);
            }

            System.out.println(map.size());
            // A[s-1] + A[e];

            s++;
            e++;

        }
    }
}
