package com.lld.concurrency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class MergeSortThread implements Callable<List<Integer>> {

    private List<Integer> arrayToSort;
    private ExecutorService ex;
    public MergeSortThread(List<Integer> leftSortedArray, ExecutorService ex) {
        this.arrayToSort = leftSortedArray;
        this.ex = ex;
    }

    public List<Integer> mergeSort(List<Integer> arrayToSort, ExecutorService ex) throws ExecutionException, InterruptedException {

        if(arrayToSort.size() <= 1){
            return arrayToSort;
        }

        int mid = arrayToSort.size() / 2;
        List<Integer> leftSortedArray = new ArrayList<>();
        List<Integer> rightSortedArray = new ArrayList<>();

        for(int i = 0; i < mid; i ++){
            leftSortedArray.add(arrayToSort.get(i));
        }
        for(int i = mid; i < arrayToSort.size(); i++){
            rightSortedArray.add(arrayToSort.get(i));
        }
        // 1 3245 5454 5454 45 4 55 4 5

        MergeSortThread leftArraySorter = new MergeSortThread(leftSortedArray, ex);
        MergeSortThread rightArraySorter =  new MergeSortThread(rightSortedArray, ex);

        Future<List<Integer>> leftSortedArrayFuture = ex.submit(leftArraySorter);
        Future<List<Integer>> rightSortedArrayFuture = ex.submit(rightArraySorter);

        List<Integer> sortedLeftArray = leftSortedArrayFuture.get();
        List<Integer> sortedRightArray = rightSortedArrayFuture.get();

        // Merge code

        int i= 0;
        int j = 0;

        List<Integer> sortedArray = new ArrayList<>();

        while (i < sortedLeftArray.size() && j < sortedRightArray.size()) {
            if (sortedLeftArray.get(i) <= sortedRightArray.get(j)) {
                sortedArray.add(sortedLeftArray.get(i));
                i += 1;
            } else {
                sortedArray.add(sortedRightArray.get(j));
                j += 1;
            }
        }

        while (i < sortedLeftArray.size()) {
            sortedArray.add(sortedLeftArray.get(i));
            i += 1;
        }

        while (j < sortedRightArray.size()) {
            sortedArray.add(sortedRightArray.get(j));
            j += 1;
        }

        return sortedArray;

    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<Integer> list = Arrays.asList(4,2,7,3,11,9,1,6);

        ExecutorService ex = Executors.newCachedThreadPool();
        MergeSortThread mt = new MergeSortThread(list,ex);
        Future<List<Integer>> sortedArrayFuture = ex.submit(mt);
        List<Integer> sortedArr = sortedArrayFuture.get();
        System.out.println(sortedArr);

    }

    @Override
    public List<Integer> call() throws Exception {
        return mergeSort(arrayToSort,ex);
    }
}
