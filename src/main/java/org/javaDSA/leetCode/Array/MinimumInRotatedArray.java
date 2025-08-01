package org.javaDSA.leetCode.Array;

public class MinimumInRotatedArray {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        System.out.println("Minimum in rotated array: " + findMin(nums)); // Output: 1
    }

    public static int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1; // Minimum is in the right half
            } else {
                right = mid; // Minimum is in the left half or at mid
            }
        }
        return nums[left];
    }
}
