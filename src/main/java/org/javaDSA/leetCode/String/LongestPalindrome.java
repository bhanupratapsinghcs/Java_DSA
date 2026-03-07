package org.javaDSA.leetCode.String;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "babab";
        System.out.println(longestPalindrome(s));
    }

    private static String longestPalindromeOptimise(String s) {
        if(s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for(int i = 0; i < s.length(); i++){
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if(len > end - start){
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int i, int j) {
        while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }
        return j - i - 1;
    }

    private static String longestPalindrome(String s) {
        int longestPalindromeLength = 0;
        String longestPalindrome = "";

        for(int i = 0; i < s.length(); i++){
            for( int j = i; j < s.length(); j++){
                String subString = s.substring(i, j+1);
                if(isPalindrome(subString)){
                    longestPalindromeLength = Math.max(longestPalindromeLength, subString.length());
                    if(longestPalindromeLength == subString.length()){
                        longestPalindrome = subString;
                    }
                }
            }
        }
        return longestPalindrome;
    }
    private static boolean isPalindrome(String s){
        int left = 0, right = s.length() - 1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
