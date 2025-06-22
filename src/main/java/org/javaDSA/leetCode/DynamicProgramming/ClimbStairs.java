package org.javaDSA.leetCode.DynamicProgramming;

public class ClimbStairs {
    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int firstClimb = climbStairs(n - 1);
        int secondClimb = climbStairs(n - 2);
        return firstClimb + secondClimb;
    }

    // using recursion with memoization
    public static int climbStairsMemo(int n, int[] memo) {
        if (n <= 2) {
            return n;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = climbStairsMemo(n - 1, memo) + climbStairsMemo(n - 2, memo);
        return memo[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5)); // Output: 8
        System.out.println(climbStairs(10)); // Output: 89
        System.out.println(climbStairs(20)); // Output: 10946
        int n = 5;
        int[] memo = new int[n + 1];
        System.out.println(climbStairsMemo(n, memo)); // Output: 8
        n = 10;
        memo = new int[n + 1];
        System.out.println(climbStairsMemo(n, memo)); // Output: 89
        n = 20;
        memo = new int[n + 1];
        System.out.println(climbStairsMemo(n, memo)); // Output: 10946
    }
}
