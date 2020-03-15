package com.leetcode.day0301;

import java.util.Arrays;
import java.util.Comparator;

public class T646_MaxLengthOfPairChain {
    public int findLongestChain(int[][] pairs) {
        if (pairs == null || pairs.length == 0) {
            return 0;
        }
        Arrays.sort(pairs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int[] dp = new int[pairs.length];
        dp[0] = 1;
        //dp[i] 为 i处 的 最长子序列的个数
        for (int i = 1; i < pairs.length; i++) {
            int max = 1;
            for (int j = 0; j < i; j++) {
                if (pairs[i][0] > pairs[j][1]) {
                    max = Math.max(max,dp[j] + 1);
                }
            }
            dp[i] = max;
        }
        int res = 0;
        for (int num : dp) {
            res = Math.max(res, num);
        }
        return res;
    }
}
