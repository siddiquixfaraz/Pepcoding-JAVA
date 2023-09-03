package DSA1.Stack_And_Queue;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length-1]);
        nge[arr.length-1] = -1;

        for(int i = arr.length-2 ; i>= 0 ; i--){
            while ( st.size()>0 && arr[i] >= st.peek()  ){
                st.pop();
            }
            if( st.size() == 0){
                nge[i] = -1;
            }else{
                nge[i] = st.peek();
            }

            st.push(arr[i]);
        }

        System.out.println(Arrays.toString(nge));
    }
}
