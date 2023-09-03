package DSA1.Recursion_And_Backtracking;

import java.util.Scanner;

public class TOH {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        char tid1 = 'A';
        char tid2 = 'B';
        char tid3 = 'C';
        towerOfHanoi(n,tid1,tid2,tid3);
    }
    static void towerOfHanoi(int n,char tid1,char tid2,char tid3){
        if(n == 0){
            return;
        }
        towerOfHanoi(n-1,tid1,tid3,tid2);
        System.out.println("Move"+n+"["+ tid1 + "-->" + tid2 + "]");
        towerOfHanoi(n-1,tid3,tid2,tid1);
    }

}
