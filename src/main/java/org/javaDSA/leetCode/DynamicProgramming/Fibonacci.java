package org.javaDSA.leetCode.DynamicProgramming;

public class Fibonacci {
    public static int fibonacci(int n){
        if (n <=0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void printFibonacci(int n){
        System.out.print("0 1 ");
        printFibonacciHelper(n, 0, 1);
    }

    private static void printFibonacciHelper(int n, int i, int j) {
        int sum = i + j;
        System.out.print(sum + " ");
        if(n > 2) {
            printFibonacciHelper(n - 1, j, sum);
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(5)); // Output: 5
        System.out.println(fibonacci(10)); // Output: 55
        System.out.println(fibonacci(20)); // Output: 6765
        System.out.println("Fibonacci series up to 10 terms:");
        printFibonacci(10); // Output: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
    }
}
