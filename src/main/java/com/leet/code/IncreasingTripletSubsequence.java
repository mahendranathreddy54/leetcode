package com.leet.code;

public class IncreasingTripletSubsequence {
    public static void main(String[] args){
        int[] nums = {20,100,10,12,5,13};//{2,1,5,0,4,6};//{5,4,3,2,1};//{1,2,3,4,5};
        System.out.println(increasingTriplet(nums));
    }

    private static boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) return false;

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num;
            } else if (num <= second) {
                second = num;
            } else {
                return true;
            }
        }
        return false;
    }
}
