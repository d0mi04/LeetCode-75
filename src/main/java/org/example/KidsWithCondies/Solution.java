package org.example.KidsWithCondies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for (int candy : candies) {
            max = Math.max(max, candy);
        }

        List<Boolean> isGreatest = new ArrayList<>();
        for (int candy : candies) {
            isGreatest.add(candy + extraCandies >= max);
        }
        return isGreatest;
    }
}
