package org.javaDSA.TUF.Arrays.easy;

public class Question9 {
    // Union of Two Sorted Arrays
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 3, 5, 6};

        int[] union = unionOfSortedArrays(arr1, arr2);
        for (int num : union) {
            System.out.print(num + " ");
        }
    }

    private static int[] unionOfSortedArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] union = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                union[k++] = arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                union[k++] = arr2[j++];
            } else {
                union[k++] = arr1[i++];
                j++;
            }
        }
        while (i < n) {
            union[k++] = arr1[i++];
        }
        while (j < m) {
            union[k++] = arr2[j++];
        }
        // Resize the union array to the actual size
        int[] result = new int[k];
        for (int l = 0; l < k; l++) {
            result[l] = union[l];
        }
        return result;
    }
    // Time Complexity: O(n + m)
    // Space Complexity: O(n + m) for the union array
    // where n is the length of arr1 and m is the length of arr2
    // This code finds the union of two sorted arrays without duplicates.
    // It iterates through both arrays, adding elements to the union array
    // and ensuring that duplicates are not added. The final union array is resized
    // to contain only the unique elements found in both arrays.
}
