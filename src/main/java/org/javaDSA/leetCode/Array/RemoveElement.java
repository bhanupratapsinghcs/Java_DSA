package org.javaDSA.leetCode.Array;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        int k = removeElement(nums, val);
        System.out.println("New length: " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    private static int removeElement(int[] nums, int val) {
        int k = 0; // Pointer for the position of the next non-val element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    private static int removeElement2(int[] nums, int val) {
        int left = 0;
        int right = nums.length -1;
        while(left <= right){
            if(nums[left] == val){
                nums[left] = nums[right];
                right--;
            }
            else{
                left++;
            }
        }
        return left;
    }

}
