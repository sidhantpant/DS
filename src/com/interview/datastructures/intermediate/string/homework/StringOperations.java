package com.interview.datastructures.intermediate.string.homework;

import java.util.Arrays;
import java.util.List;

public class StringOperations {

    public String stringOperations(String A) {
        char[] ch = A.toCharArray();
        int N = A.length();
        StringBuilder sb = new StringBuilder();
        List<Character> list = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        for (int i = 0; i < N; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                if (list.contains(ch[i])) {
                    sb.append("#");
                } else {
                    sb.append(ch[i]);
                }
            }
        }
        sb.append(sb);
        return sb.toString();
    }

    public static void main(String[] args) {
        StringOperations so = new StringOperations();
        System.out.println(so.stringOperations("aeiOUz"));
    }
}
