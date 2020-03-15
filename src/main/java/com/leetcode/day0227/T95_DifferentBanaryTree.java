package com.leetcode.day0227;

import com.buaa.TreeNode;
import com.sun.media.sound.RIFFInvalidDataException;

import java.util.LinkedList;
import java.util.List;

public class T95_DifferentBanaryTree {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new LinkedList<TreeNode>();
        }
        return getTrees(1, n);

    }

    private List<TreeNode> getTrees(int s, int e) {
        List<TreeNode> list = new LinkedList<>();
        if (s > e) {
            list.add(null);
            return list;
        }
        for (int i = s; i <= e; i++) {
            List<TreeNode> left = getTrees(s, i - 1);
            List<TreeNode> right = getTrees(i + 1, e);
            for (TreeNode nodeL : left) {
                for (TreeNode nodeR : right) {
                    TreeNode root = new TreeNode(i);
                    root.left = nodeL;
                    root.right = nodeR;
                    list.add(root);
                }
            }
        }
        return list;
    }

}
