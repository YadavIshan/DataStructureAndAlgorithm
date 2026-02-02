package Array.TwoD_Array;

import java.util.Scanner;

public class WaveDisplay {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter rows:");
        int n = scn.nextInt();
        System.out.println("Enter cols:");
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        System.out.println("Wave Display:");
        for (int j = 0; j < arr[0].length; j++) {
            if (j % 2 == 0) {
                // For even cols
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i][j]);
                }
            } else {
                // For odd cols
                for (int i = arr.length - 1; i >= 0; i--) {
                    System.out.println(arr[i][j]);
                }
            }
        }
        scn.close();
    }
}
