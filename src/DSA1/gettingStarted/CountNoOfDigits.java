package DSA1.gettingStarted;

import java.util.Scanner;

public class CountNoOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int count=0;
        while(no != 0){
            no = no/10;
            count++;
        }

        System.out.println(count);
    }
}
