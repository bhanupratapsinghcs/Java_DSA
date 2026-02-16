package org.javaDSA.leetCode.DynamicProgramming;

public class MaxRepeatingSub {

    public static void main(String[] args) {
        String sequence = "ababc";
        String word = "ab";
        int result = maxRepeating(sequence, word);
        System.out.println("Maximum number of times '" + word + "' can be repeated in '" + sequence + "' is: " + result);
    }

    private static int maxRepeating(String sequence, String word) {
        int count = 0;
        StringBuilder sb = new StringBuilder();

        while (sb.length() < sequence.length()) {
            sb.append(word);
            if (sequence.startsWith(sb.toString())) {
                count++;
            } else {
                break;
            }
        }

        return count;
    }
}
