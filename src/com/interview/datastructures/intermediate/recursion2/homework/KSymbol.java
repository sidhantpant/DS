package com.interview.datastructures.intermediate.recursion2.homework;

public class KSymbol {

    public static void main(String[] args) {
        KSymbol ks = new KSymbol();
//        String s = ks.KSymbolBruteForce(2, 1);
//        System.out.println(ks.solve(2, 1));
        System.out.println(ks.KSymbol(2));
    }

    public String KSymbol(int A) {
        if (A == 0) return "0";

        String s = KSymbol(A - 1);
        String left = ks(s);

        String s2 = KSymbol(A - 1);
        String s3 = swap(s2);
        String right = ks(s3);
        return left + right;
    }

    String swap(String str) {
        int a = Integer.valueOf(str);

        return String.valueOf(a ^ 1);
    }

    public String ks(String s) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                sb.append("01");
            } else if (s.charAt(i) == '1') {
                sb.append("10");
            }
        }
        return sb.toString();
    }

    public String KSymbolBruteForce(int A, int B) {

        String s = "0";
        for (int i = 0; i < A; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '0') {
                    sb.append("01");
                } else if (s.charAt(j) == '1') {
                    sb.append("10");
                }
            }
            s = sb.toString();
        }
        return s.substring(B - 1, B);
    }

    public int solve(int A, int B) {
        String ks1 = kSymbol(A);
        String b = ks1.substring(B - 1, B);
        System.out.println(ks1.substring(B - 1, B));
        return Integer.parseInt(b);
    }

    public String kSymbol(int a) {

        if (a == 0) return "0";

        String s = kSymbol(a - 1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                sb = sb.append("01");
            } else {
                sb.append("10");
            }
        }
        return sb.toString();
    }

}
