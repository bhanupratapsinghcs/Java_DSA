package org.javaDSA.leetCode.DynamicProgramming;

import java.util.List;

public class LargestElementInArray {
    public static int largestElement(List<Integer> arr){
        return largestElementHelper(arr, arr.size() -1);
    }

    private static int largestElementHelper(List<Integer> arr, int size) {
        if(size < 0 ){
            return Integer.MIN_VALUE;
        }
        return Math.max(arr.get(size), largestElementHelper(arr, size-1));
    }
    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 3, 5, 7, 9, 2, 4, 6, 8);
        int largest = largestElement(arr);
        System.out.println("Largest element in the array is: " + largest); // Output: 9
    }
}
