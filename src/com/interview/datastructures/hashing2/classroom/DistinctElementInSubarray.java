package com.interview.datastructures.hashing2.classroom;

import java.util.HashMap;
import java.util.Map;

public class DistinctElementInSubarray {

    public void distinctElememtInSubarray(int[] A, int K) {
        // If I do sliding window approach and add to hash set then the issue would be the all repeating element getting
        // removed from the window.
        int N = A.length;

        Map<Integer, Integer> map = new HashMap<>();
        // add all the elements to map in the first window
        for (int i = 0; i < K; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }
        //print the size for first window
        System.out.println(map.size());
        int s = 1;
        int e = K;

        while (e < N) {
            // remove the first element by reducing the value by 1 and if only one element was present remove
            //element from the map

            map.put(A[s], map.get(A[s]) - 1);
            if (map.get(A[s - 1]) == 0) {
                map.remove(A[s]);
            }

            // if the incoming element is present increment the count else remove it from the hash map
            if (map.containsKey(A[s])) {
                map.put(A[e], map.get(A[e]) + 1);
            } else {
                map.put(A[e], 1);
            }
            s = s + 1;
            e = e + 1;
            //print the size of every K window size
            System.out.println(map.size());
        }

    }
}
