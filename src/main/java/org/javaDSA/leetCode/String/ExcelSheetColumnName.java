package org.javaDSA.leetCode.String;

public class ExcelSheetColumnName {
    public static void main(String[] args) {
        int n = 28;
        String result = convertToTitle(n);
        System.out.println(result); // Output: AB
    }

    private static String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();
        while(n > 0){
            n--; // Decrement n to make it 0-indexed
            char ch = (char) ('A' + (n % 26)); // Get the current character
            result.append(ch); // Append the character to the result
            n /= 26; // Move to the next character
        }
        return result.reverse().toString(); // Reverse the result and convert to string
    }
}
