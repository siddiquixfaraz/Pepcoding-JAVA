package DSA1.Recursion_And_Backtracking;

import java.util.Scanner;

public class PowerLog {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int ans = powerLog(x,n);
        System.out.println(ans);
    }
    static int powerLog(int x,int n){
        if(n==0){
            return 1;
        }
        int fnb2 = powerLog(x,n/2);
        int fn = fnb2 * fnb2;
        if(n%2 == 1){
            fn = fn * x;
        }
        return fn;
//        if(n==0){
//            return 1;
//        }
//        int fnb2 = powerLog(x,n/2) * powerLog(x,n/2);
//        if(n%2 ==1){
//            fnb2 = fnb2 * x;
//        }
//        return fnb2;
    }
}
