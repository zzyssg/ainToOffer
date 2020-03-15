package com.leetcode.day0304;

public class T647_PalindromeSubstrings {
    private int count;
    public int countSubstrings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            extendSubString(s,i, i);
            extendSubString(s, i, i + 1);
        }
        return count;
    }

    private void extendSubString(String s,int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
            count++;
        }
    }
}
