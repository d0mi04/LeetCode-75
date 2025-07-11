package org.example.GCDofStrings;

public class Solution {
    public static String gcdOfStrings(String str1, String str2) {
        // strings will have GCD if str1 + str2 equals str2 + str1
        if(!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int gcdLength = gcd(str1.length(), str2.length());

        return str1.substring(0, gcdLength);
    }

    private static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}
