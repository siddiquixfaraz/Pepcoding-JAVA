package DSA1.Recursion_And_Backtracking;

import java.util.Scanner;

public class LastIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int loc = lastOccurence(arr, 0,4);

        System.out.println(loc);
    }
    static int lastOccurence(int[] arr,int idx,int data){
        if(idx == arr.length){
            return -1;
        }
        int liisa = lastOccurence(arr,idx+1,data);
        if ( liisa == -1){
            if(arr[idx] == data){
                return idx;
            }else{
                return -1;
            }
        }else {
            return liisa;
        }
    }
}
