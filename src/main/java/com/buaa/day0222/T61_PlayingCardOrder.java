package com.buaa.day0222;

import java.util.Arrays;

public class T61_PlayingCardOrder {
    public boolean isContinuous(int [] numbers) {
        if (numbers == null || numbers.length < 5) {
            return false;
        }
        Arrays.sort(numbers);
        int count = 0;
        for (int i : numbers) {
            if (i == 0) {
                count++;
            }
        }
        for (int i = count; i < numbers.length - 1; i++) {
            if (numbers[i + 1] == numbers[i]) {
                return false;
            }
            count -= numbers[i + 1] - numbers[i] - 1;
        }
        return count == 0;
    }
}
