package com.buaa.day0218;

import com.buaa.TreeNode;

import java.util.ArrayList;

public class T34_SumPath {
    private ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null) {
            return lists;
        }
        ArrayList<Integer> list = new ArrayList<>();
        backtrcking(list, root, target);
        return lists;

    }

    private void backtrcking(ArrayList<Integer> path, TreeNode root, int target) {
        if (root == null) {
            return;
        }
        path.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null) {
            lists.add(new ArrayList<Integer>(path));
        } else {
            backtrcking(path, root.left, target);
            backtrcking(path, root.right, target);
        }
        path.remove(path.size() - 1);
    }
}
