package com.buaa.day1126;

public class Solution {
    public boolean Find(int target, int [][] array) {
        int m = array.length;
        int n = array[0].length;
        int i = 0;
        int j = n - 1;
        while (i < m && j >= 0) {
            if (array[i][j] == target) {
                return true;
            } else if (array[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}