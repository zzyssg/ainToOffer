package com.leetcode.day0302;

import com.buaa.day0216.ListNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;


public class T160_IntersectionOfTwoLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        HashSet<ListNode> set = new HashSet<>();
        ListNode node1 = headA;
        ListNode node2 = headB;
        while (node1 != null) {
            set.add(node1);
            node1 = node1.next;
        }
        while (node2 != null) {
            if (set.contains(node2)) {
                return node2;
            }
        }
        return null;
    }
    public ListNode getIntersectionNodeII(ListNode headA, ListNode headB) {
        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != pB) {
            pA = (pA == null) ? headB : pA.next;
            pB = (pB == null) ? headA : pB.next;
        }
        return pA;

    }
}
