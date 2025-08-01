package org.javaDSA.leetCode.Array;

// Given an unsorted integer array nums.
// Return the smallest positive integer that is not present in nums.
// You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        int result = firstMissingPositive(nums);
        System.out.println("The first missing positive integer is: " + result); // Output: 2
    }

    private static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Replace negative numbers and zeros with n + 1
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = n + 1;
            }
        }

        // Step 2: Use the index as a hash to mark the presence of numbers
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            if (num <= n) {
                nums[num - 1] = -Math.abs(nums[num - 1]);
            }
        }

        // Step 3: Find the first missing positive integer
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }

        return n + 1; // If all numbers from 1 to n are present
    }
    // Space Complexity: O(n)
    private static int firstMissingPositiveWithSpace(int[] nums) {
        int n = nums.length;
        boolean[] present = new boolean[n + 1];

        for (int num : nums) {
            if (num > 0 && num <= n) {
                present[num] = true;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                return i;
            }
        }

        return n + 1; // If all numbers from 1 to n are present
    }
}
