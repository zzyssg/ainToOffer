package com.leetcode.day0303;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class T217_ContainsDumplicated {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return set.size() < nums.length;
    }

}
