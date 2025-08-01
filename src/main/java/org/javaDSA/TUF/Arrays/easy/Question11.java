package org.javaDSA.TUF.Arrays.easy;

public class Question11 {
    // 485. Max Consecutive Ones
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    private static int findMaxConsecutiveOnes(int[] arr) {
        int maxCount = 0;
        int currentCount = 0;
        for(int num: arr){
            if(num == 1){
                currentCount++;
                maxCount =Math.max(currentCount, maxCount);
            } else {
                currentCount = 0;
            }
        }
        return maxCount;
    }
}
