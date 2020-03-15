package com.buaa.day0217;

import com.buaa.TreeNode;
import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class T32_2_MoreLine {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        if (pRoot == null) {
            return lists;
        }
        Queue<TreeNode> que = new LinkedList<>();
        int count = 0;
        que.add(pRoot);
        count += 1;
        while (!que.isEmpty()) {
            //每一层清零
            ArrayList<Integer> arrayList = new ArrayList<>();
            int size = que.size();
            while (size > 0) {
                TreeNode node = que.poll();
                if (node == null) {
                    continue;
                }
                arrayList.add(node.val);
                size--;
                if (node.left != null) {
                    que.offer(node.left);
                }
                if (node.right != null) {
                    que.offer(node.right);
                }

            }
            lists.add(arrayList);


        }
        return lists;

    }
}
