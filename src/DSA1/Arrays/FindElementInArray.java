package DSA1.Arrays;

public class FindElementInArray {
    public static void main(String[] args) {
        int[] arr = {15,30,40,4,11,9};
        int target = 38;
        int ans = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target ){
                ans = i;
                break;
            }
        }

        System.out.println(ans);
    }
}
