package org.example.ReverseWords;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Solution {
    public static String reverseWords(String s) {
        return Arrays.stream(s.trim().split("\\s+"))
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> {
                            Collections.reverse(list);
                            return String.join(" ", list);
                        }
                ));
    }
}
