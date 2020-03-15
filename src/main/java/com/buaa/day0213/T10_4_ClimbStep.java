package com.buaa.day0213;

import java.lang.reflect.Array;
import java.util.Arrays;

public class T10_4_ClimbStep {
    public int JumpFloorII(int target) {
        if (target <= 2) {
            return target;
        }
        int[] dp = new int[target + 1];
        dp[0] = 1; // 从0到0算1步 ---> 意义是 从0直接到n是一步完成，包括0到0
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= target; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] = dp[i] + dp[j];
            }
        }
        return dp[target];

    }
}
