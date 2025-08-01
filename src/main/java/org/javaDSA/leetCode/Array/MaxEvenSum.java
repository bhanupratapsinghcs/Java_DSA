package org.javaDSA.leetCode.Array;

import java.util.Arrays;
import java.util.List;

public class MaxEvenSum {
    public static void main(String[] args) {
        List<Integer> nums = List.of(-2, 2, -3, 4, 5);
        Long result = maxEvenSum(nums);
        System.out.println("Maximum even sum of non-adjacent elements: " + result);
    }

    private static Long maxEvenSum(List<Integer> nums) {
        int n = nums.size();
        long positiveSum = 0;

        // Calculate the sum of all positive numbers in the list
        for (int num : nums) {
            if (num > 0) {
                positiveSum += num;
            }
        }

        // If the sum is already even, return it
        if (positiveSum % 2 == 0) {
            return positiveSum;
        }

        long res = Long.MIN_VALUE;

        // since the sum is odd, we need to adjust it by adding negative odd numbers or subtracting positive odd numbers
        // Iterate through the list to find the maximum even sum by adjusting the positive sum
        for (int num : nums) {
            if (num % 2 != 0) { // Check if the number is odd
                if (num > 0) {
                    res = Math.max(res, positiveSum - num); // Subtract positive odd numbers
                } else {
                    res = Math.max(res, positiveSum + num); // Add negative odd numbers
                }
            }
        }

        // Return the result, or 0 if no valid sum exists
        return res == Long.MIN_VALUE ? 0 : res;
    }
}
