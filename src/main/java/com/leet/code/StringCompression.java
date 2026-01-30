package com.leet.code;

import com.leet.code.util.PrintUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringCompression {
    public static void main(String[] args){
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};//{'a','a','b','b','c','c','c'};
        System.out.println(stringCompression(chars));
    }

    private static int stringCompression(char[] chars) {
        int writeIndex = 0;
        int i = 0;

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            // Count consecutive occurrences
            while (i < chars.length && chars[i] == currentChar) {
                count++;
                i++;
            }

            // Write character
            chars[writeIndex++] = currentChar;

            // Write count if greater than 1
            if (count > 1) {
                for (char digit : String.valueOf(count).toCharArray()) {
                    chars[writeIndex++] = digit;
        }
                }
            }

        return writeIndex;
    }
}
