package org.javaDSA.leetCode.String;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World";
        int result = lengthOfLastWord(s);
        System.out.println(result); // Output: 5
    }

    private static int lengthOfLastWord(String s) {
        int length = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == ' '){
                if(length > 0){
                    return length;
                }
            }else {
                length++;
            }
        }
        return length;
    }
}
