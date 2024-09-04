package com.interview.datastructures.String.assignment;

public class PalindromicSubstring {

    public void isPalindromicSubstring(String s) {
        int N = s.length();
        char[] ch = s.toCharArray();
        int length = 0;
        int start = 0;
        int end = 0;
        int prevlength = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                boolean isValid = checkPalindrome(ch, i, j);
                length = j - i + 1;
                if (isValid && (length > prevlength)) {
                    prevlength = length;
                    start = i;
                    end = j;
                }
            }
        }
        System.out.println(start);
        System.out.println(end);
        char[] resp = new char[end - start + 1];
        for (int i = start; i <= end; i++) {
            resp[i-start] = ch[i];
        }
        System.out.println(String.valueOf(resp));
    }

    public boolean checkPalindrome(char[] ch, int i, int j) {

        while (i < j) {
            if (!(ch[i] == ch[j])) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abb";
        PalindromicSubstring pls = new PalindromicSubstring();
        pls.isPalindromicSubstring(str);
    }
}
