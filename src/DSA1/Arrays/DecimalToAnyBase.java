package DSA1.Arrays;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        int n = 34223450;
        int b = 2;

        while (n >= 0){
            int dividend = n;
            int rem = dividend % b;
            System.out.println(rem);
            dividend = n /b ;
        }
    }
}
