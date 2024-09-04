package com.datastructures.advances.timecomplexity;

public class TimeComplexity1 {



    public static void main(String[] args) {

        int j = 0;
        int n = 5;

        for(int i = 0 ; i < n ; i++){

            while(j <= i){

                System.out.println(i + j);

                j++;

            }

        }
    }
}
