package com.datastructures.advances.modulararithmetic.assignment;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    // In this question we have to first do the mod of whole array then the array is in range [0,M-1] .Now add everything
    //to the hashmap and add index and frequency of each element . Now you need to add count 3 times one if it is 0 that mean
    //all elements sum up to form 0 (n*n(-1)/2). and multiply frequency of evey index which forms pair . 3rd count would be if it is
    //even or odd.If odd it will again do self pair (n*(n-1)/2).
    public int solve(int[] A, int B) {
        int N = A.length;
        int count = 0 ;
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i = 0 ; i < N; i++ ){
            int rem = A[i]%B;
            if(hm.containsKey(rem)){
                hm.put(rem , hm.get(rem)+1);
            }else{
                hm.put(rem,1);
            }

        }
        if(hm.containsKey(0)){
            int firstValue = hm.get(0);
            count = firstValue*(firstValue-1)/2; //nC2 .Since adding all elements at first index will make a pair with themselves
        }
        int l = 1;
        int r = B-1;// this will be the range since after mod number will be in range [0,M-1]
        while(l < r){
            if(hm.containsKey(l) && hm.containsKey(r)){
                int leftPair = hm.get(l);
                int rightPair = hm.get(r);
                count = count + (leftPair * rightPair);
            }
            l++;
            r--;
        }
        if(l == r){// if it's an odd element then it is l == 3
            if(hm.containsKey(l)){
                int mid = hm.get(l);
                count = count + (mid*(mid-1)/2);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] A = {5,17,100,11};
        Solution2 sol = new Solution2();
        sol.solve(A, 28);
    }
}
