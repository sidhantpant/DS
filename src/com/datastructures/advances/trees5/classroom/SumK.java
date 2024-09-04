package com.datastructures.advances.trees5.classroom;

import apple.laf.JRSUIUtils;

public class SumK {

    int sumOfK(TreeNode A,int B){

        if(A == null){
            return B;
        }

        int l = sumOfK(A.left,B-A.data);
        System.out.println("left"+l);
        int r = sumOfK(A.right,B-A.data);
        System.out.println("right"+r);
        System.out.println("l+r"+(l*r));
        return l*r;

    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(6);
        treeNode.right = new TreeNode(7);
        treeNode.right.right = new TreeNode(6);

        SumK sum = new SumK();
        int ans =sum.sumOfK(treeNode,13);
        System.out.println(ans);
    }
}
