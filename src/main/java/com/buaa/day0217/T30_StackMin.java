package com.buaa.day0217;


import java.util.Stack;

public class T30_StackMin {
    Stack minStack = new Stack();
    Stack dataStack = new Stack();

    public void push(int node) {
        dataStack.push(node);
        if (minStack.isEmpty() || (int) minStack.peek() >= node) {
            minStack.push(node);
        }
    }

    public void pop() {
        if (dataStack.peek() == minStack.peek()) {
            minStack.pop();
        }
        dataStack.pop();
    }

    public int top() {
        return (int)dataStack.peek();
    }

    public int min() {
        return (int)minStack.peek();
    }
}
