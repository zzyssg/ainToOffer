package com.buaa.day0211;

import java.util.ArrayList;


public class T06_PrintLinkesdList {

    ArrayList<Integer> arrayList = new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        //   1.Stack
        //        ArrayList<Integer> arrayList = new ArrayList<>();
        //        Stack<Integer> stack = new Stack<>();
        //        ListNode node = listNode;
        //        while (node != null) {
        //            stack.push(node.val);
        //            node = node.next;
        //        }
        //        while (!stack.isEmpty()) {
        //            arrayList.add(stack.pop());
        //        }
        //        return arrayList;
        //   2.Recusion
        ArrayList arrayList = new ArrayList();
        if (listNode == null) {
            return arrayList;
        }
        print(arrayList,listNode);
        return arrayList;

    }

    private void print(ArrayList arrayList, ListNode listNode) {
        if (listNode != null && listNode.next != null) {
            print(arrayList, listNode.next);
        }
        arrayList.add(listNode.val);
    }

    private class ListNode {
        ListNode next;
        Integer val;

        public ListNode(ListNode next, Integer val) {
            this.next = next;
            this.val = val;
        }
    }
}
