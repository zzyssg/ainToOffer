package com.leetcode.day0227;

public class T278_FirstBadVersion {
    public int firstBadVersion(int n) {
        int l = 1,h = n;
        while (l < h) {
            int mid = (h - l) / 2 + l;
            if (isBadVersion(mid)) {
                h = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;

    }

    private boolean isBadVersion(int mid) {
        return false;
    }
}
