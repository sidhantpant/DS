package com.datastructures.advances.treestraversal1;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderNewLine {

    void levelOrderNewLine(TreeNode root) {

        if(root == null){
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (q.size() > 0) {
            int N = q.size();
            for (int i = 1; i <= N; i++) { //or i=0 to i< N // it is helping us to print a level
                TreeNode temp = q.peek();
                q.remove();
                System.out.print(temp.data);
                System.out.print(" ");
                if (temp.leftTree != null) {
                    q.add(temp.leftTree);
                }
                if (temp.rightTree != null) {
                    q.add(temp.rightTree);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LevelOrderNewLine lOT = new LevelOrderNewLine();
        TreeNode treeNode = new TreeNode(5);
        treeNode.leftTree = new TreeNode(12);
        treeNode.leftTree.rightTree = new TreeNode(-9);
        treeNode.leftTree.rightTree.leftTree = new TreeNode(4);
        treeNode.rightTree = new TreeNode(6);
        treeNode.rightTree.leftTree = new TreeNode(-1);
        treeNode.rightTree.leftTree.leftTree = new TreeNode(15);
        treeNode.rightTree.rightTree = new TreeNode(10);
        treeNode.rightTree.rightTree.leftTree = new TreeNode(9);
        treeNode.rightTree.rightTree.leftTree.rightTree = new TreeNode(19);

        lOT.levelOrderNewLine(treeNode);
    }
}
