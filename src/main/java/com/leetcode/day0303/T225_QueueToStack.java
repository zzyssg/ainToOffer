package com.leetcode.day0303;

import java.util.LinkedList;
import java.util.Queue;

public class T225_QueueToStack {

    /**
     * Push element x onto stack.
     */
    Queue<Integer> que1 = new LinkedList<>();
    Queue<Integer> que2 = new LinkedList<>();
    public void push(int x) {
        if (!que1.isEmpty()) {
            while (!que1.isEmpty()) {
                que2.add(que1.poll());
            }
        }
        que1.add(x);
        while (!que2.isEmpty()) {
            que1.add(que2.poll());
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return que1.poll();
    }

    /** Get the top element. */
    public int top() {
        return que1.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return que1.isEmpty() && que2.isEmpty();
    }
}
