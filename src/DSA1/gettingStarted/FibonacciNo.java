package DSA1.gettingStarted;

public class FibonacciNo {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.println(first);
            int third = first + second;
            first= second;
            second= third;
        }
    }
}
