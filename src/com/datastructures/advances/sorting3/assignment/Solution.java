package com.datastructures.advances.sorting3.assignment;

import java.util.HashMap;
import java.util.Map;

public class Solution {

        public static int[] solve(int[] A) {
            Map<Integer,Integer> map = new HashMap<>();

            int N = A.length;
            int max = Integer.MIN_VALUE;
            for(int i=0 ;i<N ;i++){

                max = Math.max(max,A[i]);
                map.put(A[i],map.getOrDefault(A[i],0)+1);

            }

            int k = 0;
            for(int i=0 ; i < max ; i++){

                if(map.containsKey(i)){
                    int x = map.get(i);
                    for(int j = 0 ;j< x; j++){
                        A[k] = x;
                    }
                }
            }
            return A;
        }

    public static void main(String[] args) {

            int[] A = {1,1,2,3,4,5,4,3,6,7};
            solve(A);
    }

}
