package com.leetcode.day0304;

import java.util.HashMap;
import java.util.Map;

public class T409_LongestPalindrome {
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int[] frenquencies = new int[128];
        for (int i = 0; i < s.length(); i++) {
            frenquencies[s.charAt(i) - 'A']++;
        }
        int res = 0;
        for (int frequency : frenquencies) {
            res += frequency / 2 * 2;

        }
        return res < s.length() ? (res + 1) : res;
    }
}
