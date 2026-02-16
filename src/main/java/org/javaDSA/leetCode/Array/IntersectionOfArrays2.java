package org.javaDSA.leetCode.Array;

public class IntersectionOfArrays2 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = intersect(nums1, nums2);
        for (int num : result) {
            System.out.print(num + " ");
        }

    }

    private static int[] intersect(int[] nums1, int[] nums2) {
        java.util.Arrays.sort(nums1);
        java.util.Arrays.sort(nums2);
        int i = 0, j = 0;
        java.util.List<Integer> resultList = new java.util.ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                resultList.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int[] result = new int[resultList.size()];
        for (int k = 0; k < resultList.size(); k++) {
            result[k] = resultList.get(k);
        }
        return result;
    }

    private static int[] intersectUsingHashMap(int[] nums1, int[] nums2) {
        java.util.Map<Integer, Integer> countMap = new java.util.HashMap<>();
        for (int num : nums1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        java.util.List<Integer> resultList = new java.util.ArrayList<>();
        for (int num : nums2) {
            if (countMap.getOrDefault(num, 0) > 0) {
                resultList.add(num);
                countMap.put(num, countMap.get(num) - 1);
            }
        }
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
}
