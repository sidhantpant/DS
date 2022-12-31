package com.practice.datastructures.carryforward.homework;

public class Solution3 {

    private static int amazingSubstring(String S) {
        int count = 0;

        int N = S.length();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'A' || S.charAt(i) == 'E' || S.charAt(i) == 'I' || S.charAt(i) == 'O' || S.charAt(i) == 'U' || S.charAt(i) == 'a' || S.charAt(i) == 'e' || S.charAt(i) == 'i' || S.charAt(i) == 'o' || S.charAt(i) == 'u') {
                count = (count + (N - i))%10003;
            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        String s = "MTyDHjYDPhJpunnBEkKsBecemgRUgFDMaZwesCcrUOzbknewbAmhpHnGZRenjBbDlYgcVuHVEGBvFVUklghesvqwVhqbQGGYKmJY";
        String s1 = "pGpEusuCSWEaPOJmamlFAnIBgAJGtcJaMPFTLfUfkQKXeymydQsdWCTyEFjFgbSmknAmKYFHopWceEyCSumTyAFwhrLqQXbWnXSn";
        amazingSubstring(s1);
    }

}
