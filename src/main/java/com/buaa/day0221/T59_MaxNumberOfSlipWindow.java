package com.buaa.day0221;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class T59_MaxNumberOfSlipWindow {
    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> list = new ArrayList<>();
        if (num == null || size == 0 || num.length < size) {
            return list;
        }
        Queue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int i = 0; i < size; i++) {
            queue.offer(num[i]);
        }
        list.add(queue.peek());
        for (int i = 0, j = size; j < num.length; i++, j++) {
            queue.remove(num[i]);
            queue.offer(j);
            list.add(queue.peek());

        }
        return list;
    }
}
