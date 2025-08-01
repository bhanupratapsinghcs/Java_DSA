package org.javaDSA.leetCode.DSAConcepts;

/**
 * A class demonstrating various ways to implement loops using recursion in Java.
 */
public class Recursion {

    /**
     * Prints numbers from 0 to n-1 using a standard for loop.
     *
     * @param n the upper limit (exclusive) for the loop
     */
    public static void forLoop(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        // output: 0 1 2 3 4
    }

    /**
     * Prints numbers from 0 to n using recursion.
     *
     * @param n the upper limit (inclusive) for the recursion
     */
    public static void forLoopUsingRecursion(int n) {
        if (n < 0) {
            return;
        }
        forLoopUsingRecursion(n - 1);
        System.out.println(n);
        // output: 0 1 2 3 4 5
    }

    /**
     * Prints numbers from n to 0 using recursion.
     *
     * @param n the starting number for the recursion
     */
    public static void forLoopUsingRecursionReverse(int n) {
        if (n < 0) {
            return;
        }
        System.out.println(n);
        forLoopUsingRecursionReverse(n - 1);
        // output: 5 4 3 2 1 0
    }

    /**
     * Prints numbers from n to 0 using recursion with an index parameter.
     *
     * @param n the upper limit (not used in the method logic)
     * @param i the current number to print
     */
    public static void forLoopUsingRecursionInReverse(int n, int i) {
        if (i < 0) {
            return;
        }
        System.out.println(i);
        forLoopUsingRecursionInReverse(n, i - 1);
        // output: 4 3 2 1 0
    }

    /**
     * Prints numbers from 0 to n-1 using recursion with an index parameter.
     *
     * @param n the upper limit (exclusive) for the recursion
     * @param i the current number to print
     */
    public static void forLoopUsingRecursion(int n, int i) {
        if (i >= n) {
            return;
        }
        System.out.println(i);
        forLoopUsingRecursion(n, i + 1);
        // output: 0 1 2 3 4
    }

    /**
     * The main method to demonstrate the usage of the recursive and iterative methods.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("Print numbers from 0 to n using for recursion:");
        forLoopUsingRecursion(5 - 1);

        System.out.println("Print numbers from 0 to n using for recursion with index:");
        forLoopUsingRecursion(5, 0);

        System.out.println("Print numbers from n to 0 using for recursion:");
        forLoopUsingRecursionReverse(5 - 1);

        System.out.println("Print numbers from n to 0 using for recursion with index:");
        forLoopUsingRecursionInReverse(5 - 1, 5 - 1);

        System.out.println("Print numbers from 0 to n using for loop:");
        forLoop(5);
    }
}
