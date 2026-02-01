package Array;

import java.util.Scanner;

public class DifferenceOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = scn.nextInt();
        }
        
        boolean isNegative = false;
        if (isSmaller(a2, a1)) {
            isNegative = true;
            int[] temp = a1;
            a1 = a2;
            a2 = temp;
        }

        int[] diff = new int[a2.length];
        int c = 0;

        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = diff.length - 1;

        while (k >= 0) {
            int d = 0;
            int a1v = i >= 0 ? a1[i] : 0;

            if (a2[j] + c >= a1v) {
                d = a2[j] + c - a1v;
                c = 0;
            } else {
                d = a2[j] + c + 10 - a1v;
                c = -1;
            }

            diff[k] = d;
            i--;
            j--;
            k--;
        }

        int idx = 0;
        while (idx < diff.length) {
            if (diff[idx] == 0) {
                idx++;
            } else {
                break;
            }
        }
        
        if (idx == diff.length) {
             System.out.println(0);
             return;
        }
        
        if (isNegative) {
            System.out.println("-");
        }

        while (idx < diff.length) {
            System.out.println(diff[idx]);
            idx++;
        }
        scn.close();
    }
    
    public static boolean isSmaller(int[] arr1, int[] arr2) {
        if (arr1.length < arr2.length) return true;
        if (arr1.length > arr2.length) return false;
        
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < arr2[i]) return true;
            if (arr1[i] > arr2[i]) return false;
        }
        return false;
    }
}
