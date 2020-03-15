package com.leetcode.day0228;

public class T200_NumberOfIsland {
    private int[][] turns = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
    int m;
    int n;
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        m = grid.length;
        n = grid[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int i, int j) {
        if (i >= m || i < 0 || j < 0 || j >= n || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        for (int[] turn : turns) {
            dfs(grid, i + turn[0], j + turn[1]);
        }
    }
}
