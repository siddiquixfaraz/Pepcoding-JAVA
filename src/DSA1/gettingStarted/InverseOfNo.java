package DSA1.gettingStarted;

public class InverseOfNo {
    public static void main(String[] args) {
        int num = 613254;
        int temp = num;
        int inverse  = 0;
        for (int i = 1; i <= 6 ; i++) {
            int rem = temp % 10;
            inverse = inverse + i *((int)Math.pow(10,rem-1));
            temp = temp/10;
        }
        System.out.println(inverse);
    }
}
