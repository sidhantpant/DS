package com.interview.datastructures.String.homework;

import java.util.Arrays;
import java.util.List;

public class AmazingSubarrays {

    public int amazingSubarrays(String A) {
        int N = A.length();
        if(A.isEmpty()){
            return 0;
        }
        List<Character> vowelList = Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
        long length = 0;
        for (int i = 0; i < N; i++) {
            if (vowelList.contains(A.charAt(i))) {
                length = length + (N-i);
            }
        }
        return (int)length%10003;
    }

    public static void main(String[] args) {
        String s = "ABEC";
        AmazingSubarrays as = new AmazingSubarrays();
        System.out.println(as.amazingSubarrays(s));
    }
}
