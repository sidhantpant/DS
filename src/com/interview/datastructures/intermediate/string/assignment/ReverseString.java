package com.interview.datastructures.intermediate.string.assignment;

public class ReverseString {

    public static void main(String[] args) {
        ReverseString r = new ReverseString();
        String s = "love  hate   kill";
        //here reversing in the same string no extra space
        // r.wordByWordReverse(s);
        System.out.println(r.wordByWordReverseExtraSpace(s));
    }

    //don't use this ,this is just using an extra space to reverse the string with " " or "_"
    public void wordByWordReverse(String s) {
        s = s.trim();
        int N = s.length();
        char[] ch = s.toCharArray();
        reverse(ch, 0, N - 1);
        int p1 = 0;
        int p2 = 0;

//        for (int i = 0; i < N; i++) {
//            if(ch[i] == ' '){
//                reverse(ch,p1,p2-1);
//                p1 = p2+1;
//            }
//            p2++;
//        }

        while (p2 < N) {
            if (ch[p2] == ' ') {
                reverse(ch, p1, p2 - 1);
                p1 = p2 + 1;
            }
            p2++;
        }
        reverse(ch, p1, N - 1);
        System.out.println(ch);
    }

    public String wordByWordReverseExtraSpace(String s) {

        char[] ch = s.toCharArray();
        int N = ch.length;
        StringBuilder ans = new StringBuilder();

        for (int i = N - 1; i >= 0; i--) {
            if (ch[i] != ' ') {
                String current = "";

                while (i >= 0 && ch[i] != ' ') {
                    current += s.charAt(i);
                    i--;
                }
                current = reverseString(current);

                if (ans.length() > 0) {
                    ans.append(" ");
                }
                ans.append(current);
            }
        }
        return ans.toString();
    }

    public String reverseString(String str) {//amit
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public void reverse(char[] ch, int s, int e) {

        while (s < e) {
            char temp = ch[s];
            ch[s] = ch[e];
            ch[e] = temp;
            s++;
            e--;
        }
    }
}
