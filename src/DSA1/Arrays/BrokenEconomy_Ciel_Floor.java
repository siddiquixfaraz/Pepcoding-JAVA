package DSA1.Arrays;

import java.util.Scanner;

public class BrokenEconomy_Ciel_Floor {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();

        int start = 0;
        int end = arr.length-1;
        int floor = Integer.MAX_VALUE;
        int ceil = Integer.MIN_VALUE;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target > arr[mid] ){
                start = mid+1;
                ceil = arr[mid];
            }else if(target < arr[mid] ){
                end = mid - 1;
                floor = arr[mid];
            }else {
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
    }
}
