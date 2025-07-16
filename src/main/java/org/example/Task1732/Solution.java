package org.example.Task1732;

public class Solution {
    public static int largestAltitude(int[] gain) {
        int altitude = 0;
        int actual = 0;
        for (int g : gain) {
            actual += g;
            altitude = Math.max(altitude, actual);
        }
        return altitude;
    }
}
