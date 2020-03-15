package com.buaa.day0221;

import java.util.ArrayList;
import java.util.Arrays;

public class T45_ArrayToMinNum {
    public String PrintMinNumber(int [] numbers) {
        String[] numStrs = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numStrs[i] = numbers[i] + "";
        }
        Arrays.sort(numStrs, (o1, o2) -> (o1 + o2).compareTo(o2 + o1));
        String res = "";
        for (String str : numStrs) {
            res += str;
        }
        return res;


    }
}
