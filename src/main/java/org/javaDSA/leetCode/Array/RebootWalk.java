package org.javaDSA.leetCode.Array;

import java.util.Arrays;

public class RebootWalk {
    public static void main(String[] args) {
        String path = "UDLRUD";
        Integer[] finalPosition = walk(path);
        System.out.println("Final Position: " + Arrays.toString(finalPosition)); // Output: Final Position: [0, 0]
    }
        // Implements the walk method to compute final position of the robot
        public static Integer[] walk(String path) {
            int x = 0, y = 0; // starting position

            for (char ch : path.toCharArray()) {
                switch (ch) {
                    case 'U': y++; break;
                    case 'D': y--; break;
                    case 'L': x--; break;
                    case 'R': x++; break;
                    // Any other characters are ignored
                }
            }

            return new Integer[] {x, y};
        }

        // Helper method to check if two coordinates are equal
        public static boolean checkEqual(Integer[] a, Integer[] b) {
            return Arrays.equals(a, b);
        }
}
