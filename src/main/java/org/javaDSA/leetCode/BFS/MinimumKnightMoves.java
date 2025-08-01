package org.javaDSA.leetCode.BFS;

public class MinimumKnightMoves {
    public static int minKnightMoves(int x, int y) {
        // Convert to 0-indexed coordinates
        x += 3;
        y += 3;

        // Directions for knight moves
        int[][] directions = {
            {2, 1}, {2, -1}, {-2, 1}, {-2, -1},
            {1, 2}, {1, -2}, {-1, 2}, {-1, -2}
        };

        // BFS queue
        java.util.Queue<int[]> queue = new java.util.LinkedList<>();
        queue.offer(new int[]{0, 0}); // Starting position
        boolean[][] visited = new boolean[7][7]; // Visited positions
        visited[0][0] = true;
        int steps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                if (current[0] == x && current[1] == y) {
                    return steps; // Found the target position
                }

                // Explore all possible knight moves
                for (int[] dir : directions) {
                    int newX = current[0] + dir[0];
                    int newY = current[1] + dir[1];

                    if (newX >= 0 && newX < 7 && newY >= 0 && newY < 7 && !visited[newX][newY]) {
                        visited[newX][newY] = true;
                        queue.offer(new int[]{newX, newY});
                    }
                }
            }
            steps++;
        }
        return -1; // Should never reach here for valid inputs
    }

    public static void main(String[] args) {
        System.out.println("Minimum knight moves to (1, 1): " + minKnightMoves(1, 1)); // Output: 2
    }
}
