package org.javaDSA.TUF.Arrays.easy;

public class Question10 {
    // Find the missing number in an array
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(missingNumber(arr));
    }

    private static int missingNumber(int[] arr) {
        int n = arr.length;
        int totalSum = (n * (n + 1)) / 2;
        int arrSum = 0;
        for (int num : arr) {
            arrSum += num;
        }
        return totalSum - arrSum;
    }
    // Time Complexity: O(n)
    // Space Complexity: O(1)

//    private static int missingNumberUsingAbs(int[] arr){
//        int n = arr.length;
//        for(int i = 0; i < n; i++){
//            if(arr[i] < n){
//                int index = Math.abs(arr[i]);
//            }
//        }
//    }
}
