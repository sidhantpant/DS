package com.practice.datastructures.carryforward.classroom;

public class PairIndices {

    private static int pairIndices(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(j) == 'g') {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        return count;
    }

    private static int pairIndicesCarryFwd(String S) {
        int count = 0;
        int pair = 0 ;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'a') {
                count++;
            }
            if(S.charAt(i) == 'g'){
                pair = pair+count;
            }
        }
        System.out.println(pair);
        return pair;
    }

    public static void main(String[] args) {
        String s1 = "acbagkagg";
        pairIndices(s1);
        pairIndicesCarryFwd(s1);
    }
}
