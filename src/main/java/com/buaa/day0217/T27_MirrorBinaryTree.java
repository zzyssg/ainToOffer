package com.buaa.day0217;

import com.buaa.TreeNode;

public class T27_MirrorBinaryTree {
    public void Mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;
        Mirror(root.left);
        Mirror(root.right);
    }

}
