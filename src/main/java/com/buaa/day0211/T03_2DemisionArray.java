package com.buaa.day0211;

public class T03_2DemisionArray {

    public boolean isInArray(int[][] arr, int num) {
        if (arr == null) {
            return false;
        }
        int i = 0;
        int j = arr[0].length;
        while (i < arr.length && j >= 0) {
            if (arr[i][j] > num) {
                j--;
            } else if (arr[i][j] < num) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }

}
