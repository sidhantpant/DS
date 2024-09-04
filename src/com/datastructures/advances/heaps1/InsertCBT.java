package com.datastructures.advances.heaps1;


import java.util.LinkedList;
import java.util.Queue;

public class InsertCBT {

    TreeNode root;

    InsertCBT(TreeNode root) {
        this.root = root;
    }

    void insertInAlreadyCBT(int data) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int N = queue.size();
            for (int i = 1; i <= N; i++) {
                TreeNode temp = queue.peek();
                queue.remove();

                if (temp.leftTree != null) {
                    queue.add(temp.leftTree);
                } else {
                    temp.leftTree = new TreeNode(data);
                    return;
                }

                if (temp.rightTree != null) {
                    queue.add(temp.rightTree);
                } else {
                    temp.rightTree = new TreeNode(data);
                    return;
                }
            }
        }

    }

    void insertInBT(int val){

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode node = new TreeNode(val);
        queue.add(node);
        while(!queue.isEmpty()){
            TreeNode temp = new TreeNode(val);
            queue.add(node);

            TreeNode curr = queue.peek();
            if(curr.leftTree == null){
                curr.leftTree = temp;
            }
            if(curr.rightTree == null){
                curr.rightTree = temp;
            }
            queue.remove();
        }
    }

    public static void main(String[] args) {

    }

    // 1 2 3 4 5
    // 5+1=6,+4=10,+2=12,+3=15, = 15+12+1+16=44
    // 1+2=3,+3=6,+4=10,+5=15,  = 3+6+10+14=33


}
