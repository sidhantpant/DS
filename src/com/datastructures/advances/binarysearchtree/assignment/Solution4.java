package com.datastructures.advances.binarysearchtree.assignment;


import com.datastructures.advances.treestraversal1.TreeNode;

public class Solution4 {

    public int solve(TreeNode A, int B) {

        if(A == null){
            return 0;
        }
        System.out.println(A.data);
        if(A.data == B){
            return 1;
        }
        if(A.data > B){
           return solve(A.leftTree,B);
        }else{
           return solve(A.rightTree,B);
        }
//        int x = solve(A.leftTree , B);
//        int y = solve(A.rightTree , B);
//        return Math.max(x,y);
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.addBinarySearchTree();
        Solution4 solution4 = new Solution4();
        System.out.println("Final"+solution4.solve(treeNode, 0));
    }
}
        // 4
//   0           // 10
// -1   3       7       15
//         6       9