package org.javaDSA.leetCode.String;

public class LargestOldNumberTUF {
    public static void main(String[] args) {
        String num = "67771333398778888";
        System.out.println(largestOdd(num));
    }

    private static String largestOdd(String num) {
        for(int i = num.length() - 1; i >= 0; i--){
            char c = num.charAt(i);
            if(c % 2 != 0){
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}
