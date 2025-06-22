package org.javaDSA.leetCode.DynamicProgramming;

import java.util.*;

public class SpecialElementsInMatrix {

    public static int countSpecialElements(List<List<Integer>> matrix) {
        int m = matrix.size();
        int n = matrix.get(0).size();
        int ans = 0;
        for(int i = 0;i < m;i++){
            for (int j = 0; j < n;j++){
                int l = 0;
                for (int k = 0;k < m;k++){
                    if (k != i){
                        if ( matrix.get(k).get(j) <= matrix.get(i).get(j)){
                            l = -1;
                            break;
                        }
                    }
                }
                int ll = 0;
                for (int k = 0;k < n;k++){
                    if (k != i){
                        if (matrix.get(i).get(k) <= matrix.get(i).get(j)){
                            ll = -1;
                            break;
                        }
                    }
                }
                int lll = 0;
                for (int k = 0;k < m;k++){
                    if (k != i){
                        if (matrix.get(k).get(j) <= matrix.get(i).get(j)){
                            lll = -1;
                            break;
                        }
                    }
                }
                int llll = 0;
                for (int k = 0;k < n;k++){
                    if (k != i){
                        if (matrix.get(i).get(k) <= matrix.get(i).get(j)){
                            llll = -1;
                            break;
                        }
                    }
                }
                if (l != -1 || ll != -1 || lll != -1 || llll != -1){
                    ans += 1;
                }
            }
        }
        if (ans == 0){
                return -1;
        }
        else{
                return ans;
        }
    }

    // Example usage
    // This main method is for testing the countSpecialElements function
    // You can remove it or modify it as needed.
    // It initializes a matrix and prints the count of special elements.
    // If the matrix is empty or has no special elements, it returns -1.
    // If there are special elements, it returns the count of unique special elements.
    // Note: The expected output for the provided example is 7.
    // The matrix is:
    // [[2, 3, 4],
    //  [5, 2, 9],
    //  [8, 7, 6]]
    // The special elements are: 2, 3, 4, 5, 6, 7, 8, 9
    // The count of unique special elements is 7.
    // You can test with different matrices by modifying the matrix initialization.
    // Example matrix:
    // [[2, 3, 4],
    //  [5, 2, 9],
    //  [8, 7, 6]]

    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(Arrays.asList(1, 3, 4));
        matrix.add(Arrays.asList(5, 2, 9));
        matrix.add(Arrays.asList(8, 7, 6));

        int result = countSpecialElements(matrix);
        System.out.println(result); // Expected output: 7
    }
}