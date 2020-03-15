package com.leetcode.day0301;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class T322_CoinChange {

    public int coinChange(int[] coins, int amount) {
        if (coins == null || coins.length == 0 || amount <= 0) {
            return -1;
        }
        Arrays.sort(coins);
        Queue<Integer> que = new LinkedList<>();
        int level = 0;
        que.add(amount);
        boolean[] visited = new boolean[amount + 1];
        visited[amount] = true;
        while (!que.isEmpty()) {
            int size = que.size();
            level++;
            while (size-- > 0) {
                int sum = que.poll();
                for (int coin : coins) {
                    int left = sum - coin;
                    if (left == 0) {
                        return level;
                    }
                    if (left < 0) {
                        break;
                    }
                    if (visited[left]) {
                        continue;
                    }
                    visited[left] = true;
                    que.add(left);
                }
            }
        }
        return -1;
    }
}
