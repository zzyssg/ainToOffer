package com.leetcode.day0303;

import com.buaa.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.*;

public class T145_BinaryTreePostorder {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node == null) {
                continue;
            }
            list.add(node.val);
            stack.add(node.left);
            stack.add(node.right);
        }
        Collections.reverse(list);
        return list;
    }
}
