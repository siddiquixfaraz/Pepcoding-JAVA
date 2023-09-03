package DSA1.Recursion_And_Backtracking;

import java.util.Arrays;
import java.util.Scanner;

public class All_Indices {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }


        System.out.println(Arrays.toString(allIndices(arr,3,0,0)));


    }
    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        // write ur code here
        if(idx == arr.length){
            return new int[fsf];
        }
        if( arr[idx] == x){
            int[] arr1 = allIndices(arr,x, idx+1, fsf+1);
            arr1[fsf] = idx;
            return arr1;
        }else {
            int[] arr1 = allIndices(arr, x, idx + 1, fsf);
            return arr1;
        }
    }
}
