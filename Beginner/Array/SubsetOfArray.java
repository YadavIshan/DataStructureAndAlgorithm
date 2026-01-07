package Array;

import java.util.Scanner;

public class SubsetOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        printAllSubsets(arr);
        scn.close();
    }

    public static void printAllSubsets(int[] arr) {
        int n = arr.length;
        int totalSubsets = (int) Math.pow(2, n);

        for (int i = 0; i < totalSubsets; i++) {
            System.out.print("{ ");

            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    System.out.print(arr[j] + " ");
                }
            }

            System.out.println("}");
        }
    }
}
