package Array;

import java.util.Scanner;
//Rotate to right
//Approach : Divide in two half and reverse them , then reverse the whole array
//Approach 2 : use formula
//"Break where you rotate, Flip both pieces, Flip the whole"

public class RotateAnArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.print("Enter rotation : ");
        int rotation = scn.nextInt();
        rotateAnArray(arr, rotation);
        System.out.print("Rotated array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        scn.close();
    }

    // Right
    public static void rotateAnArray(int[] arr, int rotation) {
        int n = arr.length;
        rotation = rotation % n;
        if (rotation < 0) {
            rotation = rotation + n;
        }

        reverse(arr, 0, arr.length - 1 - rotation); // starting se last rotationth element ke peeche
        reverse(arr, arr.length - rotation, arr.length - 1); // last rotationth element se end tak
        reverse(arr, 0, arr.length - 1); // starting se end tak
    }

    // Left
    public static void rotateAnArrayLeft(int[] arr, int rotation) {
        int n = arr.length;
        rotation = rotation % n;
        if (rotation < 0) {
            rotation = rotation + n;
        }

        reverse(arr, 0, rotation - 1); // starting se rotationth element ke peeche
        reverse(arr, rotation, arr.length - 1); // rotationth element se end tak
        reverse(arr, 0, arr.length - 1); // starting se end tak
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
