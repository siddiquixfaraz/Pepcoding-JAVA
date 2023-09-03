package DSA1.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        rotate(arr,k);
    }

    public static void rotate(int[] a , int k){
        k = k % a.length; // imp
        if(k < 0){
            k =  a.length + k ;
        }

        reverse(a, 0, a.length-k-1);
        reverse(a,a.length-k,a.length-1);
        reverse(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    public static void reverse(int[] a, int l , int r){
        while(r > l){
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }
    // method 1 slow run time error
    /*public static  void rotate(int[] a, int k){
        if(k < 0){
           k =  a.length + k ;
        }
         k = k % a.length;

        int[] ans = new int[a.length];

        int idx = a.length - k;

        for (int i = 0; i < k; i++) {
            ans[i] = a[idx];
            idx++;
        }
        int idx1 = 0;
        for (int i = k; i < ans.length ; i++) {
            ans[i] = a[idx1];
            idx1++;
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = ans[i];
        }

        System.out.println(Arrays.toString(a));
    }*/
}
