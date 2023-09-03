package DSA1.Arrays;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();

        int first = binary_search(arr,target);
        int last = binary_search1(arr,target);

        System.out.println(first);
        System.out.println(last);


    }
    static int binary_search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ptans = -1;
        while (start <= end){
            int mid = start + (end - start)/2;

            if(target == arr[mid]){
                ptans = mid;
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return  ptans;
    }
    static int binary_search1(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ptans = -1;
        while (start <= end){
            int mid = start + (end - start)/2;

            if(target == arr[mid]){
                ptans = mid;
                start = mid + 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return  ptans;
    }
}
