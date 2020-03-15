package com.buaa.day0217;

import com.buaa.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class T32_3_ZhiPrint {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        if (pRoot == null) {
            return lists;
        }
        Queue<TreeNode> que = new LinkedList<>();
        que.add(pRoot);
        boolean isLeft = true;
        while (!que.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            Stack<Integer> stack = new Stack<>();
            int size = que.size();
            while (size-- > 0) {
                TreeNode node = que.poll();
                if (node == null) {
                    continue;
                }
                if (isLeft) {
                    list.add(node.val);
                } else {
                    stack.push(node.val);
                }
                que.add(node.left);
                que.add(node.right);
            }
            if (!isLeft) {
                while (!stack.isEmpty()) {
                    list.add(stack.pop());
                }
            }
            isLeft = !isLeft;
            if(!list.isEmpty()) lists.add(list);

        }
        return lists;
    }
}
