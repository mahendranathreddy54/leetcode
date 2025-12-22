package com.leet.code;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1}; //{1,0,0,0,1};
        int n = 2;
        System.out.println(canPlaceFlowers(flowerbed, n)); // Output: true
    }

    private static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i =0 ;i < flowerbed.length; i++){
            if(flowerbed[i]==0){
                boolean emptyLeft = ((i == 0) || flowerbed[i - 1] == 0);
                boolean emptyRight = (( i == flowerbed.length -1) || flowerbed[i + 1] == 0);
                if(emptyLeft && emptyRight){
                    flowerbed[i] = 1;
                    count ++;
                }
            }
        }
        return count >= n;
    }
}
