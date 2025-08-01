package org.javaDSA.TUF.Arrays.easy;

import java.util.Arrays;

public class Question1 {
    //Given an array of integers nums, return the value of the largest element in the array
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9};
        System.out.println("Largest element in the array: " + findLargest(nums));
        System.out.println("Largest element in the array using stream: " + findLargestUsingStream(nums));
    }
    private static int findLargest(int[] nums){
        int largest = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > largest){
                largest = nums[i];
            }
        }
        return largest;
    }
    private static int findLargestUsingStream(int[] nums){
        return Arrays.stream(nums).max().getAsInt();
    }

}
