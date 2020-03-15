package com.buaa.day0216;

public class T24_TwistList {
    public ListNode ReverseList(ListNode head) {
        ListNode node = new ListNode(-1);
        while (head != null) {
            ListNode temp = head.next;
            head.next = node.next;
            node.next = head;
            head = temp;
        }
        return node.next;


    }

}
