package org.javaDSA.leetCode.String;


/**
 *  given a string s consisting of lowercase characters and an integer k,
 *  You have to count all possible substrings that have exactly k distinct characters.
 *  https://www.geeksforgeeks.org/problems/count-number-of-substrings4528/1#efficient-approach-using-sliding-window-method-on-time-and-o1-space
 */
public class CountKSubStringTUG_GFG {
    public static void main(String[] args) {
        String s = "abcbaa";
        int k = 3;
        System.out.println(countKSubStringOptimised(s, k));
    }

    private static int countKSubString(String s, int k) {
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            java.util.Set<Character> set = new java.util.HashSet<>();
            for(int j = i; j < s.length(); j++){
                set.add(s.charAt(j));
                if(set.size() == k){
                    count++;
                } else if (set.size() > k) {
                    break;
                }
            }
        }
        return count;
    }
    private static int countAtMost(String s, int k) {
        if (k <= 0) return 0;
        int count = 0, left = 0;
        java.util.Map<Character, Integer> freq = new java.util.HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
            while (freq.size() > k) {
                char lc = s.charAt(left++);
                freq.put(lc, freq.get(lc) - 1);
                if (freq.get(lc) == 0) freq.remove(lc);
            }
            count += right - left + 1; // count substrings ending at right with at most k distinct
        }
        return count;
    }

    private static int countKSubStringOptimised(String s, int k) {
        return countAtMost(s, k) - countAtMost(s, k - 1);
    }
}
