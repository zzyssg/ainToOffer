package com.leetcode.day0302;

public class T504_Case7 {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        boolean isPositive = false;
        if (num < 0) {
            isPositive = false;
            num = -num;
        }
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(num % 7);
            num /= 7;
        }
        if (!isPositive) {
            sb.append("-");
        }
        return sb.reverse().toString();
    }
}
