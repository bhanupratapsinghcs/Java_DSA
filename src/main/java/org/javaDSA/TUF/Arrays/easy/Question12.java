package org.javaDSA.TUF.Arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class Question12 {
    // 136. Single Number
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(arr));
    }

    private static int singleNumber(int[] arr) {
        HashMap<Integer, Integer> countDuplicate = new HashMap<>();
        for( int num: arr){
            countDuplicate.put(num, countDuplicate.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry: countDuplicate.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return 0;
    }
    // Time Complexity: O(n)
    public static int singleNumberUsingXOR(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num; // XOR operation
        }
        return result;
    }
}
