package com.leetcode.day0303;


import com.buaa.TreeNode;

public class T108_buildBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(nums, 0, nums.length - 1);

    }

    private TreeNode buildBST(int[] nums, int sta, int end) {
        if (sta > end) {
            return null;
        }
        int mid = (end - sta) / 2 + sta;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = buildBST(nums, sta, mid - 1);
        node.right = buildBST(nums, mid + 1, end);
        return node;
    }

}
