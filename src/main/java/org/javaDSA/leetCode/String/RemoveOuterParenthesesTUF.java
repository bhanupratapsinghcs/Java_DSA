package org.javaDSA.leetCode.String;

// https://leetcode.com/problems/remove-outermost-parentheses/description/
public class RemoveOuterParenthesesTUF {
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        System.out.println(removeOuterParentheses(s));
    }

    private static String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (count > 0) {
                    sb.append(c);
                }
                count++;
            } else {
                count--;
                if (count > 0) {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}
