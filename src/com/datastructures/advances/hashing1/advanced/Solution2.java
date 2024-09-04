package com.datastructures.advances.hashing1.advanced;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution2 {
    public int colorful(int A) {

        List<Integer> list = new ArrayList<>();
        while(A > 0){
            int d = A%10;
            list.add(d);
            A = A/10;
        }
        int N = list.size();
        Set<Integer> hs = new HashSet<>();
        for(int i= 0 ;i < N ;i++){
            int prod = 1;
            for(int j = i ; j < N ;j++){
                prod = prod * list.get(j);
                System.out.println(prod);
                if(hs.contains(prod)){
                    return 0;
                }else{
                    hs.add(prod);
                }
            }
        }
        return 1 ;
    }

    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        sol.colorful(123);
    }
}

