package com.leetcode.day0303;

import com.buaa.TreeNode;

import java.util.Stack;

public class T230_KthMinOfBST {
    private int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode node = stack.pop();
            count++;
            if (count == k) {
                return node.val;
            }
            cur = node.right;
        }
        return -1;
    }

}
