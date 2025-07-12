package org.example.StringCompression;

public class Solution {
    public static int compress(char[] chars) {
        StringBuilder s = new StringBuilder();
        int counter = 1;
        for(int i = 0; i < chars.length; i++) {
            char letter = chars[i];
            while((i + 1 < chars.length) && chars[i] == chars[i + 1]) {
                counter++;
                i++;
            }
            s.append(letter);
            s.append(counter);

            counter = 1;
        }
        System.out.println(s.toString());
        return s.length();
    }
}
