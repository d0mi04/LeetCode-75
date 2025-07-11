package org.example.StringMerge;

public class Solution {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder(word1.length() + word2.length()); // better space alocation
        int minLength = Math.min(word1.length(), word2.length()); // get length of shorter word
        for(int i = 0; i < minLength; i++) {
            merged.append(word1.charAt(i));
            merged.append(word2.charAt(i));
        }

        // add the rest of longer word:
        if(word1.length() > word2.length()) {
            merged.append(word1.substring(minLength));
        } else {
            merged.append(word2.substring(minLength));
        }

        return merged.toString();
    }
}
