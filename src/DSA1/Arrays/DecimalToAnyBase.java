package DSA1.Arrays;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        int n = 76;
        int b = 8;
        int ans = 0;
        int p = 0;
        while (n > 0){
            int rem = n % b;
            ans = ans + rem * (int)Math.pow(10,p);
            n = n /b ;
            p++;
        }
        System.out.println(ans);
    }
}
