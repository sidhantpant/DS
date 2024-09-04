package com.datastructures.advances.treestraversal1;

import java.util.Stack;

public class PreorderIteratively {

    void preorderTraversalIteratively(TreeNode root){

        TreeNode curr = root;
        Stack<TreeNode> stack = new Stack<>();

        while (stack.size()>0 || curr!=null) {
            while (curr != null) {
                stack.push(curr);
                System.out.print(curr.data+" ");
                curr = curr.leftTree;
            }
            curr = stack.peek();
            stack.pop();
            curr = curr.rightTree;
        }
    }

    public static void main(String[] args) {
       TreeNode treeNode = TreeNode.addElementToTree1();
        PreorderIteratively poi = new PreorderIteratively();
        poi.preorderTraversalIteratively(treeNode);
    }

}
