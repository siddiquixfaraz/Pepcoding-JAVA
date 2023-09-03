package DSA1.gettingStarted;

import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int tn1 = n1;
        int tn2 = n2;
        while (n2 % n1 != 0){
           int rem = n2 % n1 ;
           n1 = rem ;
           n2 = n1;
        }
        int gcd = n1;
        int lcm = (tn1 * tn2)/gcd;

        System.out.println("gcd " + gcd);
        System.out.println("lcm " + lcm);
    }
}
