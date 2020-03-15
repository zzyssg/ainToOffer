package com.buaa.day0217;

import java.util.ArrayList;

public class T29_ClockWiseMatrix {
    ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> printMatrix(int[][] matrix) {
        if (matrix == null) {
            return list;
        }
        int m = matrix.length - 1;
        int n = matrix[0].length - 1;
        int i = 0, j = 0;
        while (i <= m && j <= n) {
            printMatrix(matrix, list, i, j, m, n);
            i++;
            j++;
            m--;
            n--;
        }
        return list;
    }

    private void printMatrix(int[][] matrix, ArrayList<Integer> list, int r1, int c1, int r2, int c2) {
        //仅仅打印
        for (int i = c1; i <= c2; i++) {
            list.add(matrix[r1][i]);
        }
        for (int i = r1 + 1; i <= r2; i++) {
            list.add(matrix[i][c2]);
        }
        if (r1 < r2) {
            for (int i = c2 - 1; i >= c1; i--) {
                list.add(matrix[r2][i]);
            }
        }
        if (c1 < c2) {
            for (int i = r2 - 1; i > r1; i--) {
                list.add(matrix[i][c1]);
            }
        }

    }
}
