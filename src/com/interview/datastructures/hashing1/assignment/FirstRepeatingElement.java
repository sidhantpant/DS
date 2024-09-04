package com.interview.datastructures.hashing1.assignment;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingElement {

    public int firstRepeatingElement(int[] A) {

        int N = A.length;
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < N; i++) {
            if(!set1.contains(A[i])){
                set1.add(A[i]);
            }else{
                set2.add(A[i]);
            }
        }

        for (int i = 0; i < N; i++) {
            if (set2.contains(A[i])) {
                return A[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        int[] A = {10, 5, 3, 4, 3, 5, 6};
        int[] A = {6, 10, 5, 4, 9, 120};
        FirstRepeatingElement fr = new FirstRepeatingElement();
        System.out.println(fr.firstRepeatingElement(A));

    }

}
