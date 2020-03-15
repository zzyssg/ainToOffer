package com.buaa.day0216;

public class T21_OrderArray {
    public void reOrderArray(int [] array) {
    //1判断有几个奇数
       // 2克隆出一个原数组
         // 3由1和2将奇数赋给原数组
        if (array == null || array.length <= 1) {
            return;
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (isEven(array[i])) {
                count++;
            }
        }
        int[] copy = array.clone();
        for (int i = 0, j = 0; i < array.length; i++) {
            if (isEven(copy[i])) {
                array[j++] = copy[i];
            } else {
                array[count++] = copy[i];
            }
        }

    }

    private boolean isEven(int i) {

        return i % 2 == 1;
    }

}
