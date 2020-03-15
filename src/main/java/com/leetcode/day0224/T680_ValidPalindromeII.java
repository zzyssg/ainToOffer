package com.leetcode.day0224;

public class T680_ValidPalindromeII {
    public boolean validPalindrome(String s) {
        if (s == null) {
            return false;
        }
        int i = 0, j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return isHuiWen(s,i, j - 1) || isHuiWen(s, i + 1, j);
            }
            i++;
            j--;

        }
        return true;


    }

    private boolean isHuiWen(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


}
