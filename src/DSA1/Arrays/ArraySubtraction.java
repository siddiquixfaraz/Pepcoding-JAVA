package DSA1.Arrays;

import java.util.Scanner;

public class ArraySubtraction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length ; i++) {
            arr1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length ; i++) {
            arr2[i] = scn.nextInt();
        }
        int[] sum = new int[n1];
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = sum.length-1;

        int c = 0;
        while(k >= 0){
            int d = 0;
            int valj = j >= 0 ? arr2[j] : 0;
            if(arr1[i]+c >= valj ){
                d = arr1[i]+c - valj;
                c= 0;
            }else{
                d = arr1[i] + c+10 - valj;
                c = -1;
            }

            sum[k] = d ;

            i--;
            j--;
            k--;
        }

        int idx = 0;
        while (idx < sum.length){
            if(sum[idx] == 0){
                idx++;
            }else break;
        }

        while (idx < sum.length){
            System.out.println(sum[idx]);
            idx++;
        }
    }
}
