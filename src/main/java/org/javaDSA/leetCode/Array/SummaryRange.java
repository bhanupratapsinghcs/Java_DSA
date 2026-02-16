package org.javaDSA.leetCode.Array;

import java.util.List;

// https://leetcode.com/problems/summary-ranges/description/?envType=problem-list-v2&envId=array
public class SummaryRange {
    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        System.out.println(summaryRanges(nums));
    }

    private static List<String> summaryRanges(int[] nums) {
            List<String> result = new java.util.ArrayList<>();
            if(nums.length == 0){
                return result;
            }
            int start = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if(nums[i] != nums[i-1] + 1){
                    if(start == nums[i-1]){
                        result.add(String.valueOf(start));
                    } else{
                        result.add(start + "->" + nums[i-1]);
                    }
                    start = nums[i];
                }
            }
            if(start == nums[nums.length - 1]){
                result.add(String.valueOf(start));
            } else{
                result.add(start + "->" + nums[nums.length - 1]);
            }
            return result;
    }
}
