package Array;

import java.util.Scanner;

public class SubtractionOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size first array : ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter first array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.print("Enter size second array : ");
        int m = scn.nextInt();
        int[] brr = new int[m];
        System.out.print("Enter second array elements : ");
        for (int i = 0; i < m; i++) {
            brr[i] = scn.nextInt();
        }
        int[] subArr = subtractionOfArray(arr, brr);
        System.out.print("Subtraction of array : ");

        int idx = 0;
        while (idx < subArr.length && subArr[idx] == 0) {
            idx++;
        }

        if (idx == subArr.length) {
            System.out.println(0);
        } else {
            for (int i = idx; i < subArr.length; i++) {
                System.out.print(subArr[i]);
            }
            System.out.println();
        }
        scn.close();
    }

    public static int[] subtractionOfArray(int[] arr, int[] brr) {
        if (brr.length > arr.length) {
            int[] temp = arr;
            arr = brr;
            brr = temp;
        } else if (arr.length == brr.length) {
            for (int i = 0; i < arr.length; i++) {
                if (brr[i] > arr[i]) {
                    int[] temp = arr;
                    arr = brr;
                    brr = temp;
                    break;
                } else if (brr[i] < arr[i]) {
                    break;
                }
            }
        }

        int[] subArr = new int[arr.length];
        int i = arr.length - 1;
        int j = brr.length - 1;
        int k = subArr.length - 1;
        int borrow = 0;

        while (k >= 0) {
            int digit1 = arr[i];
            int digit2 = (j >= 0) ? brr[j] : 0;
            int diff = digit1 - digit2 - borrow;

            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }

            subArr[k] = diff;
            i--;
            j--;
            k--;
        }

        return subArr;
    }
}
