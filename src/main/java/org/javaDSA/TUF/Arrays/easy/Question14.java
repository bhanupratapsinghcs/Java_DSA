package org.javaDSA.TUF.Arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class Question14 {
    // Longest Subarray with sum K | [Positives and Negatives]
    //https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, -10};
        int k = 15;
        System.out.println(longestSubarrayWithSumK(arr, k));
    }

    private static int longestSubarrayWithSumK(int[] arr, int k) {
        int n = arr.length;
        int maxLength = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            sum += arr[i];

            // check if the current sum is equal to k
            if(sum == k) {
                maxLength = Math.max(maxLength, i + 1);
            }
            int remainingSum = sum - k;
            // check if (sum - k) exists in the map
            if(map.containsKey(remainingSum)) {
                // If it exists, calculate the length of the subarray
                int length = i - map.get(remainingSum);
                maxLength = Math.max(maxLength, length);
            }
            // Store the first occurrence of the current sum
            if(!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return maxLength;
    }
}
