package com.leetcode.day0227;

public class T744_FindMinimumNumber {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0, h = letters.length;
        while (l < h) {
            int m = (h - l) / 2 + l;
            if (letters[m] > target) {
                h = m;
            } else {
                l = m + 1;
            }
        }
        return l == letters.length ? letters[0] : letters[l];

    }
}
