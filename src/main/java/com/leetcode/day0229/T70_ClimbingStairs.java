package com.leetcode.day0229;

public class T70_ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public int dp(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int pre = 1,cur = 2;
        for (int i = 3;i <= n;i++) {
            int temp = pre + cur;
            pre = cur;
            cur = temp;
        }
        return cur;
    }
}
