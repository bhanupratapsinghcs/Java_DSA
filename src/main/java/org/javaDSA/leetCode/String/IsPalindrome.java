package org.javaDSA.leetCode.String;

public class IsPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean result = isPalindrome(s);
        System.out.println(result); // Output: true
    }

    private static boolean isPalindrome(String s) {
        String filterdString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = filterdString.length() - 1;
        while(left < right){
            if(filterdString.charAt(left) != filterdString.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
