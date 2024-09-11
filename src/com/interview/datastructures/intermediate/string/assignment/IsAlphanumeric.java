package com.interview.datastructures.intermediate.string.assignment;

public class IsAlphanumeric {

    public static void main(String[] args) {
        IsAlphanumeric is = new IsAlphanumeric();
        char[] ch = {'S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0'};
        System.out.println(is.isAlphanumeric(ch));
    }

    public int solve(char[] A) {
        int N = A.length;
        for(int i= 0 ;i< N ;i++){
            if(!(toUpper(A[i]) || toLower(A[i]) || isDigit(A[i]) )){
                return 0;
            }
        }
        return 1;
    }

    private boolean toUpper(char c) {
        return c >= 65 && c <= 90;
    }

    private boolean toLower(char c) {
        return c >= 97 && c <= 122;
    }

    private boolean isDigit(char c) {
        return c >= '0' && c <= '9';//either put ASCII value of 0  or 9
    }

    public boolean isAlphanumeric(char[] ch) {

        int N = ch.length;

        for (int i = 0; i < N; i++) {
            if (!((toUpper(ch[i])) || toLower(ch[i]) || isDigit(ch[i]))) {
                return false;
            }
        }
        return true;
    }

}
