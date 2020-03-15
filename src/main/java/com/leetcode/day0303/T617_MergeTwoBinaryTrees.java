package com.leetcode.day0303;

import com.buaa.TreeNode;
import sun.reflect.generics.tree.Tree;

public class T617_MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        TreeNode node = new TreeNode(t1.val + t2.val);
        node.left = mergeTrees(t1.left, t2.left);
        node.right = mergeTrees(t2.right, t1.right);
        return node;

    }
}
