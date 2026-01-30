package com.leet.code;

public class FindTheHighestAltitude {
    public static void main(String[] args){
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        int[] temp = new int[gain.length + 1];
        temp[0] = 0;
        int max = 0;
        for(int i = 0; i < gain.length; i++){
            int h = temp[i] + gain[i];
            if(h > max){
                max = h;
            }
            temp[i+1] =  temp[i] + gain[i];
        }
        return max;
    }
}
