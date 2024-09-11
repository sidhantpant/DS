package com.interview.datastructures.intermediate.arrays1.assignment;

public class CountOfElements {

    //count all the elements which are greater than that element.Iterate over the array and in nested
    //loop check if any element is greater than this element ,increment the count for the number and break
    //immediately else just increase the count
    public int countBruteForce(int[] A){
        int N = A.length;
        int count = 0;
        for(int i = 0 ; i < N ; i++){
            for (int j = 0; j < N; j++) {
                if(A[j] > A[i]){
                    count++;
                    break;
                }
            }

        }
        return count;
    }

    //In this approach iterate overt the array and get the max elem in the array
    //Find the count of the max element in the array
    //Count should be N-countofMaxElement.this will give the element which is less than CMAX as ans
    public int countBruteForceNComplexity(int[] A){
        int N = A.length;
        int count = 0 ;
        int CMAX = Integer.MIN_VALUE;
        for (int i = 0 ; i < N ; i++){
            CMAX = Math.max(A[i],CMAX);
        }

        for(int i = 0 ; i < N ; i++){
            if(CMAX == A[i]){
                count++;
            }
        }

        return N-count;
    }

    // In this approach merge both step 1 and step 2 .This is little tricky need to find the count
    //of max element in single loop .To do this just check the count of max element or reset if any
    //next element is greater than next element also compare this with the max element in same loop
    public  int countOptimisedNComplexity(int[] A){
        int N = A.length;
        int CMAX = Integer.MIN_VALUE;
        int count = 0 ;
        for (int i = 0; i < N; i++) {
            if(A[i] == CMAX){
                count++;
            }
            if(A[i] > CMAX){
                count = 1;
                CMAX = A[i];
            }
        }
        return N - count;
    }

    public static void main(String[] args) {
        int[] A = {2,5,8,1,8,6};
        CountOfElements count = new CountOfElements();
        System.out.println(count.countOptimisedNComplexity(A));
    }



}
