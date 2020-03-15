package com.leetcode.day0302;

import com.buaa.day0216.ListNode;

public class T206_ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        //迭if
        if (head == null) {
            return head;
        }
        ListNode newHead = new ListNode(0);
        ListNode oldHead = head;
        ListNode cpHead = null;
        while (oldHead != null) {
            cpHead = oldHead.next;
            oldHead.next = newHead.next;
            newHead.next = oldHead;
            oldHead= cpHead;
        }
        return newHead.next;
    }

    public ListNode reverseListII(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        ListNode newNode = reverseListII(next);
        next.next = head;
        head.next = null;

        return newNode;
    }
}
