package org.javaDSA.leetCode.DynamicProgramming;

public class DivisorGame {
    public static boolean divisorGameRecursion(int n){
        return divisorGameHelper(n);
    }
    private static boolean divisorGameHelper(int n) {
        // Base case: if n is 1, the first player cannot make a move and loses
        if (n == 1) {
            return false;
        }

        // Try all possible moves
        for (int i = 1; i < n; i++) {
            if (n % i == 0) { // i is a valid divisor
                // If the opponent loses after this move, then the current player wins
                if (!divisorGameHelper(n - i)) {
                    return true;
                }
            }
        }

        // If no winning move is found, the current player loses
        return false;
    }

    public static void main(String[] args) {
        int n = 2;
        boolean result = divisorGameRecursion(n);
        System.out.println("Can the first player win with n = " + n + "? " + result);

        int n2 = 4;
        boolean result2 = divisorGameRecursion(n2);
        System.out.println("Can the first player win with n = " + n2 + "? " + result2);
    }
}
