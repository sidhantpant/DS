package com.revision.datastructures.slidingwindow.homework;

public class SubarrayLeastAverage {

    public int solve(int[] A, int B) {
        // 20,3,1,9,1,11   => 3
        int N = A.length;
        //calculate for first subarray
        int first_index = 0;
        int sum = 0;
        for(int i = 0 ; i < B ; i++){
            sum = sum + A[i];  // 24
        }
        System.out.println("sum =>"+sum);
        //calculating min_avg for first_window
        float min_avg = (float)sum / B; // 8
        System.out.println("min_avg =>"+min_avg);
        int s = 1;//start from 1, since first started from next will start from 1
        int e = B;// end from B since [0,B-1]so next end will be B where B is length

        while(e < N){
            sum = sum - A[s-1] + A[e];
            System.out.println("sum in =>"+sum);
            float avg = (float) sum / B;
            System.out.println("avg in =>"+avg);
            if(avg < min_avg){
                min_avg = avg;
                first_index = s; // first_index will be start of each window
                System.out.println("avg"+avg);
                System.out.println("first_index"+first_index);
            }
            s++;
            e++;
            System.out.println("s->"+s +"e->"+e);
        }
        return first_index;
    }

    public static void main(String[] args) {
        int[] A = {20,3,13,5,10,14,8,5,11,9,1,11};
        SubarrayLeastAverage s = new SubarrayLeastAverage();
        s.solve(A, 9);
    }
}
