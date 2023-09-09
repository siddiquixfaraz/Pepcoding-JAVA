package DSA1.gettingStarted;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        int n = 336;

        int cur = n, ans = 0;

        // Iterating while 'cur' > 0.
        while (cur > 0)
        {
            // 'd_0' gives us the digit at 'ones' place decimal notation of 'cur'.
            int d_0 = cur % 10;
            if (d_0 != 0)
            {
                // Incrementing 'ans' by 1 if current digit divides 'n' evenly.
                ans += ((n % d_0) == 0)?1:0;
            }
            cur /= 10;
        }
        System.out.println(ans);;
    }

}
