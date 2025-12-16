package Array;

import java.util.Scanner;

public class FindIndexOfAnElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.print("Enter target element : ");
        int target = scn.nextInt();
        int index = findIndex(arr, target);
        System.out.print("Index of target element : ");
        System.out.println(index);
        scn.close();
    }

    public static int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
