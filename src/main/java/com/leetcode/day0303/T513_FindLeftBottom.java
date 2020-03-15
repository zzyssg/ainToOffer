package com.leetcode.day0303;

import com.buaa.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class T513_FindLeftBottom {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()) {
            root = que.poll();
            if (root.right != null) {
                que.add(root.right);
            }
            if (root.left != null) {
                que.add(root.left);
            }
        }
        return root.val;
    }
}
