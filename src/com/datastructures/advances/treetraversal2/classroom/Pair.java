package com.datastructures.advances.treetraversal2.classroom;

import java.util.Objects;

public class Pair {

    TreeNode node;
    int level;

    Pair(TreeNode node,int level){
        this.node = node;
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return level == pair.level && Objects.equals(node, pair.node);
    }

    @Override
    public int hashCode() {
        return Objects.hash(node, level);
    }
}
