package com.buaa.day0221;

public class T42_MaxSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        int res = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0;i < array.length;i++) {
            sum = sum <= 0 ? array[i] : sum + array[i];
            res = Math.max(sum, res);
        }
        return res;
    }
}
