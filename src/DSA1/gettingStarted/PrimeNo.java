package DSA1.gettingStarted;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        for(int i = 0; i < arr.length; i++) {
            if(Prime(arr[i])){
                System.out.println("Prime");
            }else {
                System.out.println("Not Prime");
            }
        }
    }

    public static boolean Prime(int n){
        for (int i = 2; i < n; i++) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
