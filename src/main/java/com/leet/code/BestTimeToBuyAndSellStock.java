package com.leet.code;

import java.util.HashMap;
import java.util.Map;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        Map<Integer,Integer> result = new HashMap<>();
        for(int i = 0; i < prices.length-1; i++){
            for(int j = i+1; j <prices.length;j++ ) {
                int profit = prices[j] - prices[i];
                if (profit > 0) {
                    result.put(prices[j] - prices[i], j);
                }
            }
        }
        if(!result.isEmpty()){
            int max = result.keySet().stream().max(Integer::compare).get();
            return result.get(max) + 1;
        }
        return 0;
    }
}
