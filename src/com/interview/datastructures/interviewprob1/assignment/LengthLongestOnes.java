package com.interview.datastructures.interviewprob1.assignment;

public class LengthLongestOnes {

    public int lengthLongestConsecutiveOnes(String A){
        char[] c = A.toCharArray();
        int N = A.length();

        int countOne = 0;

        int maxCount = 0 ;

        for(int i = 0 ; i < N ; i++){
            if(c[i] == '1'){
                countOne++;
            }
        }

        //edge case
        if(countOne == N){
            return N;
        }

        for (int i = 0; i < N; i++) {
            int countLeft = 0;
            int countRight = 0;
            for (int j = i+1; j < N; j++) {
                if(c[j] == '1'){
                    countRight++;
                }else{
                    break;
                }
            }

            for (int j = i-1; j >= 0 ; j--) {
                if(c[j] == '1'){
                    countLeft++;
                }else{
                    break;
                }
            }
            maxCount = Math.max(maxCount,countLeft+countRight+1);
        }
        if(countOne > maxCount){
            return maxCount;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        LengthLongestOnes length =new LengthLongestOnes();
        System.out.println(length.lengthLongestConsecutiveOnes("110110111"));
    }

}
