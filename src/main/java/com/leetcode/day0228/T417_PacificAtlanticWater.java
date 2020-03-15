package com.leetcode.day0228;

import org.omg.CORBA.PRIVATE_MEMBER;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class T417_PacificAtlanticWater {
    private int[][] turns = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    int m;
    int n;
    int[][] matrix;
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        List<List<Integer>> lists = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return lists;
        }
        this.matrix = matrix;
        m = matrix.length;
        n = matrix[0].length;
        boolean[][] canReachA = new boolean[m][n];
        boolean[][] canReachP = new boolean[m][n];
        for (int i = 0; i < n; i++) {
            dfs(0, i, canReachP); //o,i 能到哪
            dfs(m - 1, i, canReachA);
        }
        for (int i = 0; i < m; i++) {
            dfs(i, 0, canReachP);
            dfs(i, n - 1, canReachA);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (canReachA[i][j] && canReachP[i][j]) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    lists.add(list);
                }
            }
        }
        System.out.println(lists);
        return lists;
    }

    private void dfs(int i, int j, boolean[][] canReachP) {
        if (canReachP[i][j]) {
            return;
        }
        canReachP[i][j] = true;
        for (int[] turn : turns) {
            int nexti = i + turn[0];
            int nextj = j + turn[1];
            if (nexti < 0 || nexti >= m || nextj < 0 || nextj >= n || matrix[i][j] > matrix[nexti][nextj]) {
                continue;
            }
            dfs(nexti, nextj, canReachP);
        }


    }

    public static void main(String[] args) {
        int[][] M = {
                {1,2,2,3,5},
                {3,2,3,4,4},
                {2,4,5,3,1},
                {6,7,1,4,5},
                {5,1,1,2,4},
        };
        T417_PacificAtlanticWater t = new T417_PacificAtlanticWater();
        t.pacificAtlantic(M);
    }
}
