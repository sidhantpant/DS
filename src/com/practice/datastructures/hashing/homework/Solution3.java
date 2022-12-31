package com.practice.datastructures.hashing.homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution3 {

    public static int colorful(int A) {
        List<Integer> list = new ArrayList<>();
        while (A != 0) {
            int rem = A % 10;
            A = A / 10;
            list.add(rem);
        }
        int N = list.size();
        int subsetSize = (N*(N+1))/2;
        Set<Integer> product = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            product.add(list.get(i));
            for (int j = i + 1; j < list.size(); j++) {
                int prod = list.get(i) * list.get(j);
                product.add(prod);
            }
        }
        if(product.size()!=subsetSize){
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(colorful(263));
    }
}
