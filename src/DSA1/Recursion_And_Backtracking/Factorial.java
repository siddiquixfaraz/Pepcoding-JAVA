package DSA1.Recursion_And_Backtracking;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
         int ans = fact(n);
        System.out.println(ans);
    }
    public static int fact(int n){
      if(n == 1){
          return 1;
      }
       return n * fact(n-1);
    }
}
