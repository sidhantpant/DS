package com.datastructures.advances.treetraversal.assignment;

import apple.laf.JRSUIUtils;
import com.datastructures.advances.treetraversal2.classroom.TreeNode;

public class Solution3 {

    public int solve(TreeNode A, int B) {

        if (A == null) {
            return 0;
        }
        System.out.println(A.data);
        if (A.data == B) {
            return 1;
        }
        if (A.data > B) {
            return solve(A.leftTree, B);
        } else {
            return solve(A.rightTree, B);
        }
    }

    public TreeNode insertInBST(TreeNode A, int val) {
        TreeNode temp = A;
        if (A == null) {
            TreeNode newNode = new TreeNode(val);
            return newNode;
        }

        while (A != null) {
            if (A.data > val) {
                if (A.leftTree == null) {
                    A.leftTree = new TreeNode(val);
                    break;
                }
                A = A.leftTree;
            } else {
                if (A.rightTree == null) {
                    A.rightTree = new TreeNode(val);
                    break;
                }
                A = A.rightTree;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        TreeNode treeNode = new TreeNode(6);
        sol.insertInBST(treeNode,2);
        sol.insertInBST(treeNode,7);
        sol.insertInBST(treeNode,1);
        sol.insertInBST(treeNode,5);
        sol.solve(treeNode,5);
    }

}
