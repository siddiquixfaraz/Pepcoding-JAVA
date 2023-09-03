package DSA1.Arrays;

public class SpanArrays {
    public static void main(String[] args){
        int[] arr = {15,30,40,4,11,9};
        int minElm = arr[0];
        int maxELm = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(minElm>arr[i]){
                minElm = arr[i];
            }
            if(maxELm<arr[i]){
                maxELm = arr[i];
            }
        }

        int ans = maxELm - minElm;
        System.out.println(ans);

    }
}
