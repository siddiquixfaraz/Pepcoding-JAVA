package DSA1.Arrays.TwoDArray;

import java.util.Scanner;

public class MatrixMul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] arr2 = new int[n][m];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        if(m!=x){
            System.out.println("Invalid Input");
            return;
        }

        int[][] ans = new int[n][y];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                for (int k = 0; k < m; k++) {
                    ans[i][j] = ans[i][j] + arr[i][k] * arr2[k][j];
                }
            }
        }
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {

                    System.out.print(ans[i][j]+" ");
            }
            System.out.println();

        }

    }
}
