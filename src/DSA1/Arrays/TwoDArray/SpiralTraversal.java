package DSA1.Arrays.TwoDArray;

import java.util.ArrayList;
import java.util.Scanner;

public class SpiralTraversal {
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        int m = scn.nextInt();
//        int[][] arr = new int[n][m];
//        for(int i = 0 ; i< arr.length; i++){
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = scn.nextInt();
//            }
//        }
//        int minr = 0;
//        int maxr = arr.length-1;
//        int minc = 0;
//        int maxc = arr[0].length-1;
//        int tne = n*m;
//        int count=0;
//        while(count<tne){
//            //for left_wall
//            for (int i = minr,j = minc; i <= maxr && count<tne; i++) {
//                System.out.println(arr[i][j]);
//                count++;
//            }
//            minc++;
//            //for bottom_wall
//            for (int i = maxr,j = minc; j <= maxc && count<tne; j++) {
//                System.out.println(arr[i][j]);
//                count++;
//            }
//            maxr--;
//            //for right_wall
//            for (int i = maxr,j = maxc; i >= minr && count<tne; i--) {
//                System.out.println(arr[i][j]);
//                count++;
//            }
//            maxc--;
//            //for top_wall
//            for (int i = minr,j = maxc; j >= minc && count<tne; j--) {
//                System.out.println(arr[i][j]);
//                count++;
//            }
//            minr++;
//        }
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int minr = 0;
        int minc = 0;
        int maxr = matrix.length-1;
        int maxc = matrix[0].length-1;
        int tne = matrix.length * matrix[0].length;
        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(count<tne){
            //for topwall
            for(int i = minr , j = minc ; j <= maxc && count < tne; j++){
                ans.add(matrix[i][j]);
                count++;
            }
            minr++;
            //for rightwall
            for(int i = minr , j = maxc ; j <= maxr && count < tne; i++){
                ans.add(matrix[i][j]);
                count++;
            }
            maxc--;
            //for bottomwall
            for(int i = maxr , j = maxc ; j >= minc && count < tne; j--){
                ans.add(matrix[i][j]);
                count++;
            }
            maxr--;
            //for leftwall
            for(int i = maxr , j = minc ; j >= minr && count < tne; i--){
                ans.add(matrix[i][j]);
                count++;
            }
            minc++;
        }
        System.out.println(ans);
    }
}
