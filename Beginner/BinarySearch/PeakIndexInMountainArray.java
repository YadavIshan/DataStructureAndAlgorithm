package BinarySearch;

import java.util.Scanner;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        // Example: {0, 1, 0} -> Peak is 1
        // Example: {0, 2, 1, 0} -> Peak is 1
        // Example: {0, 10, 5, 2} -> Peak is 1
        // Example: {1, 3, 5, 4, 2} -> Peak is 2 (val 5)
        
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements (must be mountain shape): ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        
        System.out.println("Peak Index: " + peakIndexInMountainArray(arr));
        scn.close();
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start; 
    }
}
