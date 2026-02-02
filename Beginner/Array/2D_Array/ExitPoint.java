package Array.TwoD_Array;

import java.util.Scanner;

public class ExitPoint {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter rows:");
        int n = scn.nextInt();
        System.out.println("Enter cols:");
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        
        System.out.println("Enter elements (0 or 1):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        
        findExitPoint(arr, n, m);
        scn.close();
    }

    public static void findExitPoint(int[][] arr, int r, int c) {
        int i = 0;
        int j = 0;
        int dir = 0; // 0: East, 1: South, 2: West, 3: North
        
        while (true) {
            dir = (dir + arr[i][j]) % 4;
            
            if (dir == 0) { // East
                j++;
            } else if (dir == 1) { // South
                i++;
            } else if (dir == 2) { // West
                j--;
            } else if (dir == 3) { // North
                i--;
            }
            
            if (i < 0 || i >= r || j < 0 || j >= c) {
                break;
            }
        }
        
        
        if (i < 0) i++;
        else if (i >= r) i--;
        else if (j < 0) j++;
        else if (j >= c) j--;
        
        System.out.println("Exit Point: " + i + ", " + j);
    }
}
