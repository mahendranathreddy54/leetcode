package com.leet.code;

public class ValidPalindrome {
    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString();
        return s.equals(reverse);
    }
}
