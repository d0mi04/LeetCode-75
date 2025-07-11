package org.example.KidsWithCondies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int[] sorted = Arrays.copyOf(candies, candies.length);
        Arrays.sort(sorted);

        int max = sorted[sorted.length - 1];
        List<Boolean> isGreatest = new ArrayList<>();
        for (int candy : candies) {
            if (candy < max - extraCandies) {
                isGreatest.add(false);
            } else {
                isGreatest.add(true);
            }
        }
        return isGreatest;
    }
}
