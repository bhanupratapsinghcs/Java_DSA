package org.javaDSA.leetCode.DynamicProgramming;

import java.util.Stack;

public class DeleteMiddleElementOfStack {
    public static void deleteMid(Stack<Integer> stack, int size) {
        if (stack.isEmpty() || size <= 0) {
            return;
        }
        int mid = size / 2;
        deleteMidHelper(stack, mid);
    }

    private static void deleteMidHelper(Stack<Integer> stack, int mid) {
        if(mid == 0){
            stack.pop();
            return;
        }
        int top =  stack.pop();
        deleteMidHelper(stack, mid - 1);
        stack.push(top);
    }

    public static void main(String[] args) {
        // Example usage
        System.out.println("Delete Middle Element of Stack");
        // You can implement the logic to delete the middle element of a stack here
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Original Stack: " + stack);
        deleteMid(stack, stack.size());
        System.out.println("Stack after deleting middle element: " + stack);
        // Output should be: [1, 2, 4, 5] if the middle element (3) is removed
    }
}
