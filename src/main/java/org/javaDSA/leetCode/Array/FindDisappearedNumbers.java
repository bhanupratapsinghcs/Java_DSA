package org.javaDSA.leetCode.Array;

import java.util.List;

public class FindDisappearedNumbers {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        java.util.List<Integer> result = findDisappearedNumbers(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    private static List<Integer> findDisappearedNumbers(int[] nums) {
        java.util.List<Integer> result = new java.util.ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] > 0){
                nums[index] = -nums[index];
            }
        }
        for(int i= 0; i < nums.length; i++){
            if(nums[i] > 0){
                result.add(i + 1);
            }
        }
        return result;
    }
}
