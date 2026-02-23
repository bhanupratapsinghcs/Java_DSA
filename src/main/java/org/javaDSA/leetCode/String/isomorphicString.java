package org.javaDSA.leetCode.String;

public class isomorphicString{
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        boolean result = isIsomorphic(s, t);
        System.out.println(result); // Output: true
    }

    private static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        java.util.Map<Character, Character> map = new java.util.HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char chS = s.charAt(i);
            char chT = t.charAt(i);
            if(map.containsKey(chS)){
                if(map.get(chS) != chT){
                    return false;
                }
            }else{
                if(map.containsValue(chT)){ // Check if the value is already mapped to another key
                    return false;
                }
                map.put(chS, chT);
            }
        }
        return true;

    }
}
