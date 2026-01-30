package com.leet.code;

import com.leet.code.util.PrintUtils;

import java.util.HashMap;
import java.util.Map;

public class MaximumSubarray {
    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        //PrintUtils.printArray(maximumSubarray(nums));
        System.out.println(maximumSubarray(nums));
    }

    private static int maximumSubarray(int[] nums) {
        /*int maxSum = nums[0];
        int currentSum = nums[0];
        int maxStart = 0, maxEnd = 0;
        int tempStart = 0;

        for (int i = 1; i < nums.length; i++) {
            if (currentSum < 0) {
                currentSum = nums[i];
                tempStart = i;
            } else {
                currentSum += nums[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                maxStart = tempStart;
                maxEnd = i;
            }
        }

        int[] result = new int[maxEnd - maxStart + 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = nums[maxStart + i];
        }

        return result;*/
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (currentSum < 0) {
                currentSum = nums[i];
            } else {
                currentSum += nums[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }
}
