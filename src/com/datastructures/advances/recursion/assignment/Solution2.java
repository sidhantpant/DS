package com.datastructures.advances.recursion.assignment;

// Generate all Parentheses II
public class Solution2 {
    String[] P ;
    int i =0 ;
    public String[] generateParenthesis(int A) {
        int N = 2*A;
        P = new String[N];
        generateParenthesis1(N," ",0,0);
        return P;
    }

    void generateParenthesis1(int N, String str , int op, int cp){

        if(op == cp){
            P[i] = str;
            i++;
            return ;
        }
        if( op < N ){
            generateParenthesis1(N,str+"(",op+1,cp);
        }
        if( op > cp ){
            generateParenthesis1(N,str+")",op,cp+1);
        }
    }

    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        sol.generateParenthesis(2);
    }
}
