package com.interview.datastructures.intermediate.trees.assignment;

public class TreeHeight {


    public int treeHeight(TreeNode A){
        if(A == null ){
            return 0;
        }
        int lh = treeHeight(A.left);
        int rh = treeHeight(A.right);

        return 1+ Math.max(lh,rh);

    }
}
