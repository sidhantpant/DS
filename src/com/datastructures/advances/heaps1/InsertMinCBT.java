package com.datastructures.advances.heaps1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InsertMinCBT {


    void insertMinHeapInCBT(List<Integer> arr, int data){

        arr.add(data);
        int index = arr.size()-1;
        int parent = (index-1)/2;

        while (index!=0 && arr.get(index) < arr.get(parent)){
            swap(arr,index,parent);
            index = parent;
            parent = (index-1)/2;
        }

    }

    void swap(List<Integer> arr,int index,int pair){
        Collections.swap(arr,index,pair);
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(3);arr.add(6);arr.add(7);arr.add(5);arr.add(11);
        arr.add(15);arr.add(20);arr.add(10);arr.add(14);

        InsertMinCBT insertMinCBT = new InsertMinCBT();
        insertMinCBT.insertMinHeapInCBT(arr,5);
        System.out.println(arr);
    }
}
