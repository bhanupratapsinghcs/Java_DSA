package org.javaDSA.leetCode.DynamicProgramming;

public class Palindrome {
    public static boolean palindrome(String str){
        // Base case
        if(str.isEmpty() || str.length() == 1){
            return true;
        }
        // Do some work to shrink the problem
        if(str.charAt(0) == str.charAt(str.length()-1)){
             return palindrome(str.substring(1, str.length()-1));
        }
        // Additional base-case to handle noon-palindrome strings
        return false;
    }

    public static void main(String[] args) {
        String str = "racecar";
        boolean isPalindrome = palindrome(str);
        if(isPalindrome){
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }

        String str2 = "hello";
        boolean isPalindrome2 = palindrome(str2);
        if(isPalindrome2){
            System.out.println(str2 + " is a palindrome.");
        } else {
            System.out.println(str2 + " is not a palindrome.");
        }
    }
}
