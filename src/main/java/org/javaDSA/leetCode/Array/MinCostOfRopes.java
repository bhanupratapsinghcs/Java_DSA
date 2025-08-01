package org.javaDSA.leetCode.Array;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MinCostOfRopes {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 6};
        System.out.println(minCost2(arr));
    }

    private static int minCost(int[] arr) {
        int[] sorted = Arrays.stream(arr).sorted().toArray();
        int result = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int rope : arr){
            queue.add(rope);
        }
        while(queue.size() > 1){
            int first = queue.poll();
            int second = queue.poll();
            queue.add(first+second);
            result += first + second;
        }
        return result;
    }
    private static int minCost2(int[] arr) {
        Arrays.sort(arr);
        int result = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i + 1] += arr[i];
            result += arr[i + 1];
        }
        return result;
    }
}
