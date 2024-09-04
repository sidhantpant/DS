package com.datastructures.advances.stack1.classroom;

import java.util.Stack;

public class MergeSort {


    Stack<Integer> mergeSort(Stack<Integer> s1){

        int N = s1.size()/2;
        Stack<Integer> s2 = new Stack<>();

        if(N <= 1){
            return s1;
        }
        int elem = s1.peek();
        s1.pop();
        s2.push(elem);
        s1 = mergeSort(s1);
        s2 = mergeSort(s1);
        return merge(s1,s2);
    }

    Stack<Integer> merge(Stack<Integer> s1, Stack<Integer> s2){
        int N = s1.size();
        int M = s2.size();
        int p1 = 0 ;
        int p2 = 0;
        Stack<Integer> s3 = new Stack<>();
        while (s1.size() > 0  && s2.size() > 0){

            if(s1.peek() < s2.peek()){
                int elem = s1.peek();
                s1.pop();
                s3.push(elem);
            }else {
                int elem = s2.peek();
                s2.pop();
                s3.push(elem);
            }
        }

        while(s1.size()>0){
            int elem = s1.peek();
            s1.pop();
            s3.push(elem);
        }

        while (s2.size()>0){
            int elem = s2.peek();
            s2.pop();
            s3.push(elem);
        }

        Stack<Integer> s4 = new Stack<>();
        while(s3.size() > 0){
            int elem = s4.peek();
            s3.pop();
            s4.push(elem);
        }
        return s4;

    }

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(2);
        s1.push(-1);
        s1.push(6);
        s1.push(7);
        s1.push(5);
        s1.push(8);
        s1.push(2);
        s1.push(5);


    }


}
