package org.javaDSA.leetCode.DynamicProgramming;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] cost = {10, 15, 20};
        System.out.println("Minimum cost to reach the top: " + minCostClimbingStairs(cost)); // Output: 15
    }

    // using recursion only
    private static int minCostClimbingStairs(int[] cost) {
        return Math.min(minCostRecursion(cost, cost.length - 1), minCostRecursion(cost, cost.length - 2));
    }
    private static int minCostRecursion(int[] cost, int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0 || n == 1) {
            return cost[n];
        }
        return cost[n] + Math.min(minCostRecursion(cost, n - 1), minCostRecursion(cost, n - 2));
    }

    // using recursion with memoization
    private static int minCostClimbingStairsMemo(int[] cost, int n, Integer[] memo) {
        if (n < 0) {
            return 0;
        }
        if (n == 0 || n == 1) {
            return cost[n];
        }
        if (memo[n] != null) {
            return memo[n];
        }
        memo[n] = cost[n] + Math.min(minCostClimbingStairsMemo(cost, n - 1, memo), minCostClimbingStairsMemo(cost, n - 2, memo));
        return memo[n];
    }

}
