package org.example.ReverseWords;

public class Solution {
    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder output = new StringBuilder(s.length());

        for(int i = words.length - 1; i >= 0; i--) {
            output.append(words[i]);
            if(i != 0) {
                output.append(" ");
            }
        }
        return output.toString();
    }
}
