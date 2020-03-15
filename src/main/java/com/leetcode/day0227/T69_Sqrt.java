package com.leetcode.day0227;

public class T69_Sqrt {
    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        int l = 1, h = x;
        while (l <= h) {
            int m = (h - l) / 2 + l;
            int sqrt = x / m;
            if (m < sqrt) {
                l = m + 1;
            } else if (m == sqrt) {
                return m;
            } else {
                h = m - 1;
            }
        }
        return h;
    }
}
