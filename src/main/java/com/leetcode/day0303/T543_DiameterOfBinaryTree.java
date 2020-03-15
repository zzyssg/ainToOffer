package com.leetcode.day0303;

import com.buaa.TreeNode;

public class T543_DiameterOfBinaryTree {
    private int max;
    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return max;

    }

    private int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        max = Math.max(max, l + r);
        return Math.max(l, r) + 1;
    }


}
