package com.leetcode.day0312;

import java.util.HashSet;
import java.util.Set;

public class T03 {
    public int lengthOfLongestSubstring(String str) {
        int max = 0;
        int i = 0, j = 0;
        Set<Character> set = new HashSet<>();
        while (i < str.length() && j < str.length()) {
            if (!set.contains(str.charAt(j))) {
                set.add(str.charAt(j++));
                max = Math.max(set.size(), max);
            } else {
                set.remove(str.charAt(i++));
            }
        }
        return max;
    }
}
