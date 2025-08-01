package org.javaDSA.leetCode.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BestAverage {
    public static int bestAverageGrade(String[][] scores) {
        if (scores == null || scores.length == 0) return 0;
        // Map to store scores grouped by student name
        Map<String, List<Integer>> studentScores = new HashMap<>();

        // Group scores by student
        for (String[] entry : scores) {
            String name = entry[0];
            int score = Integer.parseInt(entry[1]);

            studentScores.putIfAbsent(name, new ArrayList<>());
            studentScores.get(name).add(score);
        }
        int bestAverage = Integer.MIN_VALUE;

        // Calculate average and track the best
        for (Map.Entry<String, List<Integer>> entry : studentScores.entrySet()) {
            List<Integer> marks = entry.getValue();
            int sum = 0;
            for (int mark : marks) {
                sum += mark;
            }
            int avg = (int) Math.floor(sum * 1.0 / marks.size());
            bestAverage = Math.max(bestAverage, avg);
        }

        return bestAverage;
    }

    public static void main(String[] args) {
        String[][] input = {
                {"Bobby", "87"},
                {"Charles", "100"},
                {"Eric", "64"},
                {"Charles", "22"}
        };

        System.out.println("Best Average Grade: " + bestAverageGrade(input));
    }
}
