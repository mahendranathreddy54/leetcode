package com.leet.code;

public class MergeStringsAlternatively {


    public static String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int len1 = word1.length();
        int len2 = word2.length();
        int minLen = Math.min(len1, len2);

        for (int i = 0; i < minLen; i++) {
            merged.append(word1.charAt(i));
            merged.append(word2.charAt(i));
        }

        if (len1 > len2) {
            merged.append(word1.substring(minLen));
        } else if (len2 > len1) {
            merged.append(word2.substring(minLen));
        }

        return merged.toString();
    }
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2)); // Output: "apbqcr"
    }
}
