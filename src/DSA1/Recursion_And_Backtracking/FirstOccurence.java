package DSA1.Recursion_And_Backtracking;

import java.util.Scanner;

public class FirstOccurence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int foc = firstOccurence(arr, 0,4);

        System.out.println(foc);
    }

    static int firstOccurence(int[] arr ,int idx, int num){
        if(idx == arr.length){
            return -1;
        }
        if(arr[idx] == num){
            return idx;
        }else{
            int fouins = firstOccurence(arr, idx+1,num);
            return fouins;
        }
    }
}
