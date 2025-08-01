package org.javaDSA.leetCode.DynamicProgramming;


import java.util.*;

public class ShrunkArray {

    public static List<String> getShrunkArray(List<String> inputArray, int burstLength) {
        boolean changed = true;

        while (changed) {
            changed = false;
            List<String> result = new ArrayList<>();
            int i = 0;
            while (i < inputArray.size()) {
                int j = i + 1;
                while (j < inputArray.size() && inputArray.get(j).equals(inputArray.get(i))) {
                    j++;
                }
                if (j - i >= burstLength) {
                    changed = true; // we found a burst, so we will shrink and repeat
                } else {
                    for (int k = i; k < j; k++) {
                        result.add(inputArray.get(k));
                    }
                }
                i = j;
            }
            inputArray = result;
        }

        return inputArray;
    }

    public static void main(String[] args) {
        List<String> inputArray = Arrays.asList("a", "b", "c", "c", "c", "d", "e", "e");
        int burstLength = 3;

        List<String> shrunkArray = getShrunkArray(inputArray, burstLength);
        System.out.println("Shrunk Array: " + shrunkArray); // Output: [a, b, d, d]

        inputArray = Arrays.asList("a", "b", "c", "d", "e", "e", "e", "e", "d", "d", "c", "b", "f", "g","f");
        burstLength = 3;
        shrunkArray = getShrunkArray(inputArray, burstLength);
        System.out.println("Shrunk Array: " + shrunkArray); // Output: [a, b, c, d, e, f, g, f]
    }
}


// Sushant's Code
//public class Test4 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        List<Character> a = new ArrayList<Character>();
//
//        for (int i = 0;i < 15; i++){
//            char m = sc.next().charAt(0);
//            a.add(m);
//
//        }
//        int k = 3;
//
//        while(true){
//
//
//            int t = a.size();
//
//
//            List<Character> c = new ArrayList<Character>();
//
//            int i = 0;
//            int j = 0;
//            int p = 0;
//            while(j < t){
//                if(i == j){
//                    j += 1;
//                    p = 1;
//                }
//                else{
//                    if (a.get(i) == a.get(j)){
//                        j += 1;
//                        p += 1;
//                    }
//                    else if (p >= k){
//                        while(i != j){
//                            i += 1;
//                        }
//                        p = 0;
//                    }
//                    else{
//                        c.add(a.get(i));
//                        i += 1;
//                    }
//
//                }
//            }
//
//            if (p < k){
//                while(i < t){
//                    c.add(a.get(i));
//                    i += 1;
//                }
//            }
//
//            if(c.equals(a)){
//                break;
//            }
//            else{
//                a = c;
//            }
//        }
//
//        for(Character ch : a){
//            System.out.println(ch);
//        }
//    }
//}

//private static List<String> getShrunkArray2Wrong(List<String> inputArray, int burstLength){
//    List<String> result = new ArrayList<>();
//    int n = inputArray.size();
//    if(n == 1){
//        result.add(inputArray.get(0));
//        return result;
//    }
//    int burstCounter = 1;
//    int sameAsPrevious = 0;
//    for(int i = 1; i < n; i++){
//        String previousString = inputArray.get(i-1);
//        String currentString = inputArray.get(i);
//        if( previousString.equals(currentString)){
//            if(burstCounter < burstLength){
//                result.add(currentString);
//                burstCounter++;
//            }
//        }else{
//            result.add(currentString);
//            burstCounter++;
//        }
//    }
//    return result;
//}
