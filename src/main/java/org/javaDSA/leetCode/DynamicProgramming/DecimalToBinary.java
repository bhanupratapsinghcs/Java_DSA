package org.javaDSA.leetCode.DynamicProgramming;

public class DecimalToBinary {
    public static String findBinary(int decimal, String result){
        // Base case
        if(decimal == 0){
            return result;
        }
        // Do some work to shrink the problem
        result =  decimal % 2 + result;
        return findBinary(decimal/2, result);
    }

    public static void main(String[] args) {
        int decimal = 10;
        String binary = findBinary(decimal, "");
        System.out.println("Decimal: " + decimal + " in Binary: " + binary);

        int decimal2 = 15;
        String binary2 = findBinary(decimal2, "");
        System.out.println("Decimal: " + decimal2 + " in Binary: " + binary2);
    }
}
