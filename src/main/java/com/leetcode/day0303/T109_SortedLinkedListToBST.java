package com.leetcode.day0303;

import com.buaa.TreeNode;
import com.buaa.day0216.ListNode;

import java.util.List;

public class T109_SortedLinkedListToBST {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return new TreeNode(head.val);
        }
        ListNode preNode = getMidNode(head);
        ListNode midNode = preNode.next;
        preNode.next = null;

        TreeNode root = new TreeNode(midNode.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(midNode.next);
        return root;

    }

    private ListNode getMidNode(ListNode head) {
        ListNode slow = head, fast = head.next,pre = head;
        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return pre;
    }
}
