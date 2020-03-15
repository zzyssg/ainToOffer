package com.leetcode.day0312;

import com.buaa.day0216.ListNode;

public class T02 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode node = new ListNode(-1);
        ListNode head = node;
        while (carry != 0 || l1 != null || l2 != null) {
            int sum = 0;
            int num1 = 0,num2 = 0;
            if (l1 != null) {
                num1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                num2 = l2.val;
                l2 = l2.next;
            }
            carry = num1 + num2 + carry;
            ListNode tempNode = new ListNode(carry % 10);
            carry /= 10;
            node.next = tempNode;
            node = tempNode;

        }
        return head.next;
    }

}
