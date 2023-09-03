package DSA1.Recursion_And_Backtracking;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
       int ans = PowerL(x,n);
        System.out.println(ans);
    }
    static int PowerL(int x, int n){
        if(n==0){
            return 1;
        }
        int xnm1 = PowerL(x,n-1);
        int xn = xnm1 * x;
        return xn;
//        if(n == 0){
//            return 1;
//        }
//        return PowerL(x,n-1)*x;

    }
}
