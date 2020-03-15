package com.buaa.day0222;

public class T64_Add {
    public int Add(int num1, int num2) {
        int num = num1;
        if (num2 == 0) {
            return num;
        }
        if (num2 > 0) {
            num = Add(++num1, --num2);
        } else {
            num = Add(--num, ++num2);
        }
        return num;

    }
}
