package com.lld.generics;

public class NatNum {

    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem){
        int count = 0 ;
        elem = elem;
        for (T t : anArray){
            if(t.compareTo(elem) > 0){
                count ++;
            }
        }
        return count;

    }
}
