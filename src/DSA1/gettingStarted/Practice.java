package DSA1.gettingStarted;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        int[] arr = new int[t];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//
//            for(int i = 0; i < arr.length; i++) {
//                if(Prime(arr[i])){
//                    System.out.println("Prime");
//                }else {
//                    System.out.println("Not Prime");
//                }
//            }
//            t--;

        int[] arr = {2,2,2,3,3,4,5,6};

        int occ = 1;
        for (int i = 1; i < arr.length; i++) {
            int ans = arr[i-1];
            int cur = arr[i];
            int prev = arr[i-1];
            if(cur != prev ){
                System.out.print(ans+ "-");
                System.out.println(occ);
                occ=1;
//                cur++;
            }else {
                occ++;
            }
        }
        System.out.print(arr[arr.length-1] + "-");
        System.out.println(occ);
    }
    public static boolean Prime(int n){
        for (int i = 2; i < n; i++) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
