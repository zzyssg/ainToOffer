package com.leetcode.day0302;

import com.buaa.day0216.ListNode;

import java.sql.Statement;
import java.util.Stack;

public class T445_AddTwoNums {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = buildStack(l1);
        Stack<Integer> stack2 = buildStack(l2);
        int carry = 0;
        ListNode head = new ListNode(-1);
        while (!stack1.isEmpty() || !stack2.isEmpty() || carry != 0) {
            int n1 = (stack1.isEmpty()) ? 0 : stack1.pop();
            int n2 = (stack2.isEmpty()) ? 0 : stack2.pop();
            int sum = n1 + n2 + carry;
            ListNode node = new ListNode(sum % 10);
            node.next = head.next;
            head.next = node;
            carry = sum / 10;
        }
        return head.next;
    }

    private Stack<Integer> buildStack(ListNode l1) {
        Stack<Integer> stack = new Stack<>();
        while (l1 != null) {
            stack.add(l1.val);
            l1 = l1.next;
        }
        return stack;
    }
}
