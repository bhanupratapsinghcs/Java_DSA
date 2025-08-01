package org.javaDSA.leetCode.DynamicProgramming;

public class LongestCommonSubsequence {
    public static int lcsRec(String x, String y) {
//        return lcsHelper(x, y, x.length(), y.length());
        // Using DP to optimize the recursive solution
        int[][] dp = new int[x.length() + 1][y.length() + 1];
        for (int[] row : dp) {
            java.util.Arrays.fill(row, -1); // Initialize dp array with -1
        }
        return lcsRecDp(x, y, x.length(), y.length(), dp);
    }
    private static int lcsHelper(String x, String y, int m, int n) {
        // Base case: if either string is empty
        if (m == 0 || n == 0) {
            return 0;
        }

        // If last characters match, include this character in the LCS
        if (x.charAt(m - 1) == y.charAt(n - 1)) {
            return 1 + lcsHelper(x, y, m - 1, n - 1);
        } else {
            // If last characters do not match, find the maximum LCS by excluding one character from either string
            return Math.max(lcsHelper(x, y, m - 1, n), lcsHelper(x, y, m, n - 1));
        }
    }
    // DP in above solution
    private static int lcsRecDp(String x, String y, int m, int n, int[][] dp) {
        if(m == 0 || n == 0) {
            return 0;
        }
        if(dp[m][n] != -1) {
            return dp[m][n];
        }
        if(x.charAt(m - 1) == y.charAt(n - 1)) {
            dp[m][n] = 1 + lcsRecDp(x, y, m - 1, n - 1, dp);
        } else {
            dp[m][n] = Math.max(lcsRecDp(x, y, m - 1, n, dp), lcsRecDp(x, y, m, n - 1, dp));
        }
        return dp[m][n];
    }

    // Dp solution
    private static int lcsDP(String x, String y) {
        int m = x.length();
        int n = y.length();
        int[][] dp = new int[m + 1][n + 1];

        // Build the dp array in bottom-up manner
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        String x = "bl";
        String y = "yby";
        int result = lcsRec(x, y);
        System.out.println("Length of Longest Common Subsequence between \"" + x + "\" and \"" + y + "\" is: " + result); // Output: 3

        String x2 = "abc";
        String y2 = "abc";
        int result2 = lcsRec(x2, y2);
        System.out.println("Length of Longest Common Subsequence between \"" + x2 + "\" and \"" + y2 + "\" is: " + result2); // Output: 3
    }
}
