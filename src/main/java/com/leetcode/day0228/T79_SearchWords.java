package com.leetcode.day0228;

public class T79_SearchWords {
    private int m, n;
    private int[][] turns = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public boolean exist(char[][] board, String word) {
        if (word == null || word.length() == 0) {
            return true;
        }
        if (board == null || board.length == 0 || board[0].length == 0) {
            return false;
        }
        m = board.length;
        n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (backtracking(board, 0, word, visited, i, j)) {
                    return true;
                }

            }
        }
        return false;
    }

    private boolean backtracking(char[][] board,
                                 int len, String word, boolean[][] visited, int i, int j) {
        if (len == word.length()) {
            return true;
        }
        if (i < 0 || i >= m || j < 0 || j >= n || word.charAt(len) != board[i][j] || visited[i][j] == true) {
            return false;
        }
        visited[i][j] = true;
        for (int[] turn : turns) {
            if (backtracking(board, len + 1, word, visited, i + turn[0], j + turn[1])) {
                return true;
            }
        }
        visited[i][j] = false;
        return false;

    }
}
