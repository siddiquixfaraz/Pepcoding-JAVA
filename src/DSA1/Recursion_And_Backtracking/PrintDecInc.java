package DSA1.Recursion_And_Backtracking;

import java.util.Scanner;

public class PrintDecInc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Pdi(n);
    }
    public static void Pdi(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        Pdi(n-1);
        System.out.println(n);
    }
}
