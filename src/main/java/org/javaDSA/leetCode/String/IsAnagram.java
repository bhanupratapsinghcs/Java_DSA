package org.javaDSA.leetCode.String;

public class IsAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    private static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        // char[] sArray = s.toCharArray();
        // char[] tArray = t.toCharArray();
        // java.util.Arrays.sort(sArray);
        // java.util.Arrays.sort(tArray);
        // for(int i = 0; i < s.length(); i++){
        //     if(sArray[i] != tArray[i]){
        //         return false;
        //     }
        // }
        // return true;
        int[] charCount = new int[26];
        for(int i = 0; i < s.length(); i++){
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }
        for(int count : charCount){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
}
