package com.buaa.day0221;

import com.buaa.TreeNode;

public class T55_2_BalancedTree {
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) {
            return true;
        }
        int leftDepth = getDepth(root.left);
        int rightDepth = getDepth(root.right);
        if (Math.abs(leftDepth - rightDepth) <= 1) {
            return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
        }
        return false;

    }

    private int getDepth(TreeNode left) {
        if (left == null) {
            return 0;
        }
        return Math.max(getDepth(left.left), getDepth(left.right)) + 1;
    }
}
