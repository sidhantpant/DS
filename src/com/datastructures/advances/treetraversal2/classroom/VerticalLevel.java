package com.datastructures.advances.treetraversal2.classroom;

import java.util.*;

public class VerticalLevel {

    public int[][] verticalOrderTraversal(TreeNode A) {

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(A, 0));
        Map<Integer,List<Integer>> hm = new HashMap<>();
        List<List<Integer>> res=new ArrayList<>();
        int maxLevel=0,minLevel=0;
        while(queue.size()>0){
            Pair pair = queue.peek();
            queue.remove();
            TreeNode temp = pair.node;
            int l = pair.level;
            minLevel = Math.min(minLevel,l);
            maxLevel = Math.max(maxLevel,l);
            List<Integer> arr=new ArrayList<>();

            if(hm.containsKey(l)){
                arr = hm.get(l); // get the existing list
                arr.add(temp.data); // add it to the array to list of arrays
                hm.put(l,arr);
            }else{
                arr.add(temp.data);
                hm.put(l,arr);
            }

            if(temp.leftTree != null){
                queue.add(new Pair(temp.leftTree,l-1));
            }
            if(temp.rightTree != null){
                queue.add(new Pair(temp.rightTree,l+1));

            }
        }
        for(int i=minLevel;i<=maxLevel;i++){
            if(hm.containsKey(i)){
                res.add(hm.get(i));
            }
        }
        int[][] ans = res.stream()
                .map(l -> l.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);

        return ans;
    }
}
