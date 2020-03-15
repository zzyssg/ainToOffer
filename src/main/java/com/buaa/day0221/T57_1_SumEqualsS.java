package com.buaa.day0221;

import java.util.ArrayList;
import java.util.Arrays;

public class T57_1_SumEqualsS {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        int i = 0, j = array.length - 1;
        while (i < j) {
            int temp = array[i] + array[j];
            if (temp == sum) {
                return new ArrayList<>(Arrays.asList(array[i],array[j]));
            }
            if (temp >= sum) {
                j--;
            } else {
                i++;
            }

        }
        return new ArrayList<>();
    }

}
