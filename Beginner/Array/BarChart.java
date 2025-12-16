package Array;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        printBarChart(arr);
        scn.close();
    }

    public static void printBarChart(int[] arr) {
        int maxValue = findMaxValue(arr);
        for (int i = 1; i <= maxValue; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= maxValue - i + 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static int findMaxValue(int[] arr) {
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
