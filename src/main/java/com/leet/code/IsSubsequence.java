package com.leet.code;

public class IsSubsequence {
    public static void main(String[] args){
        String t = "bbaaaa";
        String s = "aaaaaa";
        System.out.println(isSubsequence(s, t));
    }

    private static boolean isSubsequence(String s, String t) {
        char[] ser = s.toCharArray();
        char[] tr = t.toCharArray();
        int found = 0;
        int count = 0;
        for (int i = 0; i< ser.length ; i++){
            while (found < tr.length && t.charAt(found) != s.charAt(i)){
                found ++;
            }
            if(found == t.length()){

            }
        }
        if(count == ser.length){
            return true;
        }
        return false;
    }
}
