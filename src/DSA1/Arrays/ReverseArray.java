package DSA1.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        reverse(arr);
    }
    public static void reverse(int[] a){
     //   int left = 0;
        int right = a.length-1;

        for(int i = 0; i<a.length/2; i++){
            int temp = a[i];
            a[i] = a[right];
            a[right] = temp;
            right--;
        }

      //  System.out.println(Arrays.toString(a));
    }
}
