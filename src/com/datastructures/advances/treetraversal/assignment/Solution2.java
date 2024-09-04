package com.datastructures.advances.treetraversal.assignment;

import apple.laf.JRSUIUtils;
import com.datastructures.advances.treetraversal2.classroom.TreeNode;

public class Solution2 {



    public TreeNode sortedArrayToBST(final int[] A) {
        int N = A.length;
        return bbst(A, 0, N - 1);
    }

    TreeNode bbst(int[] A, int s, int e) {

        if (s > e) {
            return null;
        }

        int mid = (s + e) / 2;
        TreeNode root = new TreeNode(A[mid]);
        root.leftTree = bbst(A, s, mid - 1);
        root.rightTree = bbst(A, mid + 1, e);
        return root;
    }

    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        int[] A = {1, 2, 3, 5, 10};
        TreeNode node = sol.sortedArrayToBST(A);
    }
}
