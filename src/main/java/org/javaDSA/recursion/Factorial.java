package org.javaDSA.recursion;

public class Factorial {
    public static void main(String[] args) {
        int number = 5; // Example number
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    private static int factorial(int number) {
        if(number == 0 || number == 1){
            return 1;
        }
        return number * factorial(number - 1);
    }
}
