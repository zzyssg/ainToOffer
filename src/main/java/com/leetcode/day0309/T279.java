package com.leetcode.day0309;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class T279 {
    public int numSquares(int n) {
        List<Integer> squareList = getSquareArray(n);
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            for (int num : squareList) {
                if (num <= i) {
                    min = Math.min(dp[i - num] + 1, min);
                }
            }
            dp[i] = min;
        }
        return dp[n];
    }

    private ArrayList<Integer> getSquareArray(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int num = i * i;
            if (num <= n) {
                list.add(num);
            } else {
                break;
            }
        }
        return list;
    }
}
