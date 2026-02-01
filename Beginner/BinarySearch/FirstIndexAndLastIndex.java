package BinarySearch;

import java.io.*;
import java.util.*;

public class FirstIndexAndLastIndex {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        System.out.println("First Index: " + firstIndex(arr, target));
        System.out.println("Last Index: " + lastIndex(arr, target));
    }

    public static int firstIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int fi = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                fi = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return fi;
    }

    public static int lastIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int li = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                li = mid;
                start = mid + 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return li;
    }
}
