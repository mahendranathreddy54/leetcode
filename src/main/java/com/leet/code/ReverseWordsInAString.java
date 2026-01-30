package com.leet.code;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "  hello world  ";
        System.out.println('"' + reverseWords(s) + '"'); // Output: "world hello"
    }

    private static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder b = new StringBuilder();
        b.append(words[words.length - 1]);
        for(int i = words.length - 2; i >= 0; i--){
            b.append(" ");
            b.append(words[i]);
        }
        return b.toString();
    }
}
