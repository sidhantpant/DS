package com.datastructures.advances.treestraversal1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class PostOrderIteratively {

    void postorderTraversalIteratively(TreeNode root){

        TreeNode curr = root;
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        while (stack.size()>0 || curr!=null) {
            while (curr != null) {
                stack.push(curr);
                list.add(curr.data);
                System.out.print(curr.data+" ");
                curr = curr.rightTree;
            }
            curr = stack.peek();
            stack.pop();
            curr = curr.leftTree;
        }
        Collections.reverse(list);
        System.out.println(list);
    }

    public static void main(String[] args) {

       TreeNode root = TreeNode.addElementToTree();
        PostOrderIteratively poi = new PostOrderIteratively();
        poi.postorderTraversalIteratively(root);
    }

}
