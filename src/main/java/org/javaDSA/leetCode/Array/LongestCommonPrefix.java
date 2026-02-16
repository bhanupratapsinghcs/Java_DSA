package org.javaDSA.leetCode.Array;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"abab","aba",""};
        System.out.println("flow".indexOf("flower")); // Output: 0
        System.out.println("Longest Common Prefix: " + longestCommonPrefixMe(strs)); // Output: "fl"
    }

    private static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }

    private static String longestCommonPrefixMe(String[] str){
        if(str == null || str.length == 0){
            return "";
        }
        String prefix = str[0];
        for(int i = 1; i < str.length; i++){
            int lengthOfPrefix = prefix.length();
            int lengthOfCurrentString = str[i].length();
            if(lengthOfCurrentString == 0){
                return "";
            }
            int minLength = Math.min(lengthOfPrefix, lengthOfCurrentString);
            for(int j = 0; j < minLength; j++){
                if(prefix.charAt(j) != str[i].charAt(j)){
                    prefix = prefix.substring(0, j);
                    break;
                }
                if(j == minLength - 1){
                    prefix = prefix.substring(0, minLength);
                }
            }
        }
        return prefix;
    }
}
