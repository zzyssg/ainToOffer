package com.leetcode.day0224;

public class T345_ReverseYuanYin {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        if (s == null || s.length() < 2) {
            return s;
        }
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if (isYuanYin(ci) && isYuanYin(cj)) {
                swap(chars, i++, j--);
            }
            if (!isYuanYin(ci)) {
                i++;
            }
            if (!isYuanYin(cj)) {
                j--;
            }
        }
        return new String(chars);
    }

    private boolean isYuanYin(char c) {
        if (c == 'a' || c == 'e' || c == 'i' ||
            c == 'o' || c == 'u' || c == 'A' ||
            c == 'E' || c == 'I' || c == 'O' ||
            c == 'U') {

            return true;
        }
        return false;
    }

    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
