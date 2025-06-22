package org.javaDSA.leetCode.DynamicProgramming;

public class ReverseString {
    public static String reverseString(String str){
        if(str.isEmpty()){
            return "";
        }
        String rString = reverseString(str.substring(1));
        return rString + str.charAt(0);
    }

    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversedStr = reverseString(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }
}
