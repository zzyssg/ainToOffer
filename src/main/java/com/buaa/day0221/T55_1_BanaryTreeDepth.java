package com.buaa.day0221;

import com.buaa.TreeNode;
import sun.reflect.generics.tree.Tree;

public class T55_1_BanaryTreeDepth {
    public int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        return Math.max(left, right) + 1;

    }
}
