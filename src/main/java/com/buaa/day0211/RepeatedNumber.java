package com.buaa.day0211;

public class RepeatedNumber {

    public boolean findNum(int[] nums, int[] theNum) {
        if (nums == null || nums.length <= 1) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            while (i != nums[i]) {
                if (nums[i] == nums[nums[i]]) {
                    theNum[0] = nums[i];
                    return true;
                }
                swap(nums, i, nums[i]);
            }
        }
        return false;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        RepeatedNumber repeatedNumber = new RepeatedNumber();
        int[] nums = {3,2,1,2,4};
        int[] num = {-1};
        repeatedNumber.findNum(nums, num);
        System.out.println(num[0]);

    }
}
