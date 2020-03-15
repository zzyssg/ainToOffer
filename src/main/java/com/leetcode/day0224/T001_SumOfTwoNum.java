package com.leetcode.day0224;

import java.util.Arrays;
import java.util.HashMap;

public class T001_SumOfTwoNum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && i != map.get(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
        }
        return new int[]{};
    }
}
