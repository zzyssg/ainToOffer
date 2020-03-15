package com.leetcode.day0302;

public class T405_Base16 {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        char[] chars = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            sb.append(chars[num & 0xf]);
            num >>>= 4;
        }
        return sb.reverse().toString();
    }
}
