package DSA1.gettingStarted;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {


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

}
