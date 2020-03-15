package com.leetcode.day0302;

import com.buaa.day0216.ListNode;

public class T24_SwapNeighbordNode {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node1 = head, node2 = head.next;
        ListNode node3 = swapPairs(node2.next);
        node1.next = node3;
        node2.next = node1;
        return node2;


    }
    public ListNode swapPairsII(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode pre = new ListNode(-1), res = pre;
        while (head != null && head.next != null) {
            ListNode first = pre;
            ListNode second = head;
            ListNode third = head.next;
            ListNode fourth = head.next.next;

            first.next = third;
            third.next = second;
            second.next = fourth;

            head = fourth;
            pre = second;

        }
        return res.next;
    }

}
