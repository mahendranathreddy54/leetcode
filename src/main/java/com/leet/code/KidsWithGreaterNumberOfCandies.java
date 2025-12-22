package com.leet.code;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreaterNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2}; //{2,3,5,1,3};
        int  extraCandies = 1;
        System.out.println(kidsWithCandies(candies, extraCandies)); // Output: "AB"
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            result.add(candy + extraCandies >= getMax(candies));
        }
        return result;
    }

    public  static int getMax(int[] candies) {
        int max = Integer.MIN_VALUE;
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }
        return max;
    }
}
