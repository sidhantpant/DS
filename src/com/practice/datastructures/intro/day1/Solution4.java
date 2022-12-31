package com.practice.datastructures.intro.day1;

public class Solution4 {

    public static int evenNumber(int A) {
        int sum=0;
        for(int i=1;i<=A;i++){
            if(i%2==0){
                sum = sum+i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(evenNumber(50));
    }

}
