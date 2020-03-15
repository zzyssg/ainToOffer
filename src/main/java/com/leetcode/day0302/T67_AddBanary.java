package com.leetcode.day0302;

public class T67_AddBanary {
    public String addBinary(String a, String b) {
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        int m = a.length() - 1, n = b.length() - 1;
        while (carry > 0 || m >= 0 || n >= 0) {
            if (m >= 0 && a.charAt(m--) == '1') {
                carry++;
            }
            if (n >= 0 && b.charAt(n--) == '1') {
                carry++;
            }
            sb.append(carry % 2);
            carry /= 2;
        }
        return sb.reverse().toString();
    }
}
