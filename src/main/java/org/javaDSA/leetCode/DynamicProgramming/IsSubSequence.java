package org.javaDSA.leetCode.DynamicProgramming;

public class IsSubSequence {
    public static boolean isSubSequence(String s, String t){
        return isSubSequenceHelper(s, t, s.length(), t.length());
    }

    private static boolean isSubSequenceHelper(String s, String t, int sLength, int tLength) {
        if(sLength == 0){
            return true;
        }
        if(tLength == 0){
            return false;
        }
        if(s.charAt(sLength - 1) == t.charAt(tLength - 1)){
            return isSubSequenceHelper(s, t, sLength -1, tLength -1);
        }else{
            return isSubSequenceHelper(s, t, sLength, tLength -1);
        }
    }

    public static void main(String[] args) {
        String s = "aabc";
        String t = "ahabgdc";
        System.out.println("Is \"" + s + "\" a subsequence of \"" + t + "\": " + isSubSequence(s, t)); // Output: true

        s = "axc";
        t = "ahbgdc";
        System.out.println("Is \"" + s + "\" a subsequence of \"" + t + "\": " + isSubSequence(s, t)); // Output: false
    }
}
