package com.leetcode.day0303;

import java.util.Stack;

public class T20_ValidParentheses {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            if (c1 == '(' || c1 == '[' || c1 == '{') {
                stack.push(c1);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char c2 = stack.peek();
                if ((c2 == '(' && c1 == ')') || (c2 == '[' && c1 == ']') ||(c2 == '{' && c1 == '}')) {
                    stack.pop();
                } else {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}
