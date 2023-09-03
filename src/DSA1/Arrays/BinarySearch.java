package DSA1.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,6,7,8,10};
        int target = 5;

        int ans = binary_Search(arr,target);
        System.out.println(ans);
    }
    public static int binary_Search(int[] arr, int target) {

        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return arr[mid];
            } else if (target < arr[mid]) {
                end = mid -1;
            }else {
                start = mid + 1;
            }
        }
        return arr[start];
    }
}
