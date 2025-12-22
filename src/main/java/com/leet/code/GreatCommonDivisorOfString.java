package com.leet.code;

public class GreatCommonDivisorOfString {

    public static void main(String[] args) {
        String str1 = "AAAAAB"; //"ABABAB";
        String str2 = "AAA";
        System.out.println(gcdOfStrings(str1, str2)); // Output: "AB"
    }

    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

    private static int gcd(int length1, int length2) {
        if (length2 == 0) {
            return length1;
        }
        return gcd(length2, length1 % length2);
    }
}
