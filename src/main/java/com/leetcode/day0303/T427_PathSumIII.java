package com.leetcode.day0303;

import com.buaa.TreeNode;

public class T427_PathSumIII {
//    private int count;
    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int res = 0;
        res += pathSumStartWith(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
        return res;

    }

    private int pathSumStartWith(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int res = 0;
        if (root.val == sum) {
            res++;
        }
        res += pathSumStartWith(root.right, sum - root.val) + pathSumStartWith(root.left, sum - root.val);
        return res;
    }
}
