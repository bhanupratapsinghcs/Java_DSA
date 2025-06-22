package org.javaDSA.leetCode.DynamicProgramming;

public class SumOfNaturalNumber {
    public static int sumOfNumber(int n){
        if(n <= 1){
            return 1;
        }
        int result = sumOfNumber(n - 1);
        return n + result;
    }

    public static void main(String[] args) {
        int n = 5;
        int sum = sumOfNumber(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);

        int n2 = 10;
        int sum2 = sumOfNumber(n2);
        System.out.println("Sum of first " + n2 + " natural numbers is: " + sum2);
    }
}
