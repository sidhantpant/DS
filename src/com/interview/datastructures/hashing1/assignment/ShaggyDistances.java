package com.interview.datastructures.hashing1.assignment;

import com.interview.datastructures.String.assignment.PalindromicSubstring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ShaggyDistances {

    public int shaggyDistances(int[] A) {

        int N = A.length;
        int min_length = Integer.MAX_VALUE;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            if(map.containsKey(A[i])){
                map.put(A[i],i-map.get(A[i]));
                min_length = Math.min(min_length,i-map.get(i));
            }else{
                map.put(A[i] , i );
            }
        }
        if(min_length == Integer.MAX_VALUE){
            return -1;
        }
        return min_length;

    }

    public static void main(String[] args) {
        int[] A = {7, 7, 1, 4, 1, 7,3,1,5,7};
        ShaggyDistances sd = new ShaggyDistances();
        System.out.println(sd.shaggyDistances(A));
    }
}
