package com.lld.generics;

import com.lld.intrfaces.Animal;
import com.lld.intrfaces.Dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class CompareGeneric {


    public <T extends Comparable<T>> boolean compareAny(T[] arr1,T[] arr2){
        boolean ans = false;
        if(arr1.length!= arr2.length){
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if(!arr1[i].equals(arr2[i])){
                return false;
            }
        }
        return true;
    }
    public <T extends Comparable<T>> boolean compareNumbers(T[] arr1,T[] arr2){
        boolean ans = false;
        if(arr1.length!= arr2.length){
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i].compareTo(arr2[i])!=0){
                return false;
            }
        }
        return true;
    }

//    generic method that takes a list of numbers and returns the sum of all the even and odd numbers.
    public void calculateSum(List<? extends Number> list){
        Number evenSum = 0 ;
        Number oddSum = 0 ;
        for (int i = 0; i < list.size(); i++) {
            double num = list.get(i).doubleValue();
            if(num %2 == 0){
                evenSum = evenSum.doubleValue()+num;
            }else{
                oddSum = oddSum.doubleValue()+num;
            }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
    }

    public <T> List<T> reverse(List<T> list){
        Collections.reverse(list);
        return list;
    }

    public void print(List<?> list){
        System.out.println("Reverse List");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+"->");
        }
    }

    public <T> List<T> mergeList(List<T> list1 , List<T> list2){
        List<T> mergedList = new ArrayList<>();
        int max = list1.size()+list2.size();
        for(int i =0 ; i < max ; i++){
            if(i < list1.size()){
                mergedList.add(list1.get(i));
            }
            if( i < list2.size()){
                mergedList.add(list1.get(i));
            }
        }
        return mergedList;
    }

    public <T> List<T> filterList(List<T> originalList, Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();
        for(T t: originalList){
            if(predicate.test(t)){
                filteredList.add(t);
            }
        }
        return filteredList;
    }

    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4};
        Integer[] arr2 = {1, 2, 3, 4};
        String[] arr3 = {"Java","Generics"};
        String[] arr4 = {"Java","Genericd"};

        CompareGeneric gen = new CompareGeneric();
        System.out.println(gen.compareAny(arr1,arr2));
        System.out.println(gen.compareAny(arr3,arr4));

        //Sol2
        List <Integer> integers = Arrays.asList(1,2,3,4,5);
        List <Double> doubles = Arrays.asList(2.0, 1.5, 4.5, 2.5, 1.5);
        gen.calculateSum(integers);
        gen.calculateSum(doubles);

        //Sol3 Reverse
        List <Integer> l = Arrays.asList(1,2,3,4,5);
        List <Double> d = Arrays.asList(2.0, 1.5, 4.5, 2.5, 1.5);
        gen.reverse(l);
        gen.print(l);
        gen.reverse(d);
        gen.print(d);

        gen.filterList(l,(n)->n%2==0);

    }

}
