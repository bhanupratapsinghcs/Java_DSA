package org.javaDSA.TUF.Arrays.easy;

public class Question2 {
    // Second largest element in an array
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9};
        System.out.println("Second largest element in the array: " + findSecondLargest(nums));
        int[] nums2 = {5, 6, 1, 3, 5, 7, 10, 9, 5};
        System.out.println("Second largest element in the array: " + findSecondLargest(nums2));
    }

    private static int findSecondLargest(int[] nums) {
        int firstLargest = nums[0];
        int secondLargest = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > firstLargest){
                secondLargest = firstLargest;
                firstLargest = nums[i];
            }
            else if(nums[i] > secondLargest && nums[i] != firstLargest){
                secondLargest = nums[i];
            }
        }
        return secondLargest;
    }

}
