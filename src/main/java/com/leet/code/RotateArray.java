package com.leet.code;

import com.leet.code.util.PrintUtils;


public class RotateArray {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        PrintUtils.printArray(rotate(nums, k));
    }

    public static int[] rotate(int[] nums, int k){
        k %= nums.length;
        for(int i = 0; i < k; i++){
            int last = nums[nums.length - 1];
            for(int j = nums.length - 1; j > 0; j--){
                nums[j] = nums[j - 1];
            }
            nums[0] = last;
        }
        return nums;
    }
}
