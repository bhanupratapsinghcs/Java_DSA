package org.javaDSA.leetCode.DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> pascalTriangle(int numRows){
        if(numRows <= 0){
            return new ArrayList<>();
        }
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    row.add(1); // The first and last elements of each row are always 1
                } else {
                   int value = triangle.get(i - 1).get(j - 1) + triangle.get(i -1).get(j);
                   row.add(value); // Each element is the sum of the two elements above it
                }
            }
            triangle.add(row); // Add the current row to the triangle
        }
        return triangle;
    }

    // Using recursion to generate Pascal's Triangle
    public static List<List<Integer>> generatePascalTriangle(int numRows){
        if(numRows <= 0){
            return new ArrayList<>();
        }
        if(numRows == 1){
            List<List<Integer>> triangle = new ArrayList<>();
            List<Integer> firstRow = new ArrayList<>();
            firstRow.add(1);
            triangle.add(firstRow);
            return triangle;
        }
        List<List<Integer>> triangle = generatePascalTriangle(numRows - 1);
        List<Integer> lastRow = triangle.getLast();
        List<Integer> newRow = new ArrayList<>();
        newRow.add(1); // The first element is always 1
        for(int j = 1; j < lastRow.size(); j++){
            newRow.add(lastRow.get(j - 1) + lastRow.get(j)); // Each element is the sum of the two elements above it
        }
        newRow.add(1); // The last element is always 1
        triangle.add(newRow); // Add the new row to the triangle
        return triangle;
    }


    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> triangle = pascalTriangle(numRows);
        for (int i = 0; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                System.out.print(triangle.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
