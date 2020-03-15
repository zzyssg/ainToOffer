package com.leetcode.day0302;

import com.buaa.day0216.ListNode;

public class T234_PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        cut(head, slow);
        return isPalindrome(head, reverse(slow));

    }

    private boolean isPalindrome(ListNode head, ListNode reverse) {
        while (head != null && reverse != null) {
            if (head.val != reverse.val) {
                return false;
            }
            head = head.next;
            reverse = reverse.next;
        }
        return true;
    }

    private ListNode reverse(ListNode slow) {
        ListNode head = new ListNode(-1);
        while (slow != null) {
            ListNode cpNode = slow.next;
            slow.next = head.next;
            head.next = slow;
            slow = cpNode;
        }
        return head.next;
    }

    private void cut(ListNode head, ListNode slow) {
        ListNode node = head;
        while (head.next != slow) {
            head = head.next;
        }
        head.next = null;
    }
}
