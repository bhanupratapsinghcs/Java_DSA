package org.javaDSA.TUF.Arrays.easy;

public class Question4 {
    //Remove Duplicates in-place from Sorted Array
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = removeDuplicates(arr);
        System.out.println("New length after removing duplicates: " + newLength);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int removeDuplicates(int[] arr) {
        if(arr == null || arr.length == 0) {
            return 0; // No elements to process
        }
        int uniqueIndex = 0;
        for(int i = 1; i < arr.length;i++){
            if(arr[i] != arr[uniqueIndex]){
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
        }
        return uniqueIndex + 1;
    }
}
