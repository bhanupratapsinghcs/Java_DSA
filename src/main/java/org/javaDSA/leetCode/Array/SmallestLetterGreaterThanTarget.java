package org.javaDSA.leetCode.Array;

public class SmallestLetterGreaterThanTarget {
    public static char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] <= target) {
                left = mid + 1; // Move to the right half
            } else {
                right = mid - 1; // Move to the left half
            }
        }
        // If left is out of bounds, return the first element
        if (left == letters.length) {
            return letters[0];
        }
        return letters[left]; // Return the smallest letter greater than target
    }

    public static char nextGreaterLetter(char[] letters, char target){
        int n = letters.length;
        for (char letter : letters) {
            if (letter > target) {
                return letter;
            }
        }
        return letters[0];
    }

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';
        System.out.println("Next greatest letter: " + nextGreatestLetter(letters, target)); // Output: c
    }
}
