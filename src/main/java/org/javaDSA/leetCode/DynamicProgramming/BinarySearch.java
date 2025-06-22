package org.javaDSA.leetCode.DynamicProgramming;

public class BinarySearch {
    // Binary Search return Integer
    public static int binarySearchRecursive(int[] arr, int left, int right, int x){
        if(left > right){
            return -1;
        }
        int mid = (left + right) / 2;

        if(arr[mid] == x){
            return mid;
        }

        if(x < arr[mid]){
            return binarySearchRecursive(arr, left, mid -1, x);
        }
        return binarySearchRecursive(arr, mid + 1, right, x);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int x = 10;
        int result = binarySearchRecursive(arr, 0, arr.length - 1, x);

        if(result == -1){
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at index: " + result);
        }
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int x2 = 9;
        int result2 = binarySearchRecursive(arr2, 0, arr2.length - 1, x2);
        if(result2 == -1){
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at index: " + result2);
        }
    }
}
