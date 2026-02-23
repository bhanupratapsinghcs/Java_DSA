package org.javaDSA.leetCode.Array;
// https://leetcode.com/problems/island-perimeter/description/?envType=problem-list-v2&envId=array
public class IsIslandPerimeter {

    public static void main(String[] args) {
        int[][] grid = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };
        int result = islandPerimeter(grid);
        System.out.println(result);
    }



    private static int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int perimeter = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if( grid[i][j] == 0){
                    continue;
                }
                // Check up
                if( i - 1 < 0 || grid[i - 1][j] == 0){
                    perimeter++;
                }
                // Check down
                if( i + 1 >= n || grid[i + 1][j] == 0){
                    perimeter++;
                }
                // Check left
                if( j - 1 < 0 || grid[i][j - 1] == 0){
                    perimeter++;
                }
                // Check right
                if( j + 1 >= m || grid[i][j + 1] == 0) {
                    perimeter++;
                }

            }
        }
        return perimeter;
    }
    private static int islandPerimeterUsingDFS(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    return dfs(grid, i, j);
                }
            }
        }
        return 0;
    }

    private static int dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length) {
            return 1;
        }
        if (grid[i][j] == 0) {
            return 1;
        }
        if (grid[i][j] == -1) {
            return 0;
        }
        grid[i][j] = -1; // Mark as visited
        int perimeter = 0;
        perimeter += dfs(grid, i - 1, j); // Up
        perimeter += dfs(grid, i + 1, j); // Down
        perimeter += dfs(grid, i, j - 1); // Left
        perimeter += dfs(grid, i, j + 1); // Right
        return perimeter;
    }
}
