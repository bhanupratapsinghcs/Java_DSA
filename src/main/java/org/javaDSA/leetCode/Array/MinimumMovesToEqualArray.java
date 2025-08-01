package org.javaDSA.leetCode.Array;

public class MinimumMovesToEqualArray {
    public static int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int moves = 0;

        // Find the minimum element in the array
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }

        // Calculate the total moves required to make all elements equal to the minimum
        for (int num : nums) {
            moves += num - min;
        }

        return moves;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println("Minimum moves to equal array: " + minMoves(nums)); // Output: 3
    }
}
