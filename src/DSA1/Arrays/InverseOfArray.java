package DSA1.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InverseOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int[] inv = inverse(arr);
        System.out.println(Arrays.toString(inv));
    }

    public static int[] inverse(int[] a){
        int[] inv = new int[a.length];
        for (int i = 0 ; i < inv.length; i++){
            inv[a[i]] = i;
        }
        return inv;
    }
}
