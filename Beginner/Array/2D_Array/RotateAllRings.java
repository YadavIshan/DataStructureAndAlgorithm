package Array.TwoD_Array;

import java.util.Scanner;

public class RotateAllRings {
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
        
        System.out.println("Enter rotations (k):");
        int k = scn.nextInt();

        System.out.println("Rotating All Rings:");
        // Loop through all shells
        int minDimension = Math.min(n, m);
        int totalRings = minDimension / 2;

        for (int s = 1; s <= totalRings; s++) {
            shellRotate(arr, s, k);
        }

        print(arr);
        scn.close();
    }

    public static void shellRotate(int[][] arr, int s, int k){
        int[] oneDArray = fillOneDArray(arr, s);
        rotate(oneDArray, k);
        fillShell(arr, s, oneDArray);
    }

    public static int[] fillOneDArray(int[][] arr, int s){
        int minRow = s - 1;
        int minCol = s - 1;
        int maxRow = arr.length - s;
        int maxCol = arr[0].length - s;
        
        int size = 2 * (maxRow - minRow + maxCol - minCol);
        if(size == 0) size = 1;
        
        int[] oneD = new int[size];
        int idx = 0;

        for(int i = minRow; i <= maxRow && idx < size; i++){
            oneD[idx] = arr[i][minCol];
            idx++;
        }
        minCol++;

        for(int j = minCol; j <= maxCol && idx < size; j++){
            oneD[idx] = arr[maxRow][j];
            idx++;
        }
        maxRow--;

        for(int i = maxRow; i >= minRow && idx < size; i--){
            oneD[idx] = arr[i][maxCol];
            idx++;
        }
        maxCol--;

        for(int j = maxCol; j >= minCol && idx < size; j--){
            oneD[idx] = arr[minRow][j];
            idx++;
        }

        return oneD;
    }

    public static void fillShell(int[][] arr, int s, int[] oneD){
        int minRow = s - 1;
        int minCol = s - 1;
        int maxRow = arr.length - s;
        int maxCol = arr[0].length - s;
        
        int idx = 0;
        int size = oneD.length;

        for(int i = minRow; i <= maxRow && idx < size; i++){
            arr[i][minCol] = oneD[idx];
            idx++;
        }
        minCol++;

        for(int j = minCol; j <= maxCol && idx < size; j++){
            arr[maxRow][j] = oneD[idx];
            idx++;
        }
        maxRow--;

        for(int i = maxRow; i >= minRow && idx < size; i--){
            arr[i][maxCol] = oneD[idx];
            idx++;
        }
        maxCol--;

        for(int j = maxCol; j >= minCol && idx < size; j--){
            arr[minRow][j] = oneD[idx];
            idx++;
        }
    }

    public static void rotate(int[] oneD, int k){
        k = k % oneD.length;
        if(k < 0) k += oneD.length;

        reverse(oneD, 0, oneD.length - k - 1);
        reverse(oneD, oneD.length - k, oneD.length - 1);
        reverse(oneD, 0, oneD.length - 1);
    }

    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void print(int[][] arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
