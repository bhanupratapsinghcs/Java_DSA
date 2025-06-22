package org.javaDSA.leetCode.DynamicProgramming;

public class Tribonacci {
    public static void main(String[] args) {
        int n = 25; // Example input
        int result = tribonacci(n);
        System.out.println("Tribonacci of " + n + " is: " + result);
    }

    private static int tribonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
    }
    public static int tribonacciMemoization(int n) {
        int[] memo = new int[n + 1];
        return tribonacciHelper(n, memo);
    }
    private static int tribonacciHelper(int n, int[] memo) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = tribonacciHelper(n - 1, memo) + tribonacciHelper(n - 2, memo) + tribonacciHelper(n - 3, memo);
        return memo[n];
    }
}
