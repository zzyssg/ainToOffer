package com.leetcode.day0302;

public class T415_AddString {
    public String addStrings(String num1, String num2) {
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        int m = num1.length() - 1, n = num2.length() - 1;
        while (carry == 1 || m >= 0 || n >= 0) {
            int x = m < 0 ? 0 : num1.charAt(m--) - '0';
            int y = n < 0 ? 0 : num2.charAt(n--) - '0';
            sb.append((x + y + carry) % 10);
            carry = (x + y + carry) % 10;
        }
        return sb.reverse().toString();
    }
}
