package com.leetcode.day0228;

import com.buaa.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class T257_AllPathOfBanaryTree {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        List<Integer> values = new ArrayList<>();
        backtracking(list,values,root);
        return list;

    }

    private void backtracking(List<String> list, List<Integer> values,TreeNode root) {
        if (root == null) {
            return;
        }
        values.add(root.val);
        if (isLeafNode(root)) {
            list.add(buidPath(values));
        } else {
            backtracking(list, values, root.left);
            backtracking(list, values, root.right);
        }
        values.remove(values.size() - 1);

    }

    private String buidPath(List<Integer> values) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.size(); i++) {
            int num = values.get(i);
            sb.append(num);
            if (i != values.size() - 1) {
                sb.append("->");
            }
        }
        return sb.toString();
    }

    private boolean isLeafNode(TreeNode root) {
        if (root.left == null && root.right == null) {
            return true;
        }
        return false;
    }
}
