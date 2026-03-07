package org.javaDSA.leetCode.String;

public class BeautySumTUF {
    public static void main(String[] args) {
        String s = "aabcb";
        System.out.println(beautySum(s));
    }

    private static int beautySumOptimise(String s) {
        int beautySum = 0;
        for(int i = 0; i < s.length(); i++){
            int[] frequency = new int[26];
            for(int j = i; j < s.length(); j++){
                frequency[s.charAt(j) - 'a']++;
                int maxFreq = 0, minFreq = Integer.MAX_VALUE;
                for(int freq: frequency){
                    if(freq > 0){
                        maxFreq = Math.max(maxFreq, freq);
                        minFreq = Math.min(minFreq, freq);
                    }
                }
                beautySum += maxFreq - minFreq;
            }
        }
        return beautySum;
    }

    private static int beautySum(String s) {
        int beautySum = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                String subString = s.substring(i, j + 1);
                beautySum += beautySumOfSubString(subString);
            }
        }
        return beautySum;
    }

    private static int beautySumOfSubString(String s) {
        java.util.Map<Character, Integer> frequency = new java.util.HashMap<>();
        for(char c: s.toCharArray()){
            frequency.put(c, frequency.getOrDefault(c, 0) +1);
        }
        int maxFreq = 0, minFreq = 501;
        for(int freq: frequency.values()){
            maxFreq = Math.max(maxFreq, freq);
            minFreq = Math.min(minFreq, freq);
        }
        return maxFreq - minFreq;
    }
}
