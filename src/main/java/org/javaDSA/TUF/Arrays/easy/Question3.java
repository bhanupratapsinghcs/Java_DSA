package org.javaDSA.TUF.Arrays.easy;

public class Question3 {
    // Check if an array is sorted
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        boolean isSorted = isArraySorted(arr);
        System.out.println("Is the array sorted? " + isSorted);
        int[] unsortedArr = {5, 3, 4, 1, 2};
        boolean isUnsorted = isArraySorted(unsortedArr);
        System.out.println("Is the unsorted array sorted? " + isUnsorted);
    }

    private static boolean isArraySorted(int[] arr) {
        for(int i = 0; i < arr.length -1; i++){
            if(arr[i] > arr[i + 1]){
                return false;
            }
        }
        return true;
    }
}
