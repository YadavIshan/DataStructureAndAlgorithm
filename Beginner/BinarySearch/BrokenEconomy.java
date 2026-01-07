package BinarySearch;

import java.util.Scanner;

public class BrokenEconomy {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        System.out.println(brokenEconomy(arr, target));
        scn.close();
    }

    public static String brokenEconomy(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int floor = -1, ceil = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                floor = ceil = mid;
                break;
            } else if (arr[mid] < target) {
                floor = mid;
                left = mid + 1;
            } else {
                ceil = mid;
                right = mid - 1;
            }
        }

        return floor + " " + ceil;
    }
}
