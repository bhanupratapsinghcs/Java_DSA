package org.javaDSA.Sorting;

public class Sort {
    /**
     * Bubble sort is a simple comparison-based sorting algorithm.
     * It works by repeatedly stepping through the list, comparing adjacent elements, and swapping them
     * if they are in the wrong order. This process is repeated until the list is sorted. After each pass,
     * the largest (or smallest) element "bubbles up" to its correct position.
     * Bubble sort has a time complexity of O(n²) in the average and worst cases, making it inefficient for large datasets.
     * However, it is easy to understand and implement.
     *
     * @param arr array to be sorted
     * @return sorted array in descending order
     */
    public static int[] bubbleSor(int[] arr){
        if(arr == null || arr.length == 0) {
            return arr;
        }
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - 1; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    /**
     * Selection sort is a simple comparison-based sorting algorithm.
     * It works by dividing the input list into two parts: a sorted part and an unsorted part.
     * The algorithm repeatedly selects the smallest (or largest) element from the unsorted part
     * and moves it to the end of the sorted part. This process continues until the entire list is sorted.
     * Selection sort has a time complexity of O(n²) in all cases, making it inefficient for large datasets.
     * However, it is easy to understand and implement.
     *
     * @param arr array to be sorted
     * @return sorted array in descending order
     */
    public static int[] selectionSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Swap the found maximum element with the first element
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    /**
     * Insertion sort is a simple comparison-based sorting algorithm.
     * It works by building a sorted portion of the array one element at a time.
     * The algorithm iterates through the array, and for each element, it finds its correct position
     * in the sorted portion by comparing it with the elements before it and shifting them as necessary.
     * Insertion sort has a time complexity of O(n²) in the average and worst cases, making it inefficient for large datasets.
     * However, it is efficient for small datasets and partially sorted arrays.
     *
     * @param arr array to be sorted
     * @return sorted array in descending order
     */
    public static int[] insertionSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

}
