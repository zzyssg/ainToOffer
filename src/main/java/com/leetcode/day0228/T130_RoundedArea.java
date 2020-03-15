package com.leetcode.day0228;

public class T130_RoundedArea {
    private int[][] turns = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    int m;
    int n;
    public void solve(char[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return;
        }
        m = board.length;
        n = board[0].length;
        for (int j = 0; j < n; j++) {
                dfs(board,0,j);
                dfs(board, m - 1, j);
        }
        for (int i = 0; i < m; i++) {
                dfs(board, i, 0);
                dfs(board, i, n - 1);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'A') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void dfs(char[][] board, int i, int j) {
        if (i >= m || i < 0 || j >= n || j < 0 || board[i][j]!= 'O') {
            return;
        }
        board[i][j] = 'A';
        for (int[] turn : turns) {
            dfs(board, i + turn[0], j + turn[1]);
        }
    }
}
