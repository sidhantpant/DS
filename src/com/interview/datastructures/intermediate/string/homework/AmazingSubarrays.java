package com.interview.datastructures.intermediate.string.homework;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AmazingSubarrays {

    public static void main(String[] args) {
        String s = "ABEC";
        AmazingSubarrays as = new AmazingSubarrays();
        System.out.println(as.amazingSubarrays(s));
    }

    public int amazingSubarrays(String A) {
        int N = A.length();
        if (A.isEmpty()) {
            return 0;
        }
        //use set since contains is O(1) complexity
        Set<Character> vowelList = Stream.of
                ('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u').collect(Collectors.toSet());
        long length = 0;
        for (int i = 0; i < N; i++) {
            if (vowelList.contains(A.charAt(i))) {
                length = length + (N - i);
            }
        }
        return (int) length % 10003;
    }
}
