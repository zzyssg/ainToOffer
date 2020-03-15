package com.leetcode.day0303;

import com.buaa.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class T637_AveragesOdLevels {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()) {
            int size = que.size();
            int count = size;
            double sum = 0;
            while (size-- > 0) {
                TreeNode node = que.poll();
                sum += node.val;
                if (node.left != null) {
                    que.add(node.left);
                }
                if (node.right != null) {
                    que.add(node.right);
                }
            }
            list.add(sum / count);
        }
        return list;
    }
}
