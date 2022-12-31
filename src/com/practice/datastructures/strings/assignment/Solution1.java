package com.practice.datastructures.strings.assignment;

public class Solution1 {

    public static String solve(String A) {
        String B = A.trim();
        int N = A.length();
        char[] C = reverseCharArray(A.toCharArray(),0,N-1);
        int p1 = 0;
        int p2 = 0;
        for (int i = 0; i < C.length; i++) {
            if(C[p2] == ' '){
                reverseCharArray(C,p1,p2-1);
                p1 = p2+1;
            }
            p2++;
        }
        reverseCharArray(C,p1,p2-1);
        return String.valueOf(C);
    }

    private static char[] reverseCharArray(char[] C,int start,int end) {
        while(start < end){
            char temp = C[start];
            C[start] = C[end];
            C[end] = temp;
            start++;
            end--;
        }
        return C;
    }

    public static void main(String[] args) {
        String S = "the sky is blue ";
        System.out.println(solve(S));
        // hv xdq op qoddptokkz vemmoxrgf ombt gg crulgzfkif
    }
}
