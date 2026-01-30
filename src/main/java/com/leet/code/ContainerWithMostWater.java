package com.leet.code;

public class ContainerWithMostWater {
    public static void main(String[] args){
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    private static int maxArea(int[] height) {
        int maxCapacity = Integer.MIN_VALUE;
        /*for(int i = 0; i < height.length; i++){
            for(int j = height.length - 1; j >0 ; j--){
                int diffX = j - i;
                int diffY = Math.min(height[i], height[j]);
                if(maxCapacity < (diffX * diffY)){
                    maxCapacity = diffX * diffY;
                }
            }
        }*/
        int left = 0;
        int right = height.length - 1;
        while(left < right){
            int width = right - left;
            int area = width * Math.min(height[left], height[right]);
            maxCapacity = Math.max(maxCapacity, area);

            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }
        return maxCapacity;
    }
}
