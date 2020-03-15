package com.leetcode.day0302;

import com.buaa.TreeNode;

public class T104_HeightOfTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;


    }
}
