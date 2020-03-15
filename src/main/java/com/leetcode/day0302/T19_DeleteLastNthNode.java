package com.leetcode.day0302;

import com.buaa.day0216.ListNode;

public class T19_DeleteLastNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node1 = head;
        ListNode node2 = node1;
        for (int i = 0; i < n; i++) {
            if (node1 == null) {
                return head;
            }
            node2 = node2.next;
        }
        while (node2.next != null) {
            node1 = node1.next;
            node2 = node2.next;
        }
        node1.next = node1.next.next;
        return head;

    }
}
