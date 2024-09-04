package com.interview.datastructures.String.homework;

public class CountOccurences {

    public static void main(String[] args) {
        CountOccurences co = new CountOccurences();
        co.countOccurences("bobobtbobl");
    }

    public int countOccurences(String str) {
        //  b o b a b t b o b l
        char[] ch = str.toCharArray();
        int N = str.length();
        int start = 0;
        int end = 0;
        int count = 0;
        while (start <= N - 3) {
            if (ch[start] == 'b') {
                end = start + 2;
                if (isEquals(ch, start, end)) {
                    start = end;
                    count++;
                } else {
                    start++;
                }
            } else {
                start++;
            }
        }
        return count;
    }

    public boolean isEquals(char[] ch, int start, int end) {
        String b = "bob";
        int l = 0;
        for (int k = start; k <= end; k++) {
            if (!(b.charAt(l) == ch[k])) {
                return false;
            }
            l++;
        }
        return true;
    }
}
