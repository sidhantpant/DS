package com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Student {


    public List<String> getUpperCase(List<String> input){

        return input.stream().map(i->i.toUpperCase()).collect(Collectors.toList());

    }


    public void printNumber(int num){
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"");
        map.put(2,"hundred");
        map.put(3,"thousand");
        map.put(3,"tenthousand");

        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1,"one");
        map1.put(2,"two");
        map1.put(3,"three");
        map1.put(4,"four");
        map1.put(5,"lakh");
        map1.put(6,"lakh");
        map1.put(7,"lakh");
        map1.put(8,"lakh");
        map1.put(9,"lakh");

        int i = 1;
       String ans = "";
       int count = 0 ;
        while( num > 0 ){  // 1234
            int d = num % 10 ; // 4
            num = num /10; // 123
            if(count == 1 ){

            }
            count++;


        }





    }

    public static void main(String[] args) {

    }
}
