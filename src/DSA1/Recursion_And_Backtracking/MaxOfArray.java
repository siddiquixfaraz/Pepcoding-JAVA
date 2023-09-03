package DSA1.Recursion_And_Backtracking;

import java.util.Scanner;

public class MaxOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int max = maxElement(arr,0);
        System.out.println(max);
    }
    static int maxElement(int[] arr, int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int misa = maxElement(arr,idx+1);
        if(misa > arr[idx]){
            return misa;
        }else{
            return arr[idx];
        }
    }
}
