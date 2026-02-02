package Array.TwoD_Array;


import java.util.Scanner;

public class DiagonalDisplay {
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
        
        System.out.println("Diagonal Display:");
        //(Upper Triangle Diagonals)
        for(int c = 0 ; c < arr[0].length ; c++){
            int i = 0;
            int j = c;
            while(i < arr.length && j < arr[0].length){
                System.out.print(arr[i][j] + " ");
                i++;
                j++;
            }
        }
        System.out.println();
        
        //Lower Triangle Diagonals
        for(int r = 1 ; r < arr.length ; r++){
            int i = r;
            int j = 0;
            while(i < arr.length && j < arr[0].length){
                System.out.print(arr[i][j] + " ");
                i++;
                j++;
            }
        }
        scn.close();
    }
}
