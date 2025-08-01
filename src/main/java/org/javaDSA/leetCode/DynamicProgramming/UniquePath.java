package org.javaDSA.leetCode.DynamicProgramming;

public class UniquePath {
    public static void main(String[] args) {
        int m = 3, n = 7;
        System.out.println("Unique paths from top-left to bottom-right: " + uniquePaths(m, n)); // Output: 28
    }

    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        // Initialize the first row and first column
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1; // Only one way to reach any cell in the first column
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1; // Only one way to reach any cell in the first row
        }

        // Fill the rest of the dp table
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1]; // Sum of paths from top and left cells
            }
        }

        return dp[m - 1][n - 1]; // Return the bottom-right cell value
    }
    public static int uniquePathRecursive(int m, int n) {
        // Base case: if we reach the first row or first column, there's only one way to get there
        if (m == 1 || n == 1) {
            return 1;
        }
        // Recursive case: sum of paths from the cell above and the cell to the left
        return uniquePathRecursive(m - 1, n) + uniquePathRecursive(m, n - 1);
    }
    public static int uniquePathMemoization(int m, int n) {
        int[][] memo = new int[m][n];
        return uniquePathMemoizationHelper(m - 1, n - 1, memo);
    }

    private static int uniquePathMemoizationHelper(int m, int n, int[][] memo) {
        // Base case: if we reach the first row or first column, there's only one way to get there
        if (m == 0 || n == 0) {
            return 1;
        }
        // If already computed, return the stored value
        if (memo[m][n] != 0) {
            return memo[m][n];
        }
        // Recursive case: sum of paths from the cell above and the cell to the left
        memo[m][n] = uniquePathMemoizationHelper(m - 1, n, memo) + uniquePathMemoizationHelper(m, n - 1, memo);
        return memo[m][n];
    }
}
