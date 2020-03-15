package com.buaa.day0221;

import com.buaa.TreeNode;



public class T54_BanaryFindTreeKthNode {
    TreeNode res;
    private int count;
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if (k <= 0) {
            return res;
        }
        inorder(pRoot, k);
        return res;
    }

    private void inorder(TreeNode pRoot, int k) {
        if (pRoot == null) {
            return;
        }
        inorder(pRoot.left, k);
        count++;
        if (count == k) {
            res = pRoot;
            return;
        }
        inorder(pRoot.right, k);
    }
}
