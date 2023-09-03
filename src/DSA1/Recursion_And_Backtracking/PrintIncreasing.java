package DSA1.Recursion_And_Backtracking;

import java.util.Scanner;

public class PrintIncreasing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printIncreasing(n);
    }
    public static void printIncreasing(int n){
        printIncreasing(n-1);
        System.out.println(n);
    }
}
