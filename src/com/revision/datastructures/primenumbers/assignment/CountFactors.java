package com.revision.datastructures.primenumbers.assignment;

import java.util.*;

public class CountFactors {

    public int[] solve(int[] A) {
        int N = A.length;
        int M = A[0];
        for (int i = 1; i < N; i++) {
            M = Math.max(M, A[i]);
        }

        int[] spf = new int[M + 1];
        spf[0] = spf[1] = 0;
        for (int i = 2; i < M + 1; i++) {
            spf[i] = i;
        }

        for (int i = 2; i * i < M + 1; i++) {
            if (spf[i] == i) { // if is prime
                for (int j = i * i; j < M + 1; j=j+i) {
                    spf[j] = i;
                }
            }
        }
        List<Integer> total = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int num = A[i];
            int divisors = 1;
            while (num > 1) {
                int count = 0;
                int val = spf[num];
                while (num % val == 0) {
                    count = count + 1;
                    num = num / val;
                }
                divisors *= (count + 1);
            }
            total.add(divisors);
        }

        int[] res = new int[total.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = total.get(i);
        }
        return res;

    }

    void countDivisors(int[] A){
        int N = A.length;

        int M = A[0];
        for (int i = 1; i < N; i++) {
            M = Math.max(M, A[i]);
        }

        int[] spf = new int[M+1];
        for (int i = 0; i < M + 1; i++) {
            Arrays.fill(spf,0);
        }

        for (int i = 2; i*i < M + 1; i++) {
            if(spf[i] ==i){
                for(int j = i*i ; j < N+1 ; j= j+i){
                    spf[j] = i;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            int num = A[i];

        }

    }

    void fillHashMap(int N ,int[] spf){
        Map<Integer,Integer> hm = new HashMap<>();
        while(N>1){
            int div = spf[N];
            if(hm.containsKey(div)){
                hm.put(div,hm.get(div)+1);
            }else{
                hm.put(div,1);
            }
            N = N / div;
        }
    }

    public static void main(String[] args) {

        int[] A= { 2,3,5,8, 9 };
        CountFactors cf = new CountFactors();
        cf.solve(A);
    }


}
