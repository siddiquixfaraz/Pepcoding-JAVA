package DSA1.gettingStarted;

import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int size = size(n);

        k = k % size;
        if(k<0){
            k = size + k;
        }

        int div = 1;
        int mul = 1;
        for (int i = 0; i < size; i++) {
            if(i<k){
                div = div *10;
            }else {
                mul = mul*10;
            }
        }

        int rem = n % div;
        n = n/div ;
        n = n+ rem *mul;

        System.out.println(n);


    }

    static int size(int q){
        int count =0;
        while(q>0){
            q= q/10;
            count++;
        }
        return count;
    }
}
