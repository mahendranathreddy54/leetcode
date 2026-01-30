package com.leet.code;

import com.leet.code.util.PrintUtils;

import java.util.HashMap;
import java.util.Map;

public class ToSum {
    public static void main(String[] args){
        int[] nums = {3,3};//{3,2,4};//{2,7,11,15};
        int target = 6;//9;
        PrintUtils.printArray(toSum(nums, target));
    }

    private static int[] toSum(int[] nums, int target) {
       /* int[] targetIndex = new int[2];
        for(int i = 0; i<nums.length; i++){
            for(int j= i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    targetIndex[0] = i;
                    targetIndex[1] = j;
                }
            }
        }
        return targetIndex;*/
        Map<Integer, Integer> found = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            int need = target - nums[i];
            if(found.containsKey(need)){
                return new int[]{found.get(need), i};
            }
            found.put(nums[i], i);
        }
        return new int[]{};
    }
}
