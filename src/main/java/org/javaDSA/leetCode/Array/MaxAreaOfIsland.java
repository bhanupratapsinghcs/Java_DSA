package org.javaDSA.leetCode.Array;

public class MaxAreaOfIsland {
    // Time Complexity: O(m * n), where m is the number of rows and n is the number of columns in the grid.
    // Space Complexity: O(m * n) for the visited array in the worst case.
    public static int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int maxArea = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    int area = dfs(grid, visited, i, j);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
    }

    private static int dfs(int[][] grid, boolean[][] visited, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length ||
            grid[i][j] == 0 || visited[i][j]) {
            return 0;
        }

        visited[i][j] = true;

        int area = 1; // Count the current cell
        area += dfs(grid, visited, i - 1, j); // Up
        area += dfs(grid, visited, i + 1, j); // Down
        area += dfs(grid, visited, i, j - 1); // Left
        area += dfs(grid, visited, i, j + 1); // Right

        return area;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };
        System.out.println("Max Area of Island: " + maxAreaOfIsland(grid)); // Output: Max Area of Island: 5
    }
}
