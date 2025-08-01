package org.javaDSA.TUF.Arrays.easy;

public class Question6 {
    // Rotate array by K elements
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 4; // Number of positions to rotate
        rotateArrayInDirection(arr, k, "left");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        rotateArrayLeft(arr2, k);
        for(int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7};
        rotateArrayInDirection(arr3, k, "right");
        for(int num : arr3) {
            System.out.print(num + " ");
        }
    }

    private static void rotateArrayLeft(int[] arr, int k) {
        k = k % arr.length; // Handle cases where k is greater than the array length
        int[] temp = new int[k];
        // Store the first k elements in a temporary array
        for(int i = 0; i < arr.length; i++){
            if (i < k){
                temp[i] = arr[i];
            }else{
                arr[i- temp.length] = arr[i];
            }
        }
        // Copy the temporary array back to the end of the original array
        System.arraycopy(temp, 0, arr, arr.length - k, k);
    }

    private static void rotateArrayRight(int[] arr, int k) {
        k = k % arr.length; // Handle cases where k is greater than the array length
        int[] temp = new int[k];
        rotateArrayLeft(arr , arr.length - k);
    }

    private static void rotateArrayInDirection(int[] arr, int k, String rotationDirection) {
        int n = arr.length;
        k = k % n; // Handle cases where k is greater than n
        if(rotationDirection.equals("left")){
            rotateArrayLeft(arr, k);
        } else if (rotationDirection.equals("right")) {
            rotateArrayRight(arr, k);
        }else{
            System.out.println("Invalid rotation direction. Use 'left' or 'right'.");
        }
    }

    // Rotate array to the right by k elements using reverse method
    private static void rotateByReverse(int[] arr, int k) {
        k = k % arr.length; // Handle cases where k is greater than the array length
        reverse(arr, 0, arr.length - 1); // Reverse the entire array
        reverse(arr, 0, k - 1); // Reverse the first k elements
        reverse(arr, k, arr.length - 1); // Reverse the remaining elements
    }

    private static void reverse(int[] arr, int i, int n) {
        while (i < n) {
            int temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;
            i++;
            n--;
        }
    }
    // Rotate array to the left by k elements using reverse method
    private static void rotateByReverseLeft(int[] arr, int k) {
        k = k % arr.length; // Handle cases where k is greater than the array length
        reverse(arr, 0, arr.length - 1); // Reverse the entire array
        reverse(arr, 0, arr.length - k - 1); // Reverse the first n-k elements
        reverse(arr, arr.length - k, arr.length - 1); // Reverse the last k elements
    }
}
