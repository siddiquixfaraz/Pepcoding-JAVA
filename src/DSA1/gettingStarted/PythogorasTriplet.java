package DSA1.gettingStarted;

import java.util.Scanner;

public class PythogorasTriplet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int max = a;
       if(b>=max){
            max = b;
        }if(c>= max){
            max=c;
        }

        if(max == a){
            if((a*a) == (b*b + c*c)){
                System.out.println("True");
            }else {
                System.out.println("False");
            }
        } else if (max == b) {
            if((b*b) == (a*a + c*c)){
                System.out.println("True");
            }else {
                System.out.println("False");
            }
        } else  {
            if((c*c) == (b*b + a*a)){
                System.out.println("True");
            }else {
                System.out.println("False");
            }
        }
    }
}
