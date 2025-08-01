package org.javaDSA.TUF.Arrays.easy;

public class Question8 {
    // Linear Search
    public static void main(String[] args) {
        int[] arr = {2, -4, 4, 0, 10};
        int target = 6;
        int index = linearSearch(arr, target);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
        // write test cases
        int[] arr2 = {1, 2, 3, 4, 5};
        int target2 = 3;
        int index2 = linearSearch(arr2, target2);
        if (index2 != -1) {
            System.out.println("Element found at index: " + index2);
        } else {
            System.out.println("Element not found in the array.");
        }
        // Additional test cases
        int[] arr3 = {10, 20, 30, 40, 50};
        int target3 = 10;
        int index3 = linearSearch(arr3, target3);
        if (index3 != -1) {
            System.out.println("Element found at index: " + index3);
        } else {
            System.out.println("Element not found in the array.");
        }

        int[] arr4 = {5, 15, 25, 35, 45};
        int target4 = 100;
        int index4 = linearSearch(arr4, target4);
        if (index4 != -1) {
            System.out.println("Element found at index: " + index4);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    private static int linearSearch(int[] arr, int target) {
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1; // Element not found
    }
}
