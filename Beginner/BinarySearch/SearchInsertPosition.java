package BinarySearch;

import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter sorted array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.print("Enter target value: ");
        int target = scn.nextInt();

        int index = searchInsert(arr, target);
        System.out.println("Insert Position: " + index);
        scn.close();
    }

    public static int searchInsert(int[] arr, int target) {
        int start = 0 , end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2 ;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                end = mid - 1 ;
            }else{
                start = mid + 1;
            }
        }

        return start;
    }
}