package com.leetcode.day0228;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.Queue;

public class T999_minimumPathFromZero {
    private int[][] turns = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
    public int minPath(int[][] grids, int tr, int tc) {
        Queue<int[]> que = new LinkedList<>();
        int m = grids.length;
        int n = grids[0].length;
        int level = 0;
        que.add(new int[]{0,0});
        grids[0][0] = 0;
        while (!que.isEmpty()) {
            int size = que.size();
            level++;
            while (size-- > 0) {
                int[] loc = que.poll();
                grids[loc[0]][loc[1]] = 0;
                for (int[] turn : turns) {
                    int r = turn[0] + loc[0];
                    int c = turn[1] + loc[1];
                    if (r == tr && c == tc) {
                        return level;
                    }
                    if (r < 0 || r >= m || c < 0 || c >= n || grids[r][c] == 0) {
                        continue;
                    }
                    que.add(new int[]{r, c});
                }
            }
        }
        return -1;
    }
}
