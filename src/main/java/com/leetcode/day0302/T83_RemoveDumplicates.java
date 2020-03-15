package com.leetcode.day0302;

import com.buaa.day0216.ListNode;

public class T83_RemoveDumplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = head;
        while (node != null && node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }

        }
        return head;
    }
    public ListNode deleteDuplicatesII(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        head.next = deleteDuplicatesII(next);

        return head.val != next.val ? head : next;


    }
}
