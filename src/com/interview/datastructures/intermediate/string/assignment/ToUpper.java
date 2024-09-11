package com.interview.datastructures.intermediate.string.assignment;

public class ToUpper {

    public String toUpper(String str){
        char[] ch = str.toCharArray();
        int N = ch.length;
        for (int i = 0; i < N; i++) {
            if(ch[i] >= 97 && ch[i] <= 122){
                ch[i] = (char)(ch[i] - 32);
            }
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        ToUpper toUpper = new ToUpper();
        System.out.println(toUpper.toUpper("amit.,."));
    }
}
