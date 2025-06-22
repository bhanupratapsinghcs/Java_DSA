package org.javaDSA.leetCode.DynamicProgramming;

public class PowerCal {

    public static int calPower(int base, int exponent){
        if(exponent == 0){
            return 1;
        }
        if(base == 0){
            return 0;
        }
        return base * calPower(base, exponent - 1);
    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 3;
        int result = calPower(base, exponent);
        System.out.println("The result of " + base + " raised to the power of " + exponent + " is: " + result); // Output: 8

        base = 5;
        exponent = 4;
        result = calPower(base, exponent);
        System.out.println("The result of " + base + " raised to the power of " + exponent + " is: " + result); // Output: 625
    }
}
