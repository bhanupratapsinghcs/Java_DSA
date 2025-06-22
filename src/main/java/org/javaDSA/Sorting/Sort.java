package org.javaDSA.Sorting;

public class Sort {
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
}
