package com.buaa.day0218;

import com.buaa.TreeNode;

public class T36_TwoBanaryFindAndDoubleDirList {
    private TreeNode tail = null;
    private TreeNode head = null;
    public TreeNode Convert(TreeNode root) {
        inorder(root);
        return head;

    }

    //将数据中序遍历，中间可以做些操作
    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        //将左边中序遍历完成,中间会对tail和head做一些操作
        inorder(root.left);
        root.left = tail;
        if (tail != null){
            tail.right = root;
        }
        tail = root;
        if (head == null) {
            head = root;
        }
        inorder(root.right);


    }
}
