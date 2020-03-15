package com.leetcode.day0303;

import com.buaa.TreeNode;

public class T226_InvertBanaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode tempNode = root.left;
        root.left = root.right;
        root.right = tempNode;
        invertTree(root.right);
        invertTree(root.left);
        return root;
    }
}
