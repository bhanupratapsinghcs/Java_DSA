package org.javaDSA.leetCode.String;

public class ReverseWordsTUF {
    public static void main(String[] args) {
        String s = " Hello World ";
        System.out.println(reverseWords(s));
    }

    private static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--){
            stringBuilder.append(words[i]);
            if(i != 0){
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }
}
