package org.javaDSA.leetCode.DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {
    public static List<Integer> getRow(int rowIndex){
        List<Integer> row = new ArrayList<>();
        for(int i = 0; i <= rowIndex; i++){
            row.add(1); // Initialize the row with 1s
            for(int j = i - 1; j > 0; j--){
                // Update the current element to be the sum of the two elements above it
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }
        return row;
    }

    public static void main(String[] args) {
        int rowIndex = 5;
        List<Integer> row = getRow(rowIndex);
        System.out.println("Row " + rowIndex + ": " + row);
    }
}
