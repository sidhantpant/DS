package com.practice.datastructures.interviewproblem1.classroom;

public class SwapZero {

    private static int swapZero(int[] A) {
        // 1 1 0 1 1 1
        int N = A.length;

        int ans = 0;
        int totalOnes = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == 1) {
                totalOnes++;
            }
        }
        for (int i = 0; i < N; i++) {
            if (A[i] == 0) {
                int sumLeft = 0;
                int sumRight = 0;

                for (int j = i - 1; j >= 0; j--) {
                    if (A[j] == 0) {
                        break;
                    }
                    sumLeft++;
                }

                for (int j = i + 1; j < N; j++) {
                    if (A[j] == 0) {
                        break;
                    }
                    sumRight++;
                }
                int count = 0;
                if (sumLeft + sumRight == totalOnes) {
                    count = sumLeft + sumRight;
                } else if (sumLeft + sumRight < totalOnes) {
                    count = sumLeft + sumRight + 1;
                }

                ans = Math.max(ans, count);
            }
        }

        System.out.println(ans);
        return ans;
    }

    private static int solve(String A) {
        int N = A.length();
        int countOnes = 0;
        for (int i = 0; i < N; i++) {
            if (A.charAt(i) == '1') {
                countOnes++;
            }
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {


            if (A.charAt(i) == 0) {

                int sumLeft = 0;
                int sumRight = 0;

                for (int j = i - 1; j >= 0; j--) {
                    if (A.charAt(j) == '0') {
                        break;
                    }
                    sumLeft++;
                }

                for (int j = i + 1; j < N; j++) {
                    if (A.charAt(j) == '0') {
                        break;
                    }
                    sumRight++;
                }

                int count = 0;
                System.out.println("countOnes " + countOnes);
                if (countOnes == sumLeft + sumRight) {
                    count = sumLeft + sumRight;
                } else if (countOnes > sumLeft + sumRight) {
                    count = sumLeft + sumRight + 1;
                }

                if (count > ans) {
                    ans = count;
                }

            }else if(countOnes == N){
                return countOnes;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1, 1, 0, 1, 1, 0, 1, 1, 1};
        int[] A1 = {1, 1, 1, 0, 1, 1, 0, 0, 0};
//        swapZero(A1);
            solve("1111111111111");
    }


}
