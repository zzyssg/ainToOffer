package com.buaa.day0214;

public class T13_RobotMove {
    private int k;
    private int rows;
    private int cols;
    private static final int[][] next = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
    private int[][] numSum;
    private int res;

    public int movingCount(int threshold, int rows, int cols) {
        this.k = threshold;
        this.rows = rows;
        this.cols = cols;
        boolean[][] marked = new boolean[rows][cols];
        initNumSum();
        move(marked, 0, 0);
        return res;


    }

    private void move(boolean[][] marked, int i, int j) {
        if (i < 0 || i >= this.rows || j < 0 || j >= cols || marked[i][j]) {
            return;
        }

        marked[i][j] = true;
        if ( this.numSum[i][j] > this.k) {
            return;
        }
        res++;
        for (int[] n : next) {
            move(marked, i + n[0], j + n[1]);
        }

    }

    private void initNumSum() {
        int[] rs = new int[Math.max(this.rows, this.cols)];
        for (int i = 0; i < rs.length; i++) {
            int temp = i;
            while (temp > 0) {
                rs[i] += temp % 10;
                temp /= 10;
            }
        }
        numSum = new int[this.rows][this.cols];
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                this.numSum[i][j] = rs[i] + rs[j];
            }
        }
    }


}
