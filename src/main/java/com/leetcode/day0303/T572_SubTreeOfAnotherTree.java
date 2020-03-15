package com.leetcode.day0303;

import com.buaa.TreeNode;

public class T572_SubTreeOfAnotherTree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) {
            return false;
        }
        return isSubtreeWithRoot(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);

    }

    private boolean isSubtreeWithRoot(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t ==null) {
            return false;
        }
        if (s.val !=  t.val) {
            return false;
        }
        return isSubtreeWithRoot(s.left, t.left) && isSubtreeWithRoot(s.right, t.right);
    }
}
