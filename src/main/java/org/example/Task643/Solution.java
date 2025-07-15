package org.example.Task643;

public class Solution {
    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        // sum of first k numbers - to create sliding window
        for(int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        for(int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, sum);
        }

        // return avg:
        return (double) maxSum / k;
    }
}
