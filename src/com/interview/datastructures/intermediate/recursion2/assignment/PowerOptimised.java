package com.interview.datastructures.intermediate.recursion2.assignment;

public class PowerOptimised {


    public static void main(String[] args) {
        PowerOptimised pow = new PowerOptimised();
//        System.out.println(pow.powerIter(2, 5));
//        System.out.println(pow.powerRecur(2, 5));
//        System.out.println(pow.powerRecurOpt(2, 5));
//        System.out.println(pow.powerRecurOptFinal(-1, 2));
        int x= pow.powerRecurOptFinal(-1, 2);
        System.out.println(x);
        x = x% 20;
        System.out.println(x);

    }

    //This is the iterative code to calculate the power(2,5) = 32. TC = O(N)
    public int powerIter(int a, int n) {
        int ans = 1;
        for (int i = 0; i < n; i++) {
            ans = ans * a;
        }
        return ans;
    }

    // We need to create power function using recursion first . Once it is done we will try to optimise
    //it via recursion. Still the TC = O(N) even after using recursion
    // T(N) =T(N-1) + O(1)
    public int powerRecur(int a, int n) {
        if (n == 0 || a == 1) {
            return 1;
        }
        return powerRecur(a, n - 1) * a;
    }

    // We can optimise this recursive function by breaking it into two halves and just multiply the
    //recursively. If even break in two half ,if odd break into two with 1 extra a multiply.
    // TC = T(N/2) + T(N/2) + 1 => 2T(N/2)+1 => O(N)
    // Again the TC is O(N) even after the optimisation because we are calulating two halves twice in recur
    public int powerRecurOpt(int a, int n) {
        if (n == 0 || a == 1) {
            return 1;
        }

        if (n % 2 == 0) {
            return powerRecur(a, n / 2) * powerRecur(a, n / 2);
        } else {
            return powerRecur(a, n / 2) * powerRecur(a, n / 2) * a;
        }

    }

    public int powerRecurOptFinal(int a, int n) {
        if(a < 0){
            a= a+20;
        }
        if (n == 0) {
            return 1;
        }
        int temp = powerRecur(a, n / 2);
        if (n % 2 == 0) {
            return temp * temp;
        } else {
            return temp * temp * a;
        }
    }


}
