package com.buaa.day0216;

import java.util.List;

public class T22_LastKthNode {
    public ListNode FindKthToTail(ListNode head,int k) {
        //双指针
        if (head == null) {
            return null;
        }
        int i = 0, j = i + k - 1;
        ListNode slow = head;
        ListNode fast = head;
        for (int m = 0;m < i + k - 1;m++) {
            fast = fast.next;
            if (fast == null) {
                return null;
            }
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
