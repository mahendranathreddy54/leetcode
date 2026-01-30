package com.leet.code;

import com.leet.code.util.PrintUtils;

public class ShuffleArray {
    public static void main(String[] args){
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        PrintUtils.printArray(shuffle(nums, n));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] temp = new int[nums.length];
        for(int i =0; i< n ; i++){
            temp[2* i] = nums[i];
            temp[2 * i + 1] = nums[i + n];

        }
        return temp;
    }
}
