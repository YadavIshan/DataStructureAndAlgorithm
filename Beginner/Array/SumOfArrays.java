package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArrays {
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
        int[] sumArr = sumOfArray(arr, brr);
        System.out.println("Sum of array : " + Arrays.toString(sumArr));
        scn.close();
    }

    public static int[] sumOfArray(int[] arr, int[] brr) {
        int[] sumArr = new int[Math.max(arr.length, brr.length) + 1];
        int i = arr.length - 1;
        int j = brr.length - 1;
        int k = sumArr.length - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += arr[i];
            }
            if (j >= 0) {
                sum += brr[j];
            }
            sumArr[k] = sum % 10;
            carry = sum / 10;
            i--;
            j--;
            k--;
        }
        return sumArr;
    }
}
