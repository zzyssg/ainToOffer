package com.buaa.day0211;

import java.util.HashMap;
import java.util.Map;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class T07_RebuildBinaryTree {
    private Map<Integer,Integer> map = new HashMap<>();
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {

        for(int i = 0;i < pre.length;i++){
            map.put(in[i],i);
        }
        return findRoot(pre,0,pre.length - 1,0);

    }
    private TreeNode findRoot(int[] pre,int i,int j,int inL){
        if (j < i)
            return null;
        TreeNode node = new TreeNode(pre[i]);
        int rootLoc = map.get(pre[i]);
        int num = rootLoc - inL;
        node.left = findRoot(pre,i + 1,i + num,inL);
        node.right = findRoot(pre,i + num + 1,j,rootLoc + 1);

        return node;
    }

    public static void main(String[] args) {
        T07_RebuildBinaryTree exa = new T07_RebuildBinaryTree();
        int[] pre = {3,9,20,15,7};
        int[] in = {9,3,15,20,7};
        TreeNode node = exa.reConstructBinaryTree(pre, in);
        while (node != null) {
            System.out.println(node.val);
            node = node.right;

        }
    }
}
