package com.leetcode.day0302;

import com.buaa.day0216.ListNode;

public class T21_MergeTwoSortedLinkedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode p1 = l1, p2 = l2, head = new ListNode(-1), node = head;
        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                node.next = p1;
                p1 = p1.next;
            } else {
                node.next = p2;
                p2 = p2.next;
            }
            node = node.next;
        }
        if (p1 == null) {
            node.next = p2;
        } else {
            node.next = p1;
        }
        return head.next;
    }
    public ListNode mergeTwoListsII(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
