package com.leetcode.day0303;

import com.buaa.TreeNode;

public class T101_SymetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSym(root.left, root.right);
    }

    private boolean isSym(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return isSym(left.right, right.left) && isSym(left.left, right.right);

    }
}
