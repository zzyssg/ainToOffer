package com.leetcode.day0302;

import com.buaa.TreeNode;

public class T110_BalancedBanaryTree {
    private boolean res = true;
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        maxDepth(root);
        return res;
    }

    private int  maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        if (Math.abs(l - r) > 1) {
            res = false;
        }
        return Math.max(l, r) + 1;
    }

}
