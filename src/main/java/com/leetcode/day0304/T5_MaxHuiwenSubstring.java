package com.leetcode.day0304;

public class T5_MaxHuiwenSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        String manacherString = manacher(s);
        char[] charArr = manacherString.toCharArray();
        int[] parray = new int[charArr.length];
        int index = -1;
        int pr = -1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < parray.length; i++) {
            parray[i] = i < pr ? Math.min(parray[2 * index - i], pr - i) : 1;
            while (i + parray[i] < charArr.length && i - parray[i] > -1) {
                if (charArr[i + parray[i]] == charArr[i - parray[i]]) {
                    parray[i]++;
                } else {
                    break;
                }
            }
            if (i + parray[i] > pr) {
                pr = i + parray[i];
                index = i;
            }
            max = Math.max(max, parray[i]);
        }
        int resIndex = 0;
        for (int i = 0; i < parray.length; i++) {
            if (parray[i] == max) {
                resIndex = i;
            }
        }
        max = max - 1;
        return s.substring((resIndex - max + 1) / 2, (resIndex - max + 1) / 2+ max);
    }

    private String manacher(String s) {
        String str = "#";
        for (int i = 0; i < s.length(); i++) {
            str += s.charAt(i) + "#";
        }
        return str;
    }
}
