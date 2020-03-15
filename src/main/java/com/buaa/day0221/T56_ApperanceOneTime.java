package com.buaa.day0221;

import java.util.HashMap;


public class T56_ApperanceOneTime {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int dif = 0;
        for (int i = 0; i < array.length; i++) {
            dif ^= array[i];
        }
        dif &= -dif;
        for (int num : array) {
            if ((dif & num) == 0) {
                num1[0] ^= num;
            } else {
                num2[0] ^= num;
            }
        }
    }
}
