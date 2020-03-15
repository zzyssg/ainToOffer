package com.leetcode.day0225;

public class T392_IsSubSerial {
    public boolean isSubsequence(String s, String t) {
        char[] chars = s.toCharArray();
        int j = -1;
        for (char c :chars) {
            j = t.indexOf(c, j + 1);
            if (j == -1) {
                return false;
            }
        }
        return true;
    }
}
