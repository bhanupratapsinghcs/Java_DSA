package org.javaDSA.leetCode.DSAConcepts;

public class Recursion {

    public static void forLoop(int n){
        for (int i = 0; i < n; i++){
            System.out.println(i);
        }
        // output: 0 1 2 3 4
    }

    public static void forLoopUsingRecursion(int n){
        if(n < 0){
            return;
        }
        forLoopUsingRecursion(n-1);
        System.out.println(n);
        // output: 0 1 2 3 4 5
    }

    public static void forLoopUsingRecursionReverse(int n){
        if(n < 0){
            return;
        }
        System.out.println(n);
        forLoopUsingRecursionReverse(n-1);
        // output: 5 4 3 2 1 0
    }
    public static void forLoopUsingRecursionInReverse(int n, int i){
        if(i < 0){
            return;
        }
        System.out.println(i);
        forLoopUsingRecursionInReverse(n, i - 1);
        // output: 4 3 2 1 0
    }

    public static void forLoopUsingRecursion(int n, int i){
        if(i >= n){
            return;
        }
        System.out.println(i);
        forLoopUsingRecursion(n, i + 1);
        // output: 0 1 2 3 4
    }


    public static void main(String[] args) {
        System.out.println("Print numbers from 0 to n using for recursion:");
        forLoopUsingRecursion(5 - 1);
        System.out.println("Print numbers from 0 to n using for recursion with index:");
        forLoopUsingRecursion(5, 0);
        System.out.println("Print numbers from n to 0 using for recursion:");
        forLoopUsingRecursionReverse(5 - 1);
        System.out.println("Print numbers from n to 0 using for recursion with index:");
        forLoopUsingRecursionInReverse(5 - 1, 5 - 1);
        System.out.println("Print numbers from 0 to n using for loop:");
        forLoop(5);
    }
}
