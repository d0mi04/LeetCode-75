package org.example.MoveZeros;

public class Solution {
    public static void moveZeros(int[] nums) {
        int lastNonZero = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[lastNonZero] = nums[i]; // move non-zero value to lastNonZeros
                if(i != lastNonZero) {
                    nums[i] = 0;
                }
                lastNonZero++;
            }
        }
    }
}
