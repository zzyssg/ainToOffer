package com.leetcode.day0229;

import java.util.*;

public class T279_PerfectSqures {
    public int numSquares(int n) {
        List<Integer> list = generateList(n);
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
        //dp[8] 表示 平方和为8的最小加数
            for (int num : list) {
                if (num > i) {
                    break;
                }
                dp[i] = Math.min(dp[i],dp[i - num] + 1);
            }

        }
        return dp[n];
    }


    private List<Integer> generateList(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i * i > n) {
                break;
            }
            list.add(i * i);
        }
        return list;
    }
}
