package com.leetcode.day0224;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T524_LongestWordInDictionary {
    public String findLongestWord(String s, List<String> d) {
        int size = 0;
        String res = "";
        for (String str : d) {
            int l1 = res.length(), l2 = str.length();
            if (l1 > l2 || ((l1 == l2) && (res.compareTo(str) < 0))) {
                continue;
            }
            if (isContains(s,str)) {
                res = str;
            }
        }
        return res;
    }

    private boolean isContains(String s, String str) {
        int i = 0, j = 0;
        while (i <= s.length() - 1 &&  j <= str.length() - 1) {
            if (s.charAt(i) == str.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == str.length();
    }
}
