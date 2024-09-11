package com.interview.datastructures.intermediate.string.classromm;

public class SimpleReverse {

    public String solve(String s){

        int start = 0 ;
        int end = s.length()-1;
        char[] ch = s.toCharArray();

        while(start < end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        SimpleReverse sr = new SimpleReverse();
        System.out.println(sr.solve("sidhant"));
    }

}
