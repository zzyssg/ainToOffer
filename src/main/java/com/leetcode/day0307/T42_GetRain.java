package com.leetcode.day0307;

public class T42_GetRain {
    public int trap(int[] height) {
        if (height == null || height.length < 3) {
            return 0;
        }
        //双指针
        int l = 0, r = height.length - 1;
        int leftMax = height[0],rightMax = height[height.length - 1];
        int res = 0;
        while (l < r) {
            if (leftMax < rightMax) {
                if (leftMax < height[l]) {
                    leftMax = height[l];
                } else {
                    res += leftMax - height[l];
                    l++;
                }
            } else {
                if (rightMax < height[r]) {
                    rightMax = height[r];
                } else {
                    res += rightMax - height[r];
                    r--;
                }
            }
        }
        return res;
    }
}
