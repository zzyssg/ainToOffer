package com.leetcode.day0303;

import com.buaa.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class T111_MinAepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = minDepth(root.left);
        int r = minDepth(root.right);
        if (root.left == null || root.right == null) {
            return l + r + 1;
        }
        return Math.min(l, r) + 1;

    }


}
