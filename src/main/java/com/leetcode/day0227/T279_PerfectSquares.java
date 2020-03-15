package com.leetcode.day0227;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class T279_PerfectSquares {
    public int numSquares(int n) {
        List<Integer> list = generateSquares(n);
        Queue<Integer> que = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];
        que.offer(n);
        visited[n] = true;
        int level = 0;
        while (!que.isEmpty()) {
            level++;
            int size = que.size();
            while (size-- > 0) {
                int cur = que.poll();

                for (int num : list) {
                    int next = cur - num;
                    if (next == 0) {
                        return level;
                    }
                    if (next < 0) {
                        break;
                    }
                    if (visited[next]) {
                        continue;
                    }
                    visited[next] = true;
                    que.add(next);
                }
            }

        }
        return level;

    }

    private List<Integer> generateSquares(int n) {
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            int product = i * i;
            if (product <= n) {
                list.add(product);
            } else {
                break;
            }
        }
        return list;
    }
}
