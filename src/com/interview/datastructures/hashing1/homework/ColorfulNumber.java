package com.interview.datastructures.hashing1.homework;

import java.util.HashSet;
import java.util.Set;

public class ColorfulNumber {

    public static void main(String[] args) {
        ColorfulNumber cn = new ColorfulNumber();
        System.out.println(cn.colorful(23));
    }

    public int colorful(int A) {

        int temp = A;
        int digitCount = 0;
        while (temp > 0) {
            temp = temp / 10; // 1 2 3 4 5 , 1234, 123,12,1 0
            digitCount++; // 5
        }

        int size = digitCount;
        int[] arr = new int[digitCount];

        temp = A;

        while (temp > 0) {
            digitCount = digitCount - 1;
            int d = temp % 10; // 5 4 3 2 1
            arr[digitCount] = d;// 4->5, 3->4 2-> 3 1->2 0->1
            temp = temp / 10; // 1234,123,12, 1 0
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            int prod = 1;
            for (int j = i; j < size; j++) {
                prod = prod * arr[j];
                System.out.println(prod);
                if (set.contains(prod)) {
                    return 0;
                } else {
                    set.add(prod);
                }
            }
        }
        return 1;
    }

}
