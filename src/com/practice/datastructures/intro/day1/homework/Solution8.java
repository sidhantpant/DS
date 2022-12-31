package com.practice.datastructures.intro.day1.homework;

public class Solution8 {

    private static int[] solve(int A) {

        int[] total = new int[A];
        int count = 0 ;
        for(int i=0 ; i< A ;i++){
            int temp = i;
            int cube = 0;
            while(temp > 0){
                int rem  =  temp % 10;
                cube = cube + (rem * rem * rem);
                temp = temp/10;
            }
            if (cube == i){
                count++;
                total[i] = i;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int A = 153;
        solve(153);
    }


}
