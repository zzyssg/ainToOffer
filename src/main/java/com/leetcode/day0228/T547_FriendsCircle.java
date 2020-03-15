package com.leetcode.day0228;

public class T547_FriendsCircle {

    private int m;
    public int findCircleNum(int[][] M) {
        if (M == null || M.length == 0) {
            return 0;
        }
        m = M.length;
        boolean[] visited = new boolean[m];
        int count = 0;
        for (int i = 0; i < m; i++) {
            if (!visited[i]) {
                count++;
                dfs(M, i, visited);
            }
        }
        return count;
    }

    private void dfs(int[][] M, int i, boolean[] visited) {
        visited[i] = true;
        for (int j = 0; j < m; j++) {
            if (M[i][j] == 1 && !visited[j]) {
                dfs(M, j,visited);
            }
        }
    }
}
