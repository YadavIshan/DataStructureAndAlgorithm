package Array;

import java.util.Scanner;

public class InverseOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        inverseOfArray(arr);
        System.out.print("Inverse array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        scn.close();
    }

    public static void inverseOfArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                int current = i;
                int value = arr[i];

                while (arr[value] >= 0) {
                    int nextValue = arr[value];
                    arr[value] = -current - 1;
                    current = value;
                    value = nextValue;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -(arr[i] + 1);
        }
    }
}
