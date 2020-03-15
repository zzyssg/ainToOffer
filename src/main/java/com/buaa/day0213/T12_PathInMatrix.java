package com.buaa.day0213;

public class T12_PathInMatrix {
    private final static int[][] next = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};
    private int rows;
    private int cols;

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        if (rows == 0 || cols == 0) {
            return false;
        }
        this.rows = rows;
        this.cols = cols;
        char[][] array = buildMatrix(matrix);
        boolean[][] marked = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (backtracking(array, str, marked,0, i, j)) {
                    return true;
                }
            }
        }
        return false;

    }

    private boolean backtracking(char[][] array, char[] str, boolean[][] marked,int len, int i, int j) {
        if (i < 0 || i >= rows || j < 0 || j >= cols || marked[i][j] || array[i][j] != str[len]) {
            return false;
        }
        if (len + 1 == str.length) {
            return true;
        }
        marked[i][j] = true;
        for (int[] n : next) {
            if (backtracking(array, str, marked, len + 1, i + n[0], j + n[1])) {
                return true;
            }
        }
        marked[i][j] = false;
        return false;
    }

    private char[][] buildMatrix(char[] matrix) {
        char[][] array = new char[rows][cols];
        for (int i = 0, k = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = matrix[k++];
            }
        }
        return array;
    }

}
