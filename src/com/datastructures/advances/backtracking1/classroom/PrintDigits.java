package com.datastructures.advances.backtracking1.classroom;

public class PrintDigits {

    void printDigits(int[] arr, int N , int i){

        if(i == N){
            printArr(arr);
            return;
        }
        arr[i] = 1;
        printDigits(arr,N,i+1);

        arr[i] = 2;
        printDigits(arr,N,i+1);

    }

    void printNDigits(int[] arr, int N , int i){

        if(i == N){
            printArr(arr);
            return;
        }

        for(int j = 1 ;j <= N ; j++){
            arr[i] = j;
            printNDigits(arr, N , i+1);
        }

    }

    void printArr(int[] arr){
        for(int i=0 ; i < arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        PrintDigits printDigits = new PrintDigits();
        int[] arr = new int[5];
        int N = 5;
//        printDigits.printDigits(arr,N,0);
        printDigits.printNDigits(arr,N,0);
    }
}
