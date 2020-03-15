package com.buaa.day0216;

import java.util.HashSet;

public class T23_LoopNode {


    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        //不能使用额外的空间
        ListNode head = pHead;
        HashSet<ListNode> map = new HashSet<>();
        while (head != null) {
            if (!map.contains(head)) {
                map.add(head);
                head = head.next;
            } else {
                break;
            }
        }
        return head;

    }
}
