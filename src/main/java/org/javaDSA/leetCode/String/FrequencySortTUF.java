package org.javaDSA.leetCode.String;

public class FrequencySortTUF {
    public static void main(String[] args) {
        String s = "aaccbbb";
        System.out.println(frequencySortOptimised(s));
    }

    private static String frequencySort(String s) {
        java.util.Map<Character, Integer> frequencyMap = new java.util.HashMap<>();
        for(char c : s.toCharArray()){
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        java.util.List<Character> characters = new java.util.ArrayList<>(frequencyMap.keySet());
        characters.sort((a, b) -> Integer.compare(frequencyMap.get(b), frequencyMap.get(a)));
        StringBuilder stringBuilder = new StringBuilder();
        for(char c : characters){
            int count = frequencyMap.get(c);
            for(int i = 0; i < count; i++){
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
    private static String frequencySortOptimised(String s){
        int[] charCount = new int[128];
        for(char c : s.toCharArray()){
            charCount[c]++;
        }
        java.util.List<Character> characters = new java.util.ArrayList<>();
        for(int i = 0; i < charCount.length; i++){
            int count = charCount[i];
            if(count > 0){
                characters.add((char) i);
                System.out.println((char) i);
            }
        }
        characters.sort((a, b) -> Integer.compare(charCount[b], charCount[a]));
        StringBuilder result = new StringBuilder();
        for(char c: characters){
            int count = charCount[c];
            for(int i = 0; i < count; i++){
                result.append(c);
            }
        }
        return result.toString();
    }
}
