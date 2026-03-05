package org.javaDSA.leetCode.String;

public class MaxDepthParenthesesTUF {
    public static void main(String[] args) {
        String s = "()(())((()()))";
        System.out.println(maxDepth(s));
    }

    private static int maxDepth(String s) {
        int maxDepth = 0;
        int currentDepth = 0;
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(c);
                currentDepth++;
                maxDepth = Math.max(maxDepth, currentDepth);
            } else if (c == ')') {
                stack.pop();
                currentDepth--;
            }
        }
        return maxDepth;
    }

    private static int maxDepthOptimised(String s){
        int maxDepth = 0;
        int currentDepth = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                currentDepth++;
                maxDepth = Math.max(maxDepth, currentDepth);
            } else if (c == ')') {
                currentDepth--;
            }
        }
        return maxDepth;
    }
}
