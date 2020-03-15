package com.leetcode.day0302;

public class T204_CountTimes {
    public int countPrimes(int n) {
        //每次找到一个素数，将其删除
        boolean[] notPrime = new boolean[n + 1];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i]) {
                continue;
            }
            count++;
            for (long j = (long)i * i; j < n; j += i) {
                notPrime[(int) j] = true;
            }
        }
        return count;
    }
}
