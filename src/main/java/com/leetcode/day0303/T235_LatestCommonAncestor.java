package com.leetcode.day0303;

import com.buaa.TreeNode;

public class T235_LatestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode small = (p.val < q.val) ? p : q;
        TreeNode big = (q.val > p.val) ? q : p;
        return getLatestAncestor(root, small, big);

    }

    private TreeNode getLatestAncestor(TreeNode root, TreeNode small, TreeNode big) {
        if (root.val < small.val) {
            return getLatestAncestor(root.right, small, big);
        }
        if (root.val > big.val) {
            return getLatestAncestor(root.left, small, big);
        }
        return root;
    }
}
