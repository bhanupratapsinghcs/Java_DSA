package org.javaDSA.TUF.Arrays.easy;

public class Question5 {
    // Left Rotate the Array by One
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original Array:");
        printArray(arr);

        leftRotate(arr);

        System.out.println("Array after left rotation:");
        printArray(arr);
    }

    private static void leftRotate(int[] arr) {
        int temp = arr[0];
        for(int i = 0; i < arr.length -1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length - 1] = temp;
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
