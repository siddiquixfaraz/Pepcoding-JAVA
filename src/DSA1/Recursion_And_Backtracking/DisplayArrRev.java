package DSA1.Recursion_And_Backtracking;

import java.util.Scanner;

public class DisplayArrRev {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        displayArrRev( arr, 0);
    }

    private static void displayArrRev(int[] arr, int i) {
        if(i == arr.length){
            return;
        }
        displayArrRev(arr,i+1);
        System.out.println(arr[i]);
    }
}
