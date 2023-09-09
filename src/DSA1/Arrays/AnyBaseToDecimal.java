package DSA1.Arrays;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        int n = 114;
        int b = 8;
        int ans = 0;
        int p = 0 ;
        while (n != 0){
            int rem = n % 10;
            ans = ans + rem * (int)Math.pow(b,p);
            p++;
            n=n/10;
        }
        System.out.println(ans);
    }
}
