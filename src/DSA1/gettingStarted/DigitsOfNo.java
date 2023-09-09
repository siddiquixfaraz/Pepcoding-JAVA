package DSA1.gettingStarted;

public class DigitsOfNo {
    public static void main(String[] args) {
        int n = 809979798;
        int count = countNo(n);
        int[] arr = new int[count];


        for (int i = arr.length-1; i >= 0 ; i--) {
            int rem = n % 10;
            arr[i] = rem;
            n = n/10;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static  int countNo(int n){
        int count  = 0;
        while (n != 0){
            n= n/10;
            count++;
        }

        return count;
    }
}
