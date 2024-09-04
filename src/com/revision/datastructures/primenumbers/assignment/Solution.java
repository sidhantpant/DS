package com.revision.datastructures.primenumbers.assignment;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solve(int A) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1 ;i <= A ;i++){
            if(isPrime(i)){
                list.add(i);
            }
        }

        int[] arr = new int[list.size()];
        int N = arr.length;
        for(int i =0 ; i < N ;i++){
            arr[i] = list.get(i);
        }
        return arr;
    }

    boolean isPrime(int A){
        int countFactors = 0;
        for(int i = 1 ;i*i <= A ;i++){
            if(A % i == 0){
                if(i == A/i){
                    countFactors = countFactors+1;
                }else{
                    countFactors= countFactors+2;
                }       
            }   
        }
        if(countFactors == 2){
            return true;
        }
        return false;
    }

    int[] optimisedPrime(int A){
        int[] spf = new int[A+1];
        spf[0] = 0;
        spf[1] = 0;
        List<Integer> prime = new ArrayList<>();
        for (int i = 2; i <=A ; i++) {
            spf[i] = i;
        }

        for(int i = 2 ;i <= A ;i++){
            for(int j = 2*i ; j <= A ;j=j+i){
                if(spf[j] == j){
                    spf[j] = i;
                }
            }
        }
        for(int i = 2 ;i<=A ; i++){
            if(spf[i] == i ){
                prime.add(spf[i]);
            }
        }

        int[] arr = new int[prime.size()];
        int N = arr.length;
        for(int i =0 ; i < N ;i++){
            arr[i] = prime.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.optimisedPrime(49);
    }
}
