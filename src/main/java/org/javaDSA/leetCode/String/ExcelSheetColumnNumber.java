package org.javaDSA.leetCode.String;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        String columnTitle = "AB";
        int result = titleToNumber(columnTitle);
        System.out.println(result); // Output: 28
    }

    private static int titleToNumber(String columnTitle) {
        int result = 0;
        for(int i = 0; i < columnTitle.length(); i++){
            char ch = columnTitle.charAt(i);
            result = result * 26 + (ch - 'A' + 1);
        }
        return result;
    }
}
