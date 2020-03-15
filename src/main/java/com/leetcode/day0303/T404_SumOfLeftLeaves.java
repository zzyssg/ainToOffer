package com.leetcode.day0303;

import com.buaa.TreeNode;

public class T404_SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (isLeftLeaf(root.left)) {
            return root.left.val + sumOfLeftLeaves(root.right);
        }
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);

    }

    private boolean isLeftLeaf(TreeNode left) {
        if (left == null) {
            return false;
        }
        if (left.left == null && left.right == null) {
            return true;
        }
        return false;
    }

}
