package org.javaDSA.TUF.Arrays.easy;

public class Question7 {
    // Move Zeros to the end of the array
    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 0, 5, 2};
        moveZerosToEnd(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void moveZerosToEnd(int[] arr) {
        int n = arr.length;
        int count = 0; // Count of non-zero elements

        for(int i = 0; i < n; i++){
            if(arr[i] !=  0){
                arr[count] = arr[i];
                count++;
            }
        }
        // Fill the remaining positions with zeros
        while(count < n){
            arr[count] = 0;
            count++;
        }
    }

}
