package com.leet.code;

import com.leet.code.util.PrintUtils;

public class ProductOfArrayExpectSelf {
    public static void main(String[] args){
        int[] nums = {-1,1,0,-3,3};
        PrintUtils.printArray(productOfArrayExceptSelf(nums));
    }

    private static int[] productOfArrayExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= right;
            right *= nums[i];
        }
        return result;
    }
}
