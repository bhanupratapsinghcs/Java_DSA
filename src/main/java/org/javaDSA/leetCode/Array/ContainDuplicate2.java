package org.javaDSA.leetCode.Array;

import java.util.ArrayList;
import java.util.HashMap;

// https://leetcode.com/problems/contains-duplicate-ii/description/?envType=problem-list-v2&envId=array
public class ContainDuplicate2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        boolean result = containsNearbyDuplicate(nums, k);
        System.out.println(result);
    }

    private static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, ArrayList<Integer>> countElements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(countElements.containsKey(nums[i])){
                ArrayList<Integer> indices = countElements.get(nums[i]);
                for (Integer index : indices) {
                    if(Math.abs(i - index) <= k){
                        return true;
                    }
                }
                indices.add(i);
            } else{
                ArrayList<Integer> indices = new ArrayList<>();
                indices.add(i);
                countElements.put(nums[i], indices);
            }
        }
        return false;
    }

    private static boolean containsNearbyDuplicate2(int[] nums, int k) {
        HashMap<Integer, Integer> countElements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(countElements.containsKey(nums[i])){
                int index = countElements.get(nums[i]);
                if(Math.abs(i - index) <= k){
                    return true;
                }
                countElements.put(nums[i], i);
            } else{
                countElements.put(nums[i], i);
            }
        }
        return false;
    }

    private static boolean countsNearbyDuplicate3(int[] nums, int k) {
        for(int i = 0; i < nums.length; i++){
            for (int j = i + 1; j <= i + k && j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
