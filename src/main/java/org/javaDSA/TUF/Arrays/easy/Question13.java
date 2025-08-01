package org.javaDSA.TUF.Arrays.easy;

public class Question13 {
    // Longest subarray with given sum K(positives)
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, -10};
        int k = 15;
        System.out.println(longestSubarrayWithSumKWithPositive(arr, k));
        System.out.println(NoOfSubarraysWithSumK(arr, k));
    }

    private static int longestSubarrayWithSumKWithPositive(int[] arr, int k) {
        int i = 0, j = 0, sum = 0, maxLength = 0;
        int n = arr.length;
        for( ; i < n; i++){
            sum +=arr[i];
            while(sum > k && j <= i){
                sum -= arr[j];
                j++;
            }
            if(sum == k) {
                maxLength = Math.max(maxLength, i - j + 1);
            }
        }
        return maxLength;
    }

    // 560. Subarray Sum Equals K

    private static int NoOfSubarraysWithSumK(int[] arr, int k){
        int count = 0;
        int sum = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            sum =0;
            for(int j = i; j < n; j++){
                sum+= arr[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
}
