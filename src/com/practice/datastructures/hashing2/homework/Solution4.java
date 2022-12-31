package com.practice.datastructures.hashing2.homework;

import java.util.HashMap;
import java.util.Map;

public class Solution4 {


    private static int subarraySumPrefix(int[] A, int B) {

        int N = A.length;
        int[] PS = new int[N + 1];
        for (int i = 1; i < N + 1; i++) {
            PS[i] = PS[i - 1] + A[i - 1];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            map.put(PS[i],map.getOrDefault(PS[i],0)+1);
        }
        int count = 0;
        for (int i = 0; i < PS.length; i++) {
            int a = PS[i];
            int b = B-PS[i];
            if(a!=b){
                if(map.containsKey(b)){
                    count++;
                }
            }else{
                if(map.containsKey(b) && map.get(b)>1){
                 count = map.get(b);
                }
            }
        }


        return count;
    }
    private static int subarraySum(int[] A, int B) {
        int count = 0;
        int[]pf = new int[A.length+1];
        pf[0] =0;
        for(int i = 1 ; i < pf.length ; i++){
            pf[i] = pf[i-1] + A[i-1];
        }
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < pf.length; i++){
            if(map.containsKey(pf[i] - B)){
                count = count + map.get(pf[i]-B);
            }
            if(map.containsKey(pf[i])){
                map.put(pf[i] , map.get(pf[i]) + 1);
            }
            else{
                map.put(pf[i] , 1);
            }
        }
        return count;


    }

    public static void main(String[] args) {
        int[] A = {7,4,-1,8,11,-6,2,9};// 1,0,     //2
        System.out.println(subarraySum(A, 15));
        //System.out.println(subarraySumPrefix(A, 15));
        //  -10, -12, -17, -4, 1
        // 0 -10 -22 -39  -43 -42
        // 1 3 6 10 15 26 37 48  //9
    }
}
