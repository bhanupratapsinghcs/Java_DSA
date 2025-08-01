package org.javaDSA.leetCode.SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class FirstNegInEveryWindow {

    // Time Complexity: O(n)
    // Space Complexity: O(k) for the deque
    public static List<Integer> firstNegativeInEveryWindow(int[] arr, int k) {
        int n = arr.length;
        List<Integer> result = new ArrayList<>();
        java.util.Deque<Integer> deque = new java.util.LinkedList<>();

        for (int i = 0; i < n; i++) {
            // Remove elements not in the current window
            if (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }

            // Add current element if it is negative
            if (arr[i] < 0) {
                deque.offer(i);
            }

            // If we have filled the first window, record the first negative number
            if (i >= k - 1) {
                result.add(deque.isEmpty() ? 0 : arr[deque.peek()]);
            }
        }
        return result;
    }

    // Using Sliding Window Technique
    // Time Complexity: O(n * k)
    // Space Complexity: O(1) for the result array
    public static List<Integer> firstNegativeInEveryWindowUsingSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        List<Integer> result = new ArrayList<>();
        int index = 0;

        for (int i = 0; i <= n - k; i++) {
            boolean found = false;
            for (int j = i; j < i + k; j++) {
                if (arr[j] < 0) {
                    result.add(arr[j]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                result.add(0); // If no negative number found in the window
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-8, 2, 3, -6, 10};
        int k = 2;
        List<Integer> result = firstNegativeInEveryWindowUsingSlidingWindow(arr, k);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
