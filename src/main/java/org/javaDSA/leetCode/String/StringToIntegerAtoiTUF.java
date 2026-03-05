package org.javaDSA.leetCode.String;

public class StringToIntegerAtoiTUF {
    public static void main(String[] args) {
        String s = "   -042";
        System.out.println(myAtoi(s));
    }

    private static int myAtoi(String s) {
        s = s.trim();
        if(s.isEmpty()){
            return 0;
        }
        int sign = 1;
        int index = 0;
        if(s.charAt(0) == '+' || s.charAt(0) == '-'){
            sign = s.charAt(0) == '-' ? -1 : 1;
            index++;
        }
        long result = 0;
        while(index < s.length() && Character.isDigit(s.charAt(index))){
            result = result * 10 + (s.charAt(index) - '0');
            if(result * sign > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            } else if (result * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            index++;
        }
        return (int) result * sign;
    }
}
