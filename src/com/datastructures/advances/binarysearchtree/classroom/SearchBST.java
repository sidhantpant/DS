package com.datastructures.advances.binarysearchtree.classroom;

import com.datastructures.advances.treestraversal1.TreeNode;

public class SearchBST {

   static boolean search(TreeNode root, int K) {

        while (root != null) {
            if (root.data == K) {
                return true;
            }

            if (root.data < K) {
                root = root.rightTree;
            } else {
                root = root.leftTree;
            }
        }
        return false;
    }

    static void searchRecursively(TreeNode root,int K){

       if(root == null){
           return ;
       }

       if(root.data == K){
           System.out.println(true);
//           return true;
       }
       searchRecursively(root.leftTree,K);
       searchRecursively(root.rightTree,K);
//       return false;
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.addBinarySearchTree();
        System.out.println(search(treeNode,9));
        searchRecursively(treeNode,10);
    }
}
