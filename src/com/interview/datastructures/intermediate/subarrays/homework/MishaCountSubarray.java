package com.interview.datastructures.intermediate.subarrays.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MishaCountSubarray {

    public int countUniqueSubarrays(int[] A) {

        HashSet<Integer> hs = new HashSet<>();
        long ans = 0;
        int N = A.length, l = 0;
        for(int r = 0; r < N; r++) {
            // check if A[r] is already there in the present window
            while(hs.contains(A[r])) {
                hs.remove(A[l]);
                l++;
            }
            // add the subarrays ending at position r
            ans += r - l + 1;
            hs.add(A[r]);
        }
        return (int)(ans % (long)(1e9 + 7));
    }


    public static void main(String[] args) {
        int[] A =  {1,2,3,3,4};//1 2 3 3
        MishaCountSubarray mcs = new MishaCountSubarray();
        System.out.println(mcs.countUniqueSubarrays(A));
        // 1,2,3,3,4,{1,2}{1,2,3}{2,3}{3,4}
    }
}
