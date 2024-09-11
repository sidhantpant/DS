package com.interview.datastructures.intermediate.recursion1.assignment;

public class PrintReverseString {

    public static void main(String[] args) {
        PrintReverseString pr = new PrintReverseString();
        System.out.println(pr.printReverse("Amit"));
    }

    public String printReverse(String str) {

        //Assumption -> If i pass a String with substring my function will retrun reverse
        if (str.isEmpty()) {
            return str;
        }

        //break into small problem
        return printReverse(str.substring(1)) + str.charAt(0);

    }
}
