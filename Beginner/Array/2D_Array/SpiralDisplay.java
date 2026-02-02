package Array.TwoD_Array;

import java.util.Scanner;

public class SpiralDisplay {
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

        // Spiral Display Logic
        // 4 pointer approach (minRow, maxRow, minCol, maxCol)
        int minRow = 0;
        int minCol = 0;
        int maxRow = arr.length - 1;
        int maxCol = arr[0].length - 1;

        int totalElements = n * m;
        int count = 0;

        System.out.println("Spiral Order:");
        while (count < totalElements) {
            for (int i = minRow; i <= maxRow && count < totalElements; i++) {
                System.out.println(arr[i][minCol]);
                count++;
            }
            minCol++;

            for (int j = minCol; j <= maxCol && count < totalElements; j++) {
                System.out.println(arr[maxRow][j]);
                count++;
            }
            maxRow--;

            for (int i = maxRow; i >= minRow && count < totalElements; i--) {
                System.out.println(arr[i][maxCol]);
                count++;
            }
            maxCol--;

            for (int j = maxCol; j >= minCol && count < totalElements; j--) {
                System.out.println(arr[minRow][j]);
                count++;
            }
            minRow++;
        }
        scn.close();
    }
}


