package com.buaa.day0214;

public class T15_NumberOf1 {
    public int NumberOf1(int n) {
        int res = 0;
        while (n != 0) {
            res++;
            n = n & (n - 1);
        }
        return res;
    }
}
